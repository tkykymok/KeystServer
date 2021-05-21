package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200Key;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst0200Mapper {

    final String EXTRA_S01 = "";

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
        "SKILLS, STRONG_AREA, ",
        "PR, EVALUATION_OF_SALES, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{skillSheetId,jdbcType=INTEGER}, #{userId,jdbcType=VARCHAR}, ",
        "#{skills,jdbcType=VARCHAR}, #{strongArea,jdbcType=VARCHAR}, ",
        "#{pr,jdbcType=VARCHAR}, #{evaluationOfSales,jdbcType=VARCHAR}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=VARCHAR}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=VARCHAR}, ",
        "#{versionExKey,jdbcType=INTEGER})"
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
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILLS", property="skills", jdbcType=JdbcType.VARCHAR),
        @Result(column="STRONG_AREA", property="strongArea", jdbcType=JdbcType.VARCHAR),
        @Result(column="PR", property="pr", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVALUATION_OF_SALES", property="evaluationOfSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0200> selectByExample(Keyst0200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "SKILL_SHEET_ID, USER_ID, SKILLS, STRONG_AREA, PR, EVALUATION_OF_SALES, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST0200",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SKILL_SHEET_ID", property="skillSheetId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILLS", property="skills", jdbcType=JdbcType.VARCHAR),
        @Result(column="STRONG_AREA", property="strongArea", jdbcType=JdbcType.VARCHAR),
        @Result(column="PR", property="pr", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVALUATION_OF_SALES", property="evaluationOfSales", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.VARCHAR),
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
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "SKILLS = #{skills,jdbcType=VARCHAR},",
          "STRONG_AREA = #{strongArea,jdbcType=VARCHAR},",
          "PR = #{pr,jdbcType=VARCHAR},",
          "EVALUATION_OF_SALES = #{evaluationOfSales,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=VARCHAR},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=VARCHAR},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0200 record);
}
