package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0320;
import com.c4c.keystone.entity.Keyst0320Example;
import com.c4c.keystone.entity.Keyst0320Key;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface Keyst0320Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0320SqlProvider.class, method="countByExample")
    long countByExample(Keyst0320Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0320SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0320Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0320",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    int deleteByPrimaryKey(Keyst0320Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0320 (RESERVE_ID, RESERVE_DATE, ",
        "RESERVE_TIME, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER)",
        "values (#{reserveId,jdbcType=INTEGER}, #{reserveDate,jdbcType=DATE}, ",
        "#{reserveTime,jdbcType=TIME}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER})"
    })
    int insert(Keyst0320 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0320SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0320 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0320SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_DATE", property="reserveDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="RESERVE_TIME", property="reserveTime", jdbcType=JdbcType.TIME, id=true),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0320> selectByExample(Keyst0320Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "RESERVE_ID, RESERVE_DATE, RESERVE_TIME, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER",
        "from KEYST0320",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    @Results({
        @Result(column="RESERVE_ID", property="reserveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RESERVE_DATE", property="reserveDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="RESERVE_TIME", property="reserveTime", jdbcType=JdbcType.TIME, id=true),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER)
    })
    Keyst0320 selectByPrimaryKey(Keyst0320Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0320SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0320 record, @Param("example") Keyst0320Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0320SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0320 record, @Param("example") Keyst0320Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0320SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0320 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0320",
        "set CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER}",
        "where RESERVE_ID = #{reserveId,jdbcType=INTEGER}",
          "and RESERVE_DATE = #{reserveDate,jdbcType=DATE}",
          "and RESERVE_TIME = #{reserveTime,jdbcType=TIME}"
    })
    int updateByPrimaryKey(Keyst0320 record);
}
