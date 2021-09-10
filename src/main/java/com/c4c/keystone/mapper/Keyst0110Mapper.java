package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0110;
import com.c4c.keystone.entity.Keyst0110Example;
import com.c4c.keystone.entity.Keyst0110Key;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface Keyst0110Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0110SqlProvider.class, method="countByExample")
    long countByExample(Keyst0110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0110SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0110",
        "where USER_ID = #{userId,jdbcType=INTEGER}",
          "and QUALIFIED_DATE = #{qualifiedDate,jdbcType=DATE}",
          "and QUALIFICATION_CONTENT = #{qualificationContent,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(Keyst0110Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0110 (USER_ID, QUALIFIED_DATE, ",
        "QUALIFICATION_CONTENT, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY)",
        "values (#{userId,jdbcType=INTEGER}, #{qualifiedDate,jdbcType=DATE}, ",
        "#{qualificationContent,jdbcType=VARCHAR}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0110SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0110SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="QUALIFIED_DATE", property="qualifiedDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="QUALIFICATION_CONTENT", property="qualificationContent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0110> selectByExample(Keyst0110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "USER_ID, QUALIFIED_DATE, QUALIFICATION_CONTENT, CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST0110",
        "where USER_ID = #{userId,jdbcType=INTEGER}",
          "and QUALIFIED_DATE = #{qualifiedDate,jdbcType=DATE}",
          "and QUALIFICATION_CONTENT = #{qualificationContent,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="QUALIFIED_DATE", property="qualifiedDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="QUALIFICATION_CONTENT", property="qualificationContent", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0110 selectByPrimaryKey(Keyst0110Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0110SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0110 record, @Param("example") Keyst0110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0110SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0110 record, @Param("example") Keyst0110Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0110SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0110 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0110",
        "set QUALIFIED_DATE = #{qualifiedDate,jdbcType=DATE},",
          "QUALIFICATION_CONTENT = #{qualificationContent,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0110 record);

    @Select({
            "select",
            "USER_ID, QUALIFIED_DATE, QUALIFICATION_CONTENT, CREATED_DATETIME, CREATED_USER, ",
            "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
            "from KEYST0110",
            "where USER_ID = #{userId,jdbcType=INTEGER}",
            "and QUALIFIED_DATE = #{qualifiedDate,jdbcType=DATE}",
            "and QUALIFICATION_CONTENT = #{qualificationContent,jdbcType=VARCHAR}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="QUALIFIED_DATE", property="qualifiedDate", jdbcType=JdbcType.DATE, id=true),
            @Result(column="QUALIFICATION_CONTENT", property="qualificationContent", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0110 checkVersion(Keyst0110Key checkVersion);
}
