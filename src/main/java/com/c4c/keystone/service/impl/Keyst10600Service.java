package com.c4c.keystone.service.impl;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0400;
import com.c4c.keystone.entity.Keyst0400ExtraS01;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0400Mapper;
import com.c4c.keystone.service.IKeyst10600Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Log4j2
public class Keyst10600Service implements IKeyst10600Service {

    @Autowired
    Keyst0400Mapper keyst0400Mapper;

    @Autowired
    protected MessageSource messageSource;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    EntityUtil entityUtil;

    @Override
    public Keyst10600InitS initialize() {
        Keyst10600InitS resForm  = new Keyst10600InitS();

        List<Keyst0400ExtraS01> keyst0400ExtraS01List = keyst0400Mapper.selectWithS01();

        // お知らせ登録日時の降順で並び替える。
        keyst0400ExtraS01List = keyst0400ExtraS01List.stream()
                .sorted(Comparator.comparing(Keyst0400ExtraS01::getNotificationRegDatetime, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // 検索結果全件に対して以下の処理をする。
        List<Keyst10600InitS01> keyst10600InitS01List = new ArrayList<>(); // スキルシート情報一覧
        for (Keyst0400ExtraS01 keyst0400ExtraS01 : keyst0400ExtraS01List) {
            Keyst10600InitS01 tempInitS04 = new Keyst10600InitS01();
            BeanUtils.copyProperties(keyst0400ExtraS01, tempInitS04);

            // 掲載終了日が今日以前の場合
            LocalDate today = LocalDate.now();
            if (keyst0400ExtraS01.getPostEndDate().isBefore(today)) {
                tempInitS04.setExpiredFlag(Flag.ON);
            } else {
                tempInitS04.setExpiredFlag(Flag.OFF);
            }
            keyst10600InitS01List.add(tempInitS04);
        }

        resForm.setNotificationInfoList(keyst10600InitS01List);

        return resForm;
    }

    @Override
    public Keyst10600SaveS save(String jwt, Keyst10600SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // リクエストFormをお知らせEntityに移送する。
        Keyst0400 keyst0400 = new Keyst0400();
        BeanUtils.copyProperties(reqForm, keyst0400);

        // お知らせEntityに以下の値を設定する。
        keyst0400.setNotificationRegId(loginUserId); // お知らせ登録者ID
        keyst0400.setNotificationRegDatetime(LocalDateTime.now()); // お知らせ登録日時
        // INSERT時の共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst0400, loginUserId);
        // INSERTを実行する。
        keyst0400Mapper.insert(keyst0400);

        return new Keyst10600SaveS();
    }

    @Override
    public Keyst10600UpdateS update(String jwt, Keyst10600UpdateQ reqForm) {
        return null;
    }
}
