package com.c4c.keystone.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.config.ApplicationProperties;
import com.c4c.keystone.controller.SessionController;
import com.c4c.keystone.dbunit.CsvDataSetLoader;
import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300Example;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0310Key;
import com.c4c.keystone.exception.AuthenticationFailedException;
import com.c4c.keystone.form.AuthenticationQ;
import com.c4c.keystone.form.AuthenticationS;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.form.Keyst10300SaveQ;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.utils.JwtUtil;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class, // このテストクラスでDIを使えるように指定
        TransactionDbUnitTestExecutionListener.class // @DatabaseSetupや＠ExpectedDatabaseなどを使えるように指定
})
@Transactional
class Keyst10300ServiceTest {
    static final Logger logger = LoggerFactory.getLogger(Keyst10300ServiceTest.class);

    @Autowired
    SessionController sessionController;
    @Autowired
    Keyst10300Service keyst10300Service;

    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst0310Mapper keyst0310Mapper;
    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    ApplicationProperties applicationProperties;

    private DatabaseConnection dbconn;

    @BeforeAll
    static void init() {
    }

    @BeforeEach
    void setUp() throws SQLException, DatabaseUnitException {
        // DB接続情報を取得
        String dbUrl = applicationProperties.get("spring.datasource.url");
        String user = applicationProperties.get("spring.datasource.username");
        String password = applicationProperties.get("spring.datasource.password");
        // DBコネクション取得
        Connection conn = DriverManager.getConnection(dbUrl, user, password);
        dbconn = new DatabaseConnection(conn);
    }

    @AfterEach
    void tearDown() {
    }

    @Nested
    class initializeTest {
        @Test
        void test_001() throws DatabaseUnitException, SQLException, AuthenticationFailedException {
            // csv用データセット作成
            IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/Keyst10300ServiceTest/initializeTest"));
            // テストデータの全削除
            DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);
            // テストデータの挿入
            DatabaseOperation.INSERT.execute(dbconn, dataset);

            // ログイン
            AuthenticationQ authenticationQ = new AuthenticationQ();
            authenticationQ.setLoginId("yamada");
            authenticationQ.setLoginPw("yamada");
            ResponseEntity<AuthenticationS> responseEntity = sessionController.createAuthenticationToken(authenticationQ);
            String jwt = "Bearer " + Objects.requireNonNull(responseEntity.getBody()).getJwt();

            try {
                // 対象メソッドの実行
                Keyst10300InitS keyst10300InitS = keyst10300Service.initialize(jwt, null);
                ////////// 確認内容 //////////
                logger.info(String.valueOf(keyst10300InitS));
                assertEquals(keyst10300InitS.getTeam(), "A");
                ////////// 確認内容 //////////
            } catch (Exception e) {
                e.printStackTrace();
                fail();
            }
        }
    }

    @Nested
    class saveTest {
    	@Test
    	void test_001() throws DatabaseUnitException, SQLException, AuthenticationFailedException {
    		// csv用データセット作成
    		IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/Keyst10300ServiceTest/initializeTest"));
    		// テストデータの全削除
    		DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);
    		// テストデータの挿入
    		DatabaseOperation.INSERT.execute(dbconn, dataset);

    		// ログイン
    		AuthenticationQ authenticationQ = new AuthenticationQ();
    		authenticationQ.setLoginId("yamada");
    		authenticationQ.setLoginPw("yamada");
    		ResponseEntity<AuthenticationS> responseEntity = sessionController.createAuthenticationToken(authenticationQ);
    		String jwt = "Bearer " + Objects.requireNonNull(responseEntity.getBody()).getJwt();

            // 登録するデータ作成
            // スキルシートヘッダー
            Keyst10300SaveQ reqForm = new Keyst10300SaveQ();
            reqForm.setReserveDate(LocalDate.parse("20211010", DateTimeFormatter.ofPattern("yyyyMMdd")));
    		reqForm.setFromTime(LocalTime.of(18, 00));
    		reqForm.setToTime(LocalTime.of(20, 00));
    		reqForm.setTeam("A");

    		try {
    			// 対象メソッドの実行
    			keyst10300Service.save(jwt, reqForm);

                // 登録した1on1予約ヘッダーの予約IDを取得する。
    	        // ログインユーザー情報
    	        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
    	        // ユーザーID
    	        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
    	        // 実施年月
                String implYearMonth = reqForm.getReserveDate().toString()
                        .replace("-", "")
                        .substring(0, 6);

                Keyst0300Example keyst0300Example = new Keyst0300Example();
                keyst0300Example.createCriteria()
                        .andManagerIdEqualTo(loginUserId) // ユーザーID(管理者)
                        .andImplYearMonthEqualTo(implYearMonth); // 実施年月
                List<Keyst0300> keyst0300List = keyst0300Mapper.selectByExample(keyst0300Example);
                Integer reserveId = keyst0300List.get(0).getReserveId();
                String team = keyst0300List.get(0).getTeam();

                // 1on1予約明細登録を取得
                Keyst0310Key Keyst0310Key = new Keyst0310Key();
                Keyst0310Key.setReserveId(reserveId);
                Keyst0310Key.setReserveDate(reqForm.getReserveDate());
                Keyst0310Key.setReserveTime(reqForm.getFromTime());
                Keyst0310 keyst0310 = keyst0310Mapper.selectByPrimaryKey(Keyst0310Key);
                Integer createdUser = keyst0310.getCreatedUser();

    			////////// 確認内容 //////////
                assertEquals(team, "A");
                assertEquals(createdUser, 1);
    			////////// 確認内容 //////////
    		} catch (Exception e) {
    			e.printStackTrace();
    			fail();
    		}
        }
    }
















}
