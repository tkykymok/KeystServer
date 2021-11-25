package com.c4c.keystone.service.impl;

import com.c4c.keystone.config.ApplicationProperties;
import com.c4c.keystone.controller.SessionController;
import com.c4c.keystone.dbunit.CsvDataSetLoader;
import com.c4c.keystone.exception.AuthenticationFailedException;
import com.c4c.keystone.form.AuthenticationQ;
import com.c4c.keystone.form.AuthenticationS;
import com.c4c.keystone.form.Keyst10100InitS;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.jupiter.api.*;
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

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class, // このテストクラスでDIを使えるように指定
        TransactionDbUnitTestExecutionListener.class // @DatabaseSetupや＠ExpectedDatabaseなどを使えるように指定
})
@Transactional
class InsertDemoData {
    static final Logger logger = LoggerFactory.getLogger(InsertDemoData.class);

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
    class insertDemoData {
        @Test
        void test_001() throws DatabaseUnitException, SQLException {
            // csv用データセット作成
            IDataSet dataset = new CsvDataSet(new File("src/test/resources/testdata/demo"));
            // テストデータの全削除
            DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);
            // テストデータの挿入
            DatabaseOperation.INSERT.execute(dbconn, dataset);
        }
    }
}

