package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5200;
import com.c4c.keystone.entity.Keyst5200Example;
import com.c4c.keystone.entity.Keyst5200Key;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface Keyst5200Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5200SqlProvider.class, method="countByExample")
    long countByExample(Keyst5200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst5200SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst5200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST5200",
        "where CUST_CODE = #{custCode,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(Keyst5200Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST5200 (CUST_CODE, CUST_NAME, ",
        "CUST_PIC, DELETE_FLG, ",
        "CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY)",
        "values (#{custCode,jdbcType=VARCHAR}, #{custName,jdbcType=VARCHAR}, ",
        "#{custPic,jdbcType=VARCHAR}, #{deleteFlg,jdbcType=INTEGER}, ",
        "#{createdDatetime,jdbcType=TIMESTAMP}, #{createdUser,jdbcType=INTEGER}, ",
        "#{lastModifiedDatetime,jdbcType=TIMESTAMP}, #{lastModifiedUser,jdbcType=INTEGER}, ",
        "#{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst5200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst5200SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst5200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst5200SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CUST_NAME", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUST_PIC", property="custPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst5200> selectByExample(Keyst5200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "CUST_CODE, CUST_NAME, CUST_PIC, DELETE_FLG, CREATED_DATETIME, CREATED_USER, ",
        "LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, VERSION_EX_KEY",
        "from KEYST5200",
        "where CUST_CODE = #{custCode,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CUST_NAME", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUST_PIC", property="custPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst5200 selectByPrimaryKey(Keyst5200Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5200SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst5200 record, @Param("example") Keyst5200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5200SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst5200 record, @Param("example") Keyst5200Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst5200SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst5200 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST5200",
        "set CUST_NAME = #{custName,jdbcType=VARCHAR},",
          "CUST_PIC = #{custPic,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=INTEGER},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where CUST_CODE = #{custCode,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Keyst5200 record);
}
