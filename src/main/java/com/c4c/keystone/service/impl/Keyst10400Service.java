package com.c4c.keystone.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100ExtraS01;
import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10400FilteringS;
import com.c4c.keystone.form.Keyst10400InitS;
import com.c4c.keystone.form.Keyst10400InitS01;
import com.c4c.keystone.form.Keyst10400InitS02;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.IKeyst10400Service;
import com.c4c.keystone.utils.JwtUtil;

@Service
public class Keyst10400Service implements IKeyst10400Service {

    @Autowired
    Keyst5100Service keyst5100Service;
    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @Autowired
    JwtUtil jwtUtil;

    @Override
    public List<Keyst10400InitS> initialize(String jwt) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // レスポンスFormリストを定義する。
        List<Keyst10400InitS> resFormList = new ArrayList<>();

        // ユーザー一覧画面に必要な情報をデータベースから全件取得する。
        List<Keyst0100ExtraS01> keyst0100ExtraS01List  = keyst0100Mapper.selectWithS01();
        // スキルマスタ取得
        List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();

        // ユーザーごとに処理を行う。
        for (Keyst0100ExtraS01 keyst0100ExtraS01 : keyst0100ExtraS01List) {
            // レスポンスFormに同じユーザーが存在するかを判定するフラグを定義する。(true: 存在する、false: 存在しない)
            Boolean userExistsFlg = false;
            // レスポンスFormリストが空ではない場合
            if (resFormList != null && resFormList.size() != 0) {
                // レスポンスFormリストを1件ずつチェック
                for (Keyst10400InitS checkResForm : resFormList) {
                    // レスポンスFormに同じユーザーが存在する場合
                    if (checkResForm.getUserId().equals(keyst0100ExtraS01.getUserId())) {
                        // 案件情報リストに追加する。
                        Keyst10400InitS02 initS02 = new Keyst10400InitS02();
                        initS02.setPrjCode(keyst0100ExtraS01.getPrjCode());
                        initS02.setPrjName(keyst0100ExtraS01.getPrjName());
                        initS02.setContractPrice(keyst0100ExtraS01.getContractPrice());
                        initS02.setPrjStartDate(keyst0100ExtraS01.getPrjStartDate());
                        initS02.setPrjEndDate(keyst0100ExtraS01.getPrjEndDate());
                        checkResForm.getPrjInfoList().add(initS02);

                        userExistsFlg = true;
                        break;
                    }
                }
            }

            // レスポンスFormに同じユーザーが存在しない場合
            if (!userExistsFlg) {
                // レスポンスFormを定義する。
                Keyst10400InitS resForm = new Keyst10400InitS();
                // 取得した情報をレスポンスFormにコピーする。(リストやオブジェクトはコピーできない為、スキルリストと案件情報は別で取得する)
                BeanUtils.copyProperties(keyst0100ExtraS01, resForm);
                // スキルリストForm(initS01List)を定義する。
                List<Keyst10400InitS01> initS01List = new ArrayList<>();
                // スキルコードを1つずつ配列に設定する。
                if (keyst0100ExtraS01.getSkills() != null) {
                    String[] skillCodeList = keyst0100ExtraS01.getSkills().split(",");
                    // スキルコードを1件ずつ取り出し、スキル名に変換する。
                    for (String skillCodeString : skillCodeList) {
                        Keyst10400InitS01 initS01 = new Keyst10400InitS01();
                        Integer skillCode = Integer.parseInt(skillCodeString);
                        Keyst5300 keyst5300 = keyst5300List.stream()
                                .filter(obj -> skillCode.equals(obj.getSkillCode()))
                                .findFirst()
                                .get();
                        // コード値からスキル名に変更した値をスキルForm(initS01)にコピーし、スキルリストForm(initS01List)に設定する。
                        BeanUtils.copyProperties(keyst5300, initS01);
                        initS01List.add(initS01);
                    }
                    // スキルリストForm(initS01List)をレスポンスFormに設定する。
                    resForm.setSkillList(initS01List);
                }

                // 案件情報Formリスト(initS02List)を定義する。
                List<Keyst10400InitS02> initS02List = new ArrayList<>();
                Keyst10400InitS02 initS02 = new Keyst10400InitS02();
                initS02.setPrjCode(keyst0100ExtraS01.getPrjCode());
                initS02.setPrjName(keyst0100ExtraS01.getPrjName());
                initS02.setContractPrice(keyst0100ExtraS01.getContractPrice());
                initS02.setPrjStartDate(keyst0100ExtraS01.getPrjStartDate());
                initS02.setPrjEndDate(keyst0100ExtraS01.getPrjEndDate());
                initS02List.add(initS02);
                // 案件情報Formリスト(initS02List)をレスポンスFormに設定する。
                resForm.setPrjInfoList(initS02List);

                // レスポンスFormリストにレスポンスFormを設定する。
                resFormList.add(resForm);
            }
        }

        return resFormList;
    }

    @Override
    public Keyst10400FilteringS filtering(String jwt) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // レスポンスFormを定義する。
        Keyst10400FilteringS resForm = new Keyst10400FilteringS();

        // チームマスタ取得(マスタテーブルが存在しない為、作成したSQLで取得)
        List<Keyst0100> keyst0100List = keyst0100Mapper.selectTeam();
        // チームリストを定義する。
        List<String> teamList = new ArrayList<>();
        // チームマスタを1件ずつ取り出し、チームをチームリストに設定する。
        for (Keyst0100 keyst0100 : keyst0100List) {
            if (keyst0100 != null) {
                teamList.add(keyst0100.getTeam());
            }
        }
        // チームリストをレスポンスFormに設定する。
        resForm.setTeamList(teamList);

        // スキルマスタ取得
        List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();
        // スキル名リストを定義する。
        List<String> skillNameList = new ArrayList<>();
        // スキルマスタを1件ずつ取り出し、スキル名をスキル名リストに設定する。
        for (Keyst5300 keyst5300 : keyst5300List) {
            if (keyst5300 != null) {
                skillNameList.add(keyst5300.getSkillName());
            }
        }
        // スキル名リストをレスポンスFormに設定する。
        resForm.setSkillNameList(skillNameList);

        // 案件マスタ取得
        List<Keyst5100> keyst5100List = keyst5100Service.getAllProjects();
        // 案件名リストを定義する。
        List<String> prjNameList = new ArrayList<>();
        // 案件マスタを1件ずつ取り出し、案件名を案件名リストに設定する。
        for (Keyst5100 keyst5100 : keyst5100List) {
            if (keyst5100 != null) {
                prjNameList.add(keyst5100.getPrjName());
            }
        }
        // 案件名リストをレスポンスFormに設定する。
        resForm.setPrjNameList(prjNameList);

        return resForm;
    }
}
