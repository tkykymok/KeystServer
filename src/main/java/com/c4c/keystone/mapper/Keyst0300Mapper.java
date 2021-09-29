package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst0300Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0300SqlProvider.class, method="countByExample")
    long countByExample(Keyst0300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0300SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0300",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst0300Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0300 (RESERVE_ID, IMPL_YEAR_MONTH, ",
        "MANAGER_ID, TEAM, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{reserveId,jdbcType=INTEGER}, #{implYearMonth,jdbcType=VARCHAR}, ",
        "#{managerId,jdbcType=INTEGER}, #{team,jdbcType=VARCHAR}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0300SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0300SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="IMPL_YEAR_MONTH", property="implYearMonth", jdbcType=JdbcType.VARCHAR),
        @Result(column="MANAGER_ID", property="managerId", jdbcType=JdbcType.INTEGER),
        @Result(column="TEAM", property="team", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0300> selectByExample(Keyst0300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "RESERVE_ID, IMPL_YEAR_MONTH, MANAGER_ID, TEAM, CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST0300",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="IMPL_YEAR_MONTH", property="implYearMonth", jdbcType=JdbcType.VARCHAR),
        @Result(column="MANAGER_ID", property="managerId", jdbcType=JdbcType.INTEGER),
        @Result(column="TEAM", property="team", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0300 selectByPrimaryKey(Keyst0300Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0300SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0300 record, @Param("example") Keyst0300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0300SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0300 record, @Param("example") Keyst0300Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0300SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0300 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0300",
        "set IMPL_YEAR_MONTH = #{implYearMonth,jdbcType=VARCHAR},",
          "MANAGER_ID = #{managerId,jdbcType=INTEGER},",
          "TEAM = #{team,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER} + 1",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0300 record);

    @Select({
            "select",
            "RESERVE_ID, IMPL_YEAR_MONTH, MANAGER_ID, TEAM, CREATED_DATETIME, CREATED_USER, ",
            "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
            "from KEYST0300",
            "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
            "and VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="IMPL_YEAR_MONTH", property="implYearMonth", jdbcType=JdbcType.VARCHAR),
            @Result(column="MANAGER_ID", property="managerId", jdbcType=JdbcType.INTEGER),
            @Result(column="TEAM", property="team", jdbcType=JdbcType.VARCHAR),
            @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
            @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
            @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0300 checkVersion(Keyst0300Key versionCheckKey);

    String EXTRA_S01
            = "SELECT\n" +
            "    KEYST0300.RESERVE_ID\n" +
            "     , KEYST0300.IMPL_YEAR_MONTH\n" +
            "     , KEYST0300.MANAGER_ID\n" +
            "     , KEYST0300.TEAM\n" +
            "     , KEYST0310.RESERVE_DATE\n" +
            "     , KEYST0310.RESERVE_TIME\n" +
            "     , KEYST0310.USER_ID\n" +
            "     , KEYST0310.USER_COMMENT\n" +
            "     , KEYST0310.MANAGER_COMMENT\n" +
            "     , KEYST0310.REMARK\n" +
            "     , KEYST0310.FEELING\n" +
            "     , KEYST0100.USER_NAME\n" +
            "     , KEYST0310.VERSION_EX_KEY\n" +
            "FROM KEYST0300\n" +
            "         LEFT OUTER JOIN KEYST0310 ON\n" +
            "    KEYST0300.RESERVE_ID = KEYST0310.RESERVE_ID\n" +
            "         LEFT OUTER JOIN KEYST0100 ON\n" +
            "    KEYST0310.USER_ID = KEYST0100.USER_ID\n" +
            "WHERE KEYST0300.MANAGER_ID = #{managerId}\n" +
            "  AND KEYST0300.IMPL_YEAR_MONTH = #{implYearMonth}";

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "reserveId", column = "RESERVE_ID", jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "implYearMonth", column = "IMPL_YEAR_MONTH", jdbcType = JdbcType.VARCHAR),
            @Result(property = "managerId", column = "MANAGER_ID", jdbcType = JdbcType.INTEGER),
            @Result(property = "team", column = "TEAM", jdbcType = JdbcType.VARCHAR),
            @Result(property = "reserveDate", column = "RESERVE_DATE", jdbcType = JdbcType.DATE),
            @Result(property = "reserveTime", column = "RESERVE_TIME", jdbcType = JdbcType.TIME),
            @Result(property = "userId", column = "USER_ID", jdbcType = JdbcType.INTEGER),
            @Result(property = "userComment", column = "USER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "managerComment", column = "MANAGER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "remark", column = "REMARK", jdbcType = JdbcType.VARCHAR),
            @Result(property = "feeling", column = "FEELING", jdbcType = JdbcType.INTEGER),
            @Result(property = "userName", column = "USER_NAME", jdbcType = JdbcType.VARCHAR),
            @Result(property = "versionExKey", column = "VERSION_EX_KEY", jdbcType = JdbcType.INTEGER)
    })
    List<Keyst0300ExtraS01> selectWithS01(Keyst0300ExtraS01 Keyst0300ExtraS01);

    String EXTRA_S02
            = "SELECT\n" +
            "    KEYST0300.RESERVE_ID\n" +
            "     , KEYST0300.IMPL_YEAR_MONTH\n" +
            "     , KEYST0300.MANAGER_ID\n" +
            "     , KEYST0300.TEAM\n" +
            "     , KEYST0310.RESERVE_DATE\n" +
            "     , KEYST0310.RESERVE_TIME\n" +
            "     , KEYST0310.USER_ID\n" +
            "     , KEYST0310.USER_COMMENT\n" +
            "     , KEYST0310.MANAGER_COMMENT\n" +
            "     , KEYST0310.REMARK\n" +
            "     , KEYST0310.FEELING\n" +
            "     , KEYST0100.USER_NAME\n" +
            "     , KEYST0310.VERSION_EX_KEY\n" +
            "FROM KEYST0300\n" +
            "         LEFT OUTER JOIN KEYST0310 ON\n" +
            "    KEYST0300.RESERVE_ID = KEYST0310.RESERVE_ID\n" +
            "         LEFT OUTER JOIN KEYST0100 ON\n" +
            "    KEYST0310.USER_ID = KEYST0100.USER_ID\n" +
            "WHERE KEYST0300.TEAM = #{team}\n" +
            "  AND KEYST0300.IMPL_YEAR_MONTH = #{implYearMonth}";

    @Select(EXTRA_S02)
    @Results(value = {
            @Result(property = "reserveId", column = "RESERVE_ID", jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "implYearMonth", column = "IMPL_YEAR_MONTH", jdbcType = JdbcType.VARCHAR),
            @Result(property = "managerId", column = "MANAGER_ID", jdbcType = JdbcType.INTEGER),
            @Result(property = "team", column = "TEAM", jdbcType = JdbcType.VARCHAR),
            @Result(property = "reserveDate", column = "RESERVE_DATE", jdbcType = JdbcType.DATE),
            @Result(property = "reserveTime", column = "RESERVE_TIME", jdbcType = JdbcType.TIME),
            @Result(property = "userId", column = "USER_ID", jdbcType = JdbcType.INTEGER),
            @Result(property = "userComment", column = "USER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "managerComment", column = "MANAGER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "remark", column = "REMARK", jdbcType = JdbcType.VARCHAR),
            @Result(property = "feeling", column = "FEELING", jdbcType = JdbcType.INTEGER),
            @Result(property = "userName", column = "USER_NAME", jdbcType = JdbcType.VARCHAR),
            @Result(property = "versionExKey", column = "VERSION_EX_KEY", jdbcType = JdbcType.INTEGER)
    })
    List<Keyst0300ExtraS01> selectWithS02(Keyst0300ExtraS01 Keyst0300ExtraS01);

    String EXTRA_S03
            = "SELECT DISTINCT\n" +
            "    KEYST0300.IMPL_YEAR_MONTH\n" +
            "FROM KEYST0300\n" +
            "ORDER BY IMPL_YEAR_MONTH";

    @Select(EXTRA_S03)
    @Results(value = {
            @Result(property = "implYearMonth", column = "IMPL_YEAR_MONTH", jdbcType = JdbcType.VARCHAR),
    })
    List<Keyst0300ExtraS03> selectWithS03();

    String EXTRA_S04
            = "SELECT\n" +
            "    KEYST0300.RESERVE_ID\n" +
            "     , KEYST0300.IMPL_YEAR_MONTH\n" +
            "     , KEYST0310.RESERVE_DATE\n" +
            "     , KEYST0310.RESERVE_TIME\n" +
            "     , KEYST0100.USER_NAME AS MANAGER_NAME\n" +
            "     , KEYST0310.USER_COMMENT\n" +
            "     , KEYST0310.MANAGER_COMMENT\n" +
            "     , KEYST0310.VERSION_EX_KEY\n" +
            "FROM KEYST0300\n" +
            "         INNER JOIN KEYST0310 ON\n" +
            "        KEYST0300.RESERVE_ID = KEYST0310.RESERVE_ID\n" +
            "         INNER JOIN KEYST0100 ON\n" +
            "        KEYST0300.MANAGER_ID = KEYST0100.USER_ID\n" +
            "WHERE KEYST0310.USER_ID = #{userId}\n" +
            "ORDER BY IMPL_YEAR_MONTH DESC";

    @Select(EXTRA_S04)
    @Results(value = {
            @Result(property = "reserveId", column = "RESERVE_ID", jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "implYearMonth", column = "IMPL_YEAR_MONTH", jdbcType = JdbcType.VARCHAR),
            @Result(property = "reserveDate", column = "RESERVE_DATE", jdbcType = JdbcType.DATE),
            @Result(property = "reserveTime", column = "RESERVE_TIME", jdbcType = JdbcType.TIME),
            @Result(property = "managerName", column = "MANAGER_NAME", jdbcType = JdbcType.VARCHAR),
            @Result(property = "userComment", column = "USER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "managerComment", column = "MANAGER_COMMENT", jdbcType = JdbcType.VARCHAR),
            @Result(property = "versionExKey", column = "VERSION_EX_KEY", jdbcType = JdbcType.INTEGER)

    })
    List<Keyst0300ExtraS04> selectWithS04(Keyst0300ExtraS04 Keyst0300ExtraS04);
}
