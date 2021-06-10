package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0210;
import com.c4c.keystone.entity.Keyst0210Example;
import com.c4c.keystone.entity.Keyst0210Key;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface Keyst0210Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0210SqlProvider.class, method="countByExample")
    long countByExample(Keyst0210Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0210SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0210Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0210",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}",
          "and REF_NO = #{refNo,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst0210Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0210 (SKILL_SHEET_ID, REF_NO, ",
        "PRJ_CODE, PRJ_START_DATE, ",
        "PRJ_END_DATE, BIZ_IN_CHARGE, ",
        "`COMMENT`, DEV_SCALE, ",
        "OS, DB, FW_MW_TOOL, ",
        "PG_LANG, SCOPE_OF_WORK, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{skillSheetId,jdbcType=INTEGER}, #{refNo,jdbcType=INTEGER}, ",
        "#{prjCode,jdbcType=VARCHAR}, #{prjStartDate,jdbcType=DATE}, ",
        "#{prjEndDate,jdbcType=DATE}, #{bizInCharge,jdbcType=VARCHAR}, ",
        "#{comment,jdbcType=VARCHAR}, #{devScale,jdbcType=VARCHAR}, ",
        "#{os,jdbcType=VARCHAR}, #{db,jdbcType=VARCHAR}, #{fwMwTool,jdbcType=VARCHAR}, ",
        "#{pgLang,jdbcType=VARCHAR}, #{scopeOfWork,jdbcType=VARCHAR}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0210 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0210SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0210 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0210SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="REF_NO", property="refNo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRJ_START_DATE", property="prjStartDate", jdbcType=JdbcType.DATE),
        @Result(column="PRJ_END_DATE", property="prjEndDate", jdbcType=JdbcType.DATE),
        @Result(column="BIZ_IN_CHARGE", property="bizInCharge", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEV_SCALE", property="devScale", jdbcType=JdbcType.VARCHAR),
        @Result(column="OS", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="FW_MW_TOOL", property="fwMwTool", jdbcType=JdbcType.VARCHAR),
        @Result(column="PG_LANG", property="pgLang", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCOPE_OF_WORK", property="scopeOfWork", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0210> selectByExample(Keyst0210Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "SKILL_SHEET_ID, REF_NO, PRJ_CODE, PRJ_START_DATE, PRJ_END_DATE, BIZ_IN_CHARGE, ",
        "`COMMENT`, DEV_SCALE, OS, DB, FW_MW_TOOL, PG_LANG, SCOPE_OF_WORK, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST0210",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}",
          "and REF_NO = #{refNo,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="REF_NO", property="refNo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PRJ_CODE", property="prjCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRJ_START_DATE", property="prjStartDate", jdbcType=JdbcType.DATE),
        @Result(column="PRJ_END_DATE", property="prjEndDate", jdbcType=JdbcType.DATE),
        @Result(column="BIZ_IN_CHARGE", property="bizInCharge", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEV_SCALE", property="devScale", jdbcType=JdbcType.VARCHAR),
        @Result(column="OS", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="FW_MW_TOOL", property="fwMwTool", jdbcType=JdbcType.VARCHAR),
        @Result(column="PG_LANG", property="pgLang", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCOPE_OF_WORK", property="scopeOfWork", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0210 selectByPrimaryKey(Keyst0210Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0210SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0210 record, @Param("example") Keyst0210Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0210SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0210 record, @Param("example") Keyst0210Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0210SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0210 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0210",
        "set PRJ_CODE = #{prjCode,jdbcType=VARCHAR},",
          "PRJ_START_DATE = #{prjStartDate,jdbcType=DATE},",
          "PRJ_END_DATE = #{prjEndDate,jdbcType=DATE},",
          "BIZ_IN_CHARGE = #{bizInCharge,jdbcType=VARCHAR},",
          "`COMMENT` = #{comment,jdbcType=VARCHAR},",
          "DEV_SCALE = #{devScale,jdbcType=VARCHAR},",
          "OS = #{os,jdbcType=VARCHAR},",
          "DB = #{db,jdbcType=VARCHAR},",
          "FW_MW_TOOL = #{fwMwTool,jdbcType=VARCHAR},",
          "PG_LANG = #{pgLang,jdbcType=VARCHAR},",
          "SCOPE_OF_WORK = #{scopeOfWork,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}",
          "and REF_NO = #{refNo,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0210 record);
}
