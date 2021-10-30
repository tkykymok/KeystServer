package com.c4c.keystone.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0210;
import com.c4c.keystone.entity.Keyst0210Example;
import com.c4c.keystone.exception.AuthenticationFailedException;
import com.c4c.keystone.form.AuthenticationQ;
import com.c4c.keystone.form.AuthenticationS;
import com.c4c.keystone.form.Keyst10200DispSklShtS;
import com.c4c.keystone.form.Keyst10200InitS;
import com.c4c.keystone.form.Keyst10200SaveQ;
import com.c4c.keystone.form.Keyst10200SaveQ1;
import com.c4c.keystone.form.Keyst10200SaveS;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst0210Mapper;
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
class Keyst10200ServiceTest {
    static final Logger logger = LoggerFactory.getLogger(Keyst10200ServiceTest.class);

    @Autowired
    SessionController sessionController;
    @Autowired
    Keyst10200Service keyst10200Service;

    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst0210Mapper keyst0210Mapper;

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
        void test_001() throws DatabaseUnitException, SQLException {
            // csv用データセット作成
            IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/Keyst10200ServiceTest/initializeTest"));
            // テストデータの全削除
            DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);
            // テストデータの挿入
            DatabaseOperation.INSERT.execute(dbconn, dataset);

            try {
                // 対象メソッドの実行
                Keyst10200InitS keyst10200InitS = keyst10200Service.initialize(5);
                ////////// 確認内容 //////////
                logger.info(String.valueOf(keyst10200InitS));
                assertEquals(keyst10200InitS.getUserBasicInfo().getUserName(), "山田　太郎");
                ////////// 確認内容 //////////
            } catch (Exception e) {
                e.printStackTrace();
                fail();
            }
        }
    }

    @Nested
    class displaySkillSheetTest {
        @Test
        void test_001() throws DatabaseUnitException, SQLException {
            // csv用データセット作成
            IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/Keyst10200ServiceTest/initializeTest"));
            // テストデータの全削除
            DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);
            // テストデータの挿入
            DatabaseOperation.INSERT.execute(dbconn, dataset);

            try {
                // 対象メソッドの実行
                Keyst10200DispSklShtS keyst10200DispSklShtS = keyst10200Service.displaySkillSheet(59);
                ////////// 確認内容 //////////
                logger.info(String.valueOf(keyst10200DispSklShtS));
                assertEquals(keyst10200DispSklShtS.getSkillSheetHeader().getSkillSheetId(), 59);
                assertEquals(keyst10200DispSklShtS.getSkillSheetHeader().getStrongArea(), "得意分野テスト1");
                assertEquals(keyst10200DispSklShtS.getSkillSheetHeader().getPr(), "PRテスト1");
                assertNull(keyst10200DispSklShtS.getSkillSheetHeader().getEvaluationOfSales());
                assertEquals(keyst10200DispSklShtS.getSkillSheetDetail().size(), 2);
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
            IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/Keyst10200ServiceTest/initializeTest"));
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
            Keyst10200SaveQ reqForm = new Keyst10200SaveQ();
            reqForm.setUserId(responseEntity.getBody().getLoginUserInfo().getUserId());
            reqForm.setStrongArea("得意分野のテストです");
            reqForm.setPr("PRのテストです");
            reqForm.setEvaluationOfSales("営業評価のテストです");

            // スキルシート明細
            List<Keyst10200SaveQ1> skillSheetDetail = new ArrayList<>();
            Keyst10200SaveQ1 keyst10200SaveQ1 = new Keyst10200SaveQ1();
            keyst10200SaveQ1.setRefNo(0);
            keyst10200SaveQ1.setPrjCode("P0001");
            keyst10200SaveQ1.setPrjStartDate(LocalDate.of(2020, 1, 1));
            keyst10200SaveQ1.setPrjEndDate(LocalDate.of(2020, 12, 31));
            keyst10200SaveQ1.setBizInCharge("担当業務のテストです");
            keyst10200SaveQ1.setComment("コメントのテストです");
            keyst10200SaveQ1.setDevScale(Arrays.asList("10", "20", "30"));
            keyst10200SaveQ1.setOs(1);
            keyst10200SaveQ1.setDb(1);
            keyst10200SaveQ1.setFwMwTool(Arrays.asList("FWテスト", "MWテスト", "ツールテスト"));
            keyst10200SaveQ1.setPgLang(Arrays.asList(1, 2, 3, 5, 6));
            keyst10200SaveQ1.setSowManagement(0);
            keyst10200SaveQ1.setSowReqDefinition(0);
            keyst10200SaveQ1.setSowBasicDesign(1);
            keyst10200SaveQ1.setSowDetailDesign(1);
            keyst10200SaveQ1.setSowImplementation(1);
            keyst10200SaveQ1.setSowTest(0);
            keyst10200SaveQ1.setSowMaintenanceOperation(0);
            skillSheetDetail.add(keyst10200SaveQ1);
            reqForm.setSkillSheetDetail(skillSheetDetail);

            try {
                // 対象メソッドの実行
                Keyst10200SaveS keyst10200SaveS = keyst10200Service.save(jwt, reqForm);

                Keyst0200 keyst0200 = new Keyst0200();
                keyst0200.setSkillSheetId(keyst10200SaveS.getSkillSheetId());
                keyst0200 = keyst0200Mapper.selectByPrimaryKey(keyst0200);
                logger.info(String.valueOf(keyst0200));

                Keyst0210Example keyst0210Example = new Keyst0210Example();
                keyst0210Example.createCriteria().andSkillSheetIdEqualTo(keyst0200.getSkillSheetId());
                List<Keyst0210> keyst0210List = keyst0210Mapper.selectByExample(keyst0210Example);
                logger.info(String.valueOf(keyst0210List));

                ////////// 確認内容 //////////
                assertTrue(Objects.nonNull(keyst0200.getSkillSheetId()));
                assertEquals(keyst0200.getUserId(), 5);
                assertEquals(keyst0210List.size(), 1);
                ////////// 確認内容 //////////
            } catch (Exception e) {
                e.printStackTrace();
                fail();
            }
        }
    }


}

