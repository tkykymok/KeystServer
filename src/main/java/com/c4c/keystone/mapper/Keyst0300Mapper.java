package com.c4c.keystone.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300Example;
import com.c4c.keystone.entity.Keyst0300ExtraS01;
import com.c4c.keystone.entity.Keyst0300Key;

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
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0300 record);

    String EXTRA_S01 =
            "SELECT\n" +
            "    KEYST0300.RESERVE_ID\n" +
            "    ,KEYST0300.IMPL_YEAR_MONTH\n" +
            "    ,KEYST0300.MANAGER_ID\n" +
            "    ,KEYST0300.TEAM\n" +
            "    ,KEYST0320.RESERVE_DATE\n" +
            "    ,KEYST0320.RESERVE_TIME\n" +
            "    ,KEYST0310.USER_ID\n" +
            "    ,KEYST0100.USER_NAME\n" +
            "FROM\n" +
            "   KEYST0300\n" +
            "LEFT OUTER JOIN KEYST0320 ON\n" +
            "    KEYST0300.RESERVE_ID = KEYST0320.RESERVE_ID\n" +
            "LEFT OUTER JOIN KEYST0310 ON\n" +
            "    KEYST0320.RESERVE_DATE = KEYST0310.RESERVE_DATE\n" +
            "AND KEYST0320.RESERVE_TIME = KEYST0310.RESERVE_TIME\n" +
            "LEFT OUTER JOIN KEYST0100 ON\n" +
            "    KEYST0310.USER_ID = KEYST0100.USER_ID\n" +

            "WHERE KEYST0300.MANAGER_ID = '17'\n" +
            "   AND KEYST0300.IMPL_YEAR_MONTH = '202107'";

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "reserveId", column = "RESERVE_ID"),
            @Result(property = "implYearMonth", column = "IMPL_YEAR_MONTH"),
            @Result(property = "managerId", column = "MANAGER_ID"),
            @Result(property = "team", column = "TEAM"),
            @Result(property = "reserveDate", column = "RESERVE_DATE"),
            @Result(property = "reserveTime", column = "RESERVE_TIME"),
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "userName", column = "USER_NAME"),
    })
    List<Keyst0300ExtraS01> selectWithS();

}
