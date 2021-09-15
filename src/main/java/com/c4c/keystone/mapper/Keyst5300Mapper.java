package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.entity.Keyst5300Example;
import com.c4c.keystone.entity.Keyst5300Key;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst5300Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5300SqlProvider.class, method="countByExample")
    long countByExample(Keyst5300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst5300SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst5300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST5300",
        "where SKILL_CODE = #{skillCode,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst5300Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST5300 (SKILL_CODE, SKILL_NAME, ",
        "LANG_FLG, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY)",
        "values (#{skillCode,jdbcType=INTEGER}, #{skillName,jdbcType=VARCHAR}, ",
        "#{langFlg,jdbcType=INTEGER}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst5300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst5300SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst5300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5300SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SKILL_CODE", property="skillCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SKILL_NAME", property="skillName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LANG_FLG", property="langFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst5300> selectByExample(Keyst5300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "SKILL_CODE, SKILL_NAME, LANG_FLG, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST5300",
        "where SKILL_CODE = #{skillCode,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="SKILL_CODE", property="skillCode", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SKILL_NAME", property="skillName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LANG_FLG", property="langFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5300 selectByPrimaryKey(Keyst5300Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5300SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst5300 record, @Param("example") Keyst5300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5300SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst5300 record, @Param("example") Keyst5300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5300SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst5300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST5300",
        "set SKILL_NAME = #{skillName,jdbcType=VARCHAR},",
          "LANG_FLG = #{langFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where SKILL_CODE = #{skillCode,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst5300 record);

    @Select({
            "select",
            "SKILL_CODE, SKILL_NAME, LANG_FLG, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, ",
            "LAST_MODIFIED_USER, VERSION_EX_KEY",
            "from KEYST5300",
            "where SKILL_CODE = #{skillCode,jdbcType=INTEGER}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="SKILL_CODE", property="skillCode", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="SKILL_NAME", property="skillName", jdbcType=JdbcType.VARCHAR),
            @Result(column="LANG_FLG", property="langFlg", jdbcType=JdbcType.INTEGER),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5300 checkVersion(Keyst5300Key versionCheckKey);
}
