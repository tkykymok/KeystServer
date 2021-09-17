package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst0400Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0400SqlProvider.class, method="countByExample")
    long countByExample(Keyst0400Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0400SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0400Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0400",
        "where NOTIFICATION_ID = #{notificationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst0400Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0400 (NOTIFICATION_ID, TITLE, ",
        "CONTENT, NOTIFICATION_REG_ID, ",
        "NOTIFICATION_REG_DATETIME, POST_START_DATE, ",
        "POST_END_DATE, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{notificationId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{notificationRegId,jdbcType=INTEGER}, ",
        "#{notificationRegDatetime,jdbcType=TIMESTAMP}, #{postStartDate,jdbcType=DATE}, ",
        "#{postEndDate,jdbcType=DATE}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0400 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0400SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0400 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0400SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NOTIFICATION_ID", property="notificationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTIFICATION_REG_ID", property="notificationRegId", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTIFICATION_REG_DATETIME", property="notificationRegDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="POST_START_DATE", property="postStartDate", jdbcType=JdbcType.DATE),
        @Result(column="POST_END_DATE", property="postEndDate", jdbcType=JdbcType.DATE),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0400> selectByExample(Keyst0400Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "NOTIFICATION_ID, TITLE, CONTENT, NOTIFICATION_REG_ID, NOTIFICATION_REG_DATETIME, ",
        "POST_START_DATE, POST_END_DATE, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST0400",
        "where NOTIFICATION_ID = #{notificationId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="NOTIFICATION_ID", property="notificationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTIFICATION_REG_ID", property="notificationRegId", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTIFICATION_REG_DATETIME", property="notificationRegDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="POST_START_DATE", property="postStartDate", jdbcType=JdbcType.DATE),
        @Result(column="POST_END_DATE", property="postEndDate", jdbcType=JdbcType.DATE),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0400 selectByPrimaryKey(Keyst0400Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0400SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0400 record, @Param("example") Keyst0400Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0400SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0400 record, @Param("example") Keyst0400Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0400SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0400 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0400",
        "set TITLE = #{title,jdbcType=VARCHAR},",
          "CONTENT = #{content,jdbcType=VARCHAR},",
          "NOTIFICATION_REG_ID = #{notificationRegId,jdbcType=INTEGER},",
          "NOTIFICATION_REG_DATETIME = #{notificationRegDatetime,jdbcType=TIMESTAMP},",
          "POST_START_DATE = #{postStartDate,jdbcType=DATE},",
          "POST_END_DATE = #{postEndDate,jdbcType=DATE},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where NOTIFICATION_ID = #{notificationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0400 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
            "select",
            "NOTIFICATION_ID, TITLE, CONTENT, NOTIFICATION_REG_ID, NOTIFICATION_REG_DATETIME, ",
            "POST_START_DATE, POST_END_DATE, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
            "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
            "from KEYST0400",
            "where NOTIFICATION_ID = #{notificationId,jdbcType=INTEGER}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="NOTIFICATION_ID", property="notificationId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="TITLE", property="title", jdbcType=JdbcType.VARCHAR),
            @Result(column="CONTENT", property="content", jdbcType=JdbcType.VARCHAR),
            @Result(column="NOTIFICATION_REG_ID", property="notificationRegId", jdbcType=JdbcType.INTEGER),
            @Result(column="NOTIFICATION_REG_DATETIME", property="notificationRegDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="POST_START_DATE", property="postStartDate", jdbcType=JdbcType.DATE),
            @Result(column="POST_END_DATE", property="postEndDate", jdbcType=JdbcType.DATE),
            @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0400 checkVersion(Keyst0400Key versionCheckKey);

    String EXTRA_S01
            = "SELECT\n" +
            "    KEYST0400.NOTIFICATION_ID\n" +
            "     ,KEYST0400.TITLE\n" +
            "     ,KEYST0400.CONTENT\n" +
            "     ,KEYST0400.POST_START_DATE\n" +
            "     ,KEYST0400.POST_END_DATE\n" +
            "     ,KEYST0400.NOTIFICATION_REG_DATETIME\n" +
            "     ,KEYST0100.USER_NAME\n" +
            "     ,KEYST0400.VERSION_EX_KEY\n" +
            "FROM KEYST0400\n" +
            "         INNER JOIN KEYST0100 ON\n" +
            "        KEYST0400.NOTIFICATION_REG_ID = KEYST0100.USER_ID\n" +
            "WHERE\n" +
            "        KEYST0400.DELETE_FLG = '0'\n" +
            ";"
            ;

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "notificationId", column = "NOTIFICATION_ID"),
            @Result(property = "title", column = "TITLE"),
            @Result(property = "content", column = "CONTENT"),
            @Result(property = "postStartDate", column = "POST_START_DATE"),
            @Result(property = "postEndDate", column = "POST_END_DATE"),
            @Result(property = "notificationRegDatetime", column = "NOTIFICATION_REG_DATETIME"),
            @Result(property = "notificationRegPersonName", column = "NOTIFICATION_REG_PERSON_NAME"),
            @Result(property = "versionExKey", column = "VERSION_EX_KEY"),
    })
    List<Keyst0400ExtraS01> selectWithS01();
}
