package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100Example;
import com.c4c.keystone.entity.Keyst5100ExtraS01;
import com.c4c.keystone.entity.Keyst5100Key;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst5100Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5100SqlProvider.class, method="countByExample")
    long countByExample(Keyst5100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst5100SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst5100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST5100",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(Keyst5100Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST5100 (PRJ_CODE, PRJ_NAME, ",
        "CUST_CODE, END_CUST_NAME, ",
        "REMARK, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{prjCode,jdbcType=VARCHAR}, #{prjName,jdbcType=VARCHAR}, ",
        "#{custCode,jdbcType=VARCHAR}, #{endCustName,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst5100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst5100SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst5100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5100SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PRJ_NAME", property="prjName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="END_CUST_NAME", property="endCustName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst5100> selectByExample(Keyst5100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "PRJ_CODE, PRJ_NAME, CUST_CODE, END_CUST_NAME, REMARK, DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST5100",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PRJ_NAME", property="prjName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="END_CUST_NAME", property="endCustName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5100 selectByPrimaryKey(Keyst5100Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5100SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst5100 record, @Param("example") Keyst5100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5100SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst5100 record, @Param("example") Keyst5100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5100SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst5100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST5100",
        "set PRJ_NAME = #{prjName,jdbcType=VARCHAR},",
          "CUST_CODE = #{custCode,jdbcType=VARCHAR},",
          "END_CUST_NAME = #{endCustName,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where PRJ_CODE = #{prjCode,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Keyst5100 record);

    @Select({
            "select",
            "PRJ_CODE, PRJ_NAME, CUST_CODE, END_CUST_NAME, REMARK, DELETE_FLG, ",
            "CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
            "VERSION_EX_KEY",
            "from KEYST5100",
            "where PRJ_CODE = #{prjCode, jdbcType=VARCHAR}",
            "AND VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="PRJ_NAME", property="prjName", jdbcType=JdbcType.VARCHAR),
            @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.VARCHAR),
            @Result(column="END_CUST_NAME", property="endCustName", jdbcType=JdbcType.VARCHAR),
            @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
            @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5100 checkVersion(Keyst5100 versionCheckKey);

    String EXTRA_S01 =
            "SELECT\n" +
            "   KEYST5100.PRJ_CODE\n" +
            "    ,KEYST5100.PRJ_NAME\n" +
            "    ,KEYST5100.CUST_CODE\n" +
            "    ,KEYST5200.CUST_NAME\n" +
            "    ,KEYST5100.END_CUST_NAME\n" +
            "    ,KEYST5100.REMARK\n" +
            "    ,KEYST5100.DELETE_FLG\n" +
            "    ,KEYST5100.CREATED_DATETIME\n" +
            "    ,KEYST5100.CREATED_USER\n" +
            "    ,KEYST5100.LAST_MODIFIED_DATETIME\n" +
            "    ,KEYST5100.LAST_MODIFIED_USER\n" +
            "    ,KEYST5100.VERSION_EX_KEY\n" +
            "FROM\n" +
            "   KEYST5100\n" +
            "LEFT OUTER JOIN KEYST5200 ON\n" +
            "   KEYST5100.CUST_CODE = KEYST5200.CUST_CODE\n" +
            "WHERE KEYST5100.PRJ_CODE = #{prjCode}\n" +
            "   AND KEYST5100.DELETE_FLG = 0\n" +
            "   AND KEYST5200.DELETE_FLG = 0";

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "prjCode", column = "PRJ_CODE"),
            @Result(property = "prjName", column = "PRJ_NAME"),
            @Result(property = "custCode", column = "CUST_CODE"),
            @Result(property = "custName", column = "CUST_NAME"),
            @Result(property = "endCustName", column = "END_CUST_NAME"),
            @Result(property = "remark", column = "REMARK"),
            @Result(property = "deleteFlg", column = "DELETE_FLG"),
            @Result(property = "createdDatetime", column = "CREATED_DATETIME"),
            @Result(property = "createdUser", column = "CREATED_USER"),
            @Result(property = "lastModifiedDatetime", column = "LAST_MODIFIED_DATETIME"),
            @Result(property = "lastModifiedUser", column = "LAST_MODIFIED_USER"),
            @Result(property = "versionExKey", column = "VERSION_EX_KEY"),
    })
    Keyst5100ExtraS01 selectWithS01(String prjCode);
}
