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

import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0310Example;
import com.c4c.keystone.entity.Keyst0310ExtraS01;
import com.c4c.keystone.entity.Keyst0310Key;

@Mapper
public interface Keyst0310Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0310SqlProvider.class, method="countByExample")
    long countByExample(Keyst0310Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0310SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0310Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0310",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    int deleteByPrimaryKey(Keyst0310Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0310 (RESERVE_ID, RESERVE_DATE, ",
        "RESERVE_TIME, USER_ID, ",
        "FEELING, USER_COMMENT, ",
        "MANAGER_COMMENT, REMARK, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{reserveId,jdbcType=INTEGER}, #{reserveDate,jdbcType=DATE}, ",
        "#{reserveTime,jdbcType=TIME}, #{userId,jdbcType=INTEGER}, ",
        "#{feeling,jdbcType=INTEGER}, #{userComment,jdbcType=VARCHAR}, ",
        "#{managerComment,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0310 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0310SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0310 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0310SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_DATE", property="reserveDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="RESERVE_TIME", property="reserveTime", jdbcType=JdbcType.TIME, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="FEELING", property="feeling", jdbcType=JdbcType.INTEGER),
        @Result(column="USER_COMMENT", property="userComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="MANAGER_COMMENT", property="managerComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0310> selectByExample(Keyst0310Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "RESERVE_ID, RESERVE_DATE, RESERVE_TIME, USER_ID, FEELING, USER_COMMENT, MANAGER_COMMENT, ",
        "REMARK, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY",
        "from KEYST0310",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_DATE", property="reserveDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="RESERVE_TIME", property="reserveTime", jdbcType=JdbcType.TIME, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="FEELING", property="feeling", jdbcType=JdbcType.INTEGER),
        @Result(column="USER_COMMENT", property="userComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="MANAGER_COMMENT", property="managerComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0310 selectByPrimaryKey(Keyst0310Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0310SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0310 record, @Param("example") Keyst0310Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0310SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0310 record, @Param("example") Keyst0310Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0310SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0310 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0310",
        "set USER_ID = #{userId,jdbcType=INTEGER},",
          "FEELING = #{feeling,jdbcType=INTEGER},",
          "USER_COMMENT = #{userComment,jdbcType=VARCHAR},",
          "MANAGER_COMMENT = #{managerComment,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    int updateByPrimaryKey(Keyst0310 record);

    String EXTRA_S01 =
            "SELECT\n" +
            "    KEYST0310.RESERVE_ID\n" +
            "    ,KEYST0310.RESERVE_DATE\n" +
            "    ,KEYST0310.RESERVE_TIME\n" +
            "    ,KEYST0310.USER_ID\n" +
            "    ,KEYST0310.FEELING\n" +
            "    ,KEYST0310.USER_COMMENT\n" +
            "    ,KEYST0310.MANAGER_COMMENT\n" +
            "    ,KEYST0310.REMARK\n" +
            "	 ,KEYST0100.USER_NAME\n" +
            "FROM\n" +
            "	KEYST0310\n" +
            "LEFT OUTER JOIN KEYST0300 \n" +
            "	ON KEYST0310.RESERVE_ID = KEYST0300.RESERVE_ID\n" +
            "LEFT OUTER JOIN KEYST0100 \n" +
            "	ON KEYST0310.USER_ID = KEYST0100.USER_ID\n" +
            "WHERE KEYST0310.USER_ID = #{userId,jdbcType=INTEGER}";

    @Select(EXTRA_S01)
    @Results(value = {
            @Result(property = "reserveId", column = "RESERVE_ID", jdbcType=JdbcType.INTEGER, id=true),
            @Result(property = "reserveDate", column = "RESERVE_DATE", jdbcType=JdbcType.DATE),
            @Result(property = "reserveTime", column = "RESERVE_TIME", jdbcType=JdbcType.TIME),
            @Result(property = "userId", column = "USER_ID", jdbcType=JdbcType.INTEGER),
            @Result(property = "feeling", column = "FEELING", jdbcType=JdbcType.VARCHAR),
            @Result(property = "userComment", column = "USER_COMMENT", jdbcType=JdbcType.VARCHAR),
            @Result(property = "managerComment", column = "MANAGER_COMMENT", jdbcType=JdbcType.VARCHAR),
            @Result(property = "remark", column = "REMARK", jdbcType=JdbcType.VARCHAR),
            @Result(property = "userName", column = "USER_NAME", jdbcType=JdbcType.VARCHAR)

    })
    List<Keyst0310ExtraS01> selectWithS01(Integer userId);

}
