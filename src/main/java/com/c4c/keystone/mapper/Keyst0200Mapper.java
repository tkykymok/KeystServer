package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200ExtraS01;
import com.c4c.keystone.entity.Keyst0200Key;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface Keyst0200Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0200SqlProvider.class, method="countByExample")
    long countByExample(Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0200SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0200",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst0200Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0200 (SKILL_SHEET_ID, USER_ID, ",
        "STRONG_AREA, PR, ",
        "EVALUATION_OF_SALES, SKILL_SHEET_REG_DATETIME, ",
        "DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY)",
        "values (#{skillSheetId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{strongArea,jdbcType=VARCHAR}, #{pr,jdbcType=VARCHAR}, ",
        "#{evaluationOfSales,jdbcType=VARCHAR}, #{skillSheetRegDatetime,jdbcType=TIMESTAMP}, ",
        "#{deleteFlg,jdbcType=INTEGER}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0200SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0200SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="STRONG_AREA", property="strongArea", jdbcType=JdbcType.VARCHAR),
        @Result(column="PR", property="pr", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVALUATION_OF_SALES", property="evaluationOfSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILL_SHEET_REG_DATETIME", property="skillSheetRegDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0200> selectByExample(Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "SKILL_SHEET_ID, USER_ID, STRONG_AREA, PR, EVALUATION_OF_SALES, SKILL_SHEET_REG_DATETIME, ",
        "DELETE_FLG, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY",
        "from KEYST0200",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="STRONG_AREA", property="strongArea", jdbcType=JdbcType.VARCHAR),
        @Result(column="PR", property="pr", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVALUATION_OF_SALES", property="evaluationOfSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILL_SHEET_REG_DATETIME", property="skillSheetRegDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0200 selectByPrimaryKey(Keyst0200Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0200SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0200 record, @Param("example") Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0200SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0200 record, @Param("example") Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0200SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0200",
        "set USER_ID = #{userId,jdbcType=INTEGER},",
          "STRONG_AREA = #{strongArea,jdbcType=VARCHAR},",
          "PR = #{pr,jdbcType=VARCHAR},",
          "EVALUATION_OF_SALES = #{evaluationOfSales,jdbcType=VARCHAR},",
          "SKILL_SHEET_REG_DATETIME = #{skillSheetRegDatetime,jdbcType=TIMESTAMP},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0200 record);

    @Select({
            "select",
            "SKILL_SHEET_ID, USER_ID, STRONG_AREA, PR, EVALUATION_OF_SALES, SKILL_SHEET_REG_DATETIME, ",
            "DELETE_FLG, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
            "VERSION_EX_KEY",
            "from KEYST0200",
            "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER),
            @Result(column="STRONG_AREA", property="strongArea", jdbcType=JdbcType.VARCHAR),
            @Result(column="PR", property="pr", jdbcType=JdbcType.VARCHAR),
            @Result(column="EVALUATION_OF_SALES", property="evaluationOfSales", jdbcType=JdbcType.VARCHAR),
            @Result(column="SKILL_SHEET_REG_DATETIME", property="skillSheetRegDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0200 checkVersion(Keyst0200 versionCheckKey);

    String EXTRA_S01
            = "SELECT\n" +
            "    KEYST0200.SKILL_SHEET_ID\n" +
            "    ,KEYST0200.USER_ID\n" +
            "    ,KEYST0210.COMMENT\n" +
            "FROM KEYST0200\n" +
            "INNER JOIN KEYST0210 ON\n" +
            "    KEYST0200.SKILL_SHEET_ID = KEYST0210.SKILL_SHEET_ID\n" +
            "WHERE\n" +
            "    USER_ID = #{userId}";

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "skillSheetId", column = "SKILL_SHEET_ID"),
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "comment", column = "COMMENT"),
    })
    List<Keyst0200ExtraS01> selectWithS01(String userId);
}
