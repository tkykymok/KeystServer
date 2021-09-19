package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5110;
import com.c4c.keystone.entity.Keyst5110Example;
import com.c4c.keystone.entity.Keyst5110Key;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst5110Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5110SqlProvider.class, method="countByExample")
    long countByExample(Keyst5110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst5110SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst5110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST5110",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}",
          "and USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst5110Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST5110 (PRJ_CODE, USER_ID, ",
        "CONTRACT_PRICE, PRJ_START_DATE, ",
        "PRJ_END_DATE, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY)",
        "values (#{prjCode,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{contractPrice,jdbcType=INTEGER}, #{prjStartDate,jdbcType=DATE}, ",
        "#{prjEndDate,jdbcType=DATE}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst5110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst5110SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst5110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5110SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CONTRACT_PRICE", property="contractPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="PRJ_START_DATE", property="prjStartDate", jdbcType=JdbcType.DATE),
        @Result(column="PRJ_END_DATE", property="prjEndDate", jdbcType=JdbcType.DATE),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst5110> selectByExample(Keyst5110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "PRJ_CODE, USER_ID, CONTRACT_PRICE, PRJ_START_DATE, PRJ_END_DATE, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST5110",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}",
          "and USER_ID = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CONTRACT_PRICE", property="contractPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="PRJ_START_DATE", property="prjStartDate", jdbcType=JdbcType.DATE),
        @Result(column="PRJ_END_DATE", property="prjEndDate", jdbcType=JdbcType.DATE),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5110 selectByPrimaryKey(Keyst5110Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5110SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst5110 record, @Param("example") Keyst5110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5110SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst5110 record, @Param("example") Keyst5110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5110SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst5110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST5110",
        "set CONTRACT_PRICE = #{contractPrice,jdbcType=INTEGER},",
          "PRJ_START_DATE = #{prjStartDate,jdbcType=DATE},",
          "PRJ_END_DATE = #{prjEndDate,jdbcType=DATE},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}",
          "and USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst5110 record);

    @Select({
            "select",
            "PRJ_CODE, USER_ID, CONTRACT_PRICE, PRJ_START_DATE, PRJ_END_DATE, CREATED_DATETIME, ",
            "CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
            "from KEYST5110",
            "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}",
            "and USER_ID = #{userId,jdbcType=INTEGER}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="CONTRACT_PRICE", property="contractPrice", jdbcType=JdbcType.INTEGER),
            @Result(column="PRJ_START_DATE", property="prjStartDate", jdbcType=JdbcType.DATE),
            @Result(column="PRJ_END_DATE", property="prjEndDate", jdbcType=JdbcType.DATE),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5110 checkVersion(Keyst5110 versionCheckKey);
}
