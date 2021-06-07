package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Example;
import com.c4c.keystone.entity.Keyst0100Key;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface Keyst0100Mapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0100SqlProvider.class, method="countByExample")
    long countByExample(Keyst0100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @DeleteProvider(type=Keyst0100SqlProvider.class, method="deleteByExample")
    int deleteByExample(Keyst0100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from KEYST0100",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Keyst0100Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into KEYST0100 (USER_ID, USER_NAME, ",
        "USER_NAME_KANA, GENDER, ",
        "AGE, BIRTHDAY, NATIONALITY, ",
        "PARTNER_FLG, NEAREST_STATION, ",
        "FINAL_EDUCATION_DATE, FINAL_EDUCATION_CONTENT, ",
        "SKILLS, EMAIL, LOGIN_ID, ",
        "LOGIN_PW, ADMIN_FLG, ",
        "PRF_IMG_STRG_DRCTRY, POSTAL_CODE, ",
        "ADDRESS, PHONE_NUMBER, ",
        "BANK_NAME, BRANCH_NAME, ",
        "BRANCH_ID, ACCOUNT_TYPE, ",
        "ACCOUNT_NUMBER, ACCOUNT_NAME, ",
        "DELETE_FLG, CREATED_DATETIME, ",
        "CREATED_USER, LAST_MODIFIED_DATETIME, ",
        "LAST_MODIFIED_USER, VERSION_EX_KEY)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userNameKana,jdbcType=VARCHAR}, #{gender,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER}, #{birthday,jdbcType=DATE}, #{nationality,jdbcType=VARCHAR}, ",
        "#{partnerFlg,jdbcType=VARCHAR}, #{nearestStation,jdbcType=VARCHAR}, ",
        "#{finalEducationDate,jdbcType=DATE}, #{finalEducationContent,jdbcType=VARCHAR}, ",
        "#{skills,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{loginId,jdbcType=VARCHAR}, ",
        "#{loginPw,jdbcType=VARCHAR}, #{adminFlg,jdbcType=VARCHAR}, ",
        "#{prfImgStrgDrctry,jdbcType=VARCHAR}, #{postalCode,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{phoneNumber,jdbcType=VARCHAR}, ",
        "#{bankName,jdbcType=VARCHAR}, #{branchName,jdbcType=VARCHAR}, ",
        "#{branchId,jdbcType=VARCHAR}, #{accountType,jdbcType=VARCHAR}, ",
        "#{accountNumber,jdbcType=VARCHAR}, #{accountName,jdbcType=VARCHAR}, ",
        "#{deleteFlg,jdbcType=VARCHAR}, #{createdDatetime,jdbcType=TIMESTAMP}, ",
        "#{createdUser,jdbcType=INTEGER}, #{lastModifiedDatetime,jdbcType=TIMESTAMP}, ",
        "#{lastModifiedUser,jdbcType=INTEGER}, #{versionExKey,jdbcType=INTEGER})"
    })
    int insert(Keyst0100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @InsertProvider(type=Keyst0100SqlProvider.class, method="insertSelective")
    int insertSelective(Keyst0100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @SelectProvider(type=Keyst0100SqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME_KANA", property="userNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="NATIONALITY", property="nationality", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTNER_FLG", property="partnerFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEAREST_STATION", property="nearestStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="FINAL_EDUCATION_DATE", property="finalEducationDate", jdbcType=JdbcType.DATE),
        @Result(column="FINAL_EDUCATION_CONTENT", property="finalEducationContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILLS", property="skills", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_ID", property="loginId", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_PW", property="loginPw", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADMIN_FLG", property="adminFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRF_IMG_STRG_DRCTRY", property="prfImgStrgDrctry", jdbcType=JdbcType.VARCHAR),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="BANK_NAME", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BRANCH_NAME", property="branchName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BRANCH_ID", property="branchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_TYPE", property="accountType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_NUMBER", property="accountNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_NAME", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    List<Keyst0100> selectByExample(Keyst0100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "USER_ID, USER_NAME, USER_NAME_KANA, GENDER, AGE, BIRTHDAY, NATIONALITY, PARTNER_FLG, ",
        "NEAREST_STATION, FINAL_EDUCATION_DATE, FINAL_EDUCATION_CONTENT, SKILLS, EMAIL, ",
        "LOGIN_ID, LOGIN_PW, ADMIN_FLG, PRF_IMG_STRG_DRCTRY, POSTAL_CODE, ADDRESS, PHONE_NUMBER, ",
        "BANK_NAME, BRANCH_NAME, BRANCH_ID, ACCOUNT_TYPE, ACCOUNT_NUMBER, ACCOUNT_NAME, ",
        "DELETE_FLG, CREATED_DATETIME, CREATED_USER, LAST_MODIFIED_DATETIME, LAST_MODIFIED_USER, ",
        "VERSION_EX_KEY",
        "from KEYST0100",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME_KANA", property="userNameKana", jdbcType=JdbcType.VARCHAR),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="NATIONALITY", property="nationality", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTNER_FLG", property="partnerFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEAREST_STATION", property="nearestStation", jdbcType=JdbcType.VARCHAR),
        @Result(column="FINAL_EDUCATION_DATE", property="finalEducationDate", jdbcType=JdbcType.DATE),
        @Result(column="FINAL_EDUCATION_CONTENT", property="finalEducationContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="SKILLS", property="skills", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_ID", property="loginId", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_PW", property="loginPw", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADMIN_FLG", property="adminFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRF_IMG_STRG_DRCTRY", property="prfImgStrgDrctry", jdbcType=JdbcType.VARCHAR),
        @Result(column="POSTAL_CODE", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="BANK_NAME", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BRANCH_NAME", property="branchName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BRANCH_ID", property="branchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_TYPE", property="accountType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_NUMBER", property="accountNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCOUNT_NAME", property="accountName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_FLG", property="deleteFlg", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_DATETIME", property="createdDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_USER", property="createdUser", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_MODIFIED_DATETIME", property="lastModifiedDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_MODIFIED_USER", property="lastModifiedUser", jdbcType=JdbcType.INTEGER),
        @Result(column="VERSION_EX_KEY", property="versionExKey", jdbcType=JdbcType.INTEGER)
    })
    Keyst0100 selectByPrimaryKey(Keyst0100Key key);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0100SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Keyst0100 record, @Param("example") Keyst0100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0100SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Keyst0100 record, @Param("example") Keyst0100Example example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @UpdateProvider(type=Keyst0100SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Keyst0100 record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update KEYST0100",
        "set USER_NAME = #{userName,jdbcType=VARCHAR},",
          "USER_NAME_KANA = #{userNameKana,jdbcType=VARCHAR},",
          "GENDER = #{gender,jdbcType=VARCHAR},",
          "AGE = #{age,jdbcType=INTEGER},",
          "BIRTHDAY = #{birthday,jdbcType=DATE},",
          "NATIONALITY = #{nationality,jdbcType=VARCHAR},",
          "PARTNER_FLG = #{partnerFlg,jdbcType=VARCHAR},",
          "NEAREST_STATION = #{nearestStation,jdbcType=VARCHAR},",
          "FINAL_EDUCATION_DATE = #{finalEducationDate,jdbcType=DATE},",
          "FINAL_EDUCATION_CONTENT = #{finalEducationContent,jdbcType=VARCHAR},",
          "SKILLS = #{skills,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "LOGIN_ID = #{loginId,jdbcType=VARCHAR},",
          "LOGIN_PW = #{loginPw,jdbcType=VARCHAR},",
          "ADMIN_FLG = #{adminFlg,jdbcType=VARCHAR},",
          "PRF_IMG_STRG_DRCTRY = #{prfImgStrgDrctry,jdbcType=VARCHAR},",
          "POSTAL_CODE = #{postalCode,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR},",
          "BANK_NAME = #{bankName,jdbcType=VARCHAR},",
          "BRANCH_NAME = #{branchName,jdbcType=VARCHAR},",
          "BRANCH_ID = #{branchId,jdbcType=VARCHAR},",
          "ACCOUNT_TYPE = #{accountType,jdbcType=VARCHAR},",
          "ACCOUNT_NUMBER = #{accountNumber,jdbcType=VARCHAR},",
          "ACCOUNT_NAME = #{accountName,jdbcType=VARCHAR},",
          "DELETE_FLG = #{deleteFlg,jdbcType=VARCHAR},",
          "CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP},",
          "CREATED_USER = #{createdUser,jdbcType=INTEGER},",
          "LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP},",
          "LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER},",
          "VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Keyst0100 record);
}