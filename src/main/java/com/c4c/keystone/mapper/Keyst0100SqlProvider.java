package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Example.Criteria;
import com.c4c.keystone.entity.Keyst0100Example.Criterion;
import com.c4c.keystone.entity.Keyst0100Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst0100SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst0100Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST0100");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst0100Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST0100");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst0100 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST0100");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("USER_NAME", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNameKana() != null) {
            sql.VALUES("USER_NAME_KANA", "#{userNameKana,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("GENDER", "#{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("AGE", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getBirthday() != null) {
            sql.VALUES("BIRTHDAY", "#{birthday,jdbcType=DATE}");
        }
        
        if (record.getNationality() != null) {
            sql.VALUES("NATIONALITY", "#{nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerFlg() != null) {
            sql.VALUES("PARTNER_FLG", "#{partnerFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getNearestStation() != null) {
            sql.VALUES("NEAREST_STATION", "#{nearestStation,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalEducationDate() != null) {
            sql.VALUES("FINAL_EDUCATION_DATE", "#{finalEducationDate,jdbcType=DATE}");
        }
        
        if (record.getFinalEducationContent() != null) {
            sql.VALUES("FINAL_EDUCATION_CONTENT", "#{finalEducationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSkills() != null) {
            sql.VALUES("SKILLS", "#{skills,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginId() != null) {
            sql.VALUES("LOGIN_ID", "#{loginId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginPw() != null) {
            sql.VALUES("LOGIN_PW", "#{loginPw,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminFlg() != null) {
            sql.VALUES("ADMIN_FLG", "#{adminFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getPrfImgStrgDrctry() != null) {
            sql.VALUES("PRF_IMG_STRG_DRCTRY", "#{prfImgStrgDrctry,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            sql.VALUES("POSTAL_CODE", "#{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNumber() != null) {
            sql.VALUES("PHONE_NUMBER", "#{phoneNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            sql.VALUES("BANK_NAME", "#{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            sql.VALUES("BRANCH_NAME", "#{branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            sql.VALUES("BRANCH_ID", "#{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountType() != null) {
            sql.VALUES("ACCOUNT_TYPE", "#{accountType,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountNumber() != null) {
            sql.VALUES("ACCOUNT_NUMBER", "#{accountNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountName() != null) {
            sql.VALUES("ACCOUNT_NAME", "#{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.VALUES("DELETE_FLG", "#{deleteFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDatetime() != null) {
            sql.VALUES("CREATED_DATETIME", "#{createdDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedUser() != null) {
            sql.VALUES("CREATED_USER", "#{createdUser,jdbcType=INTEGER}");
        }
        
        if (record.getLastModifiedDatetime() != null) {
            sql.VALUES("LAST_MODIFIED_DATETIME", "#{lastModifiedDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastModifiedUser() != null) {
            sql.VALUES("LAST_MODIFIED_USER", "#{lastModifiedUser,jdbcType=INTEGER}");
        }
        
        if (record.getVersionExKey() != null) {
            sql.VALUES("VERSION_EX_KEY", "#{versionExKey,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String selectByExample(Keyst0100Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_ID");
        } else {
            sql.SELECT("USER_ID");
        }
        sql.SELECT("USER_NAME");
        sql.SELECT("USER_NAME_KANA");
        sql.SELECT("GENDER");
        sql.SELECT("AGE");
        sql.SELECT("BIRTHDAY");
        sql.SELECT("NATIONALITY");
        sql.SELECT("PARTNER_FLG");
        sql.SELECT("NEAREST_STATION");
        sql.SELECT("FINAL_EDUCATION_DATE");
        sql.SELECT("FINAL_EDUCATION_CONTENT");
        sql.SELECT("SKILLS");
        sql.SELECT("EMAIL");
        sql.SELECT("LOGIN_ID");
        sql.SELECT("LOGIN_PW");
        sql.SELECT("ADMIN_FLG");
        sql.SELECT("PRF_IMG_STRG_DRCTRY");
        sql.SELECT("POSTAL_CODE");
        sql.SELECT("ADDRESS");
        sql.SELECT("PHONE_NUMBER");
        sql.SELECT("BANK_NAME");
        sql.SELECT("BRANCH_NAME");
        sql.SELECT("BRANCH_ID");
        sql.SELECT("ACCOUNT_TYPE");
        sql.SELECT("ACCOUNT_NUMBER");
        sql.SELECT("ACCOUNT_NAME");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST0100");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Keyst0100 record = (Keyst0100) parameter.get("record");
        Keyst0100Example example = (Keyst0100Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST0100");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("USER_NAME = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNameKana() != null) {
            sql.SET("USER_NAME_KANA = #{record.userNameKana,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("GENDER = #{record.gender,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("AGE = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{record.birthday,jdbcType=DATE}");
        }
        
        if (record.getNationality() != null) {
            sql.SET("NATIONALITY = #{record.nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerFlg() != null) {
            sql.SET("PARTNER_FLG = #{record.partnerFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getNearestStation() != null) {
            sql.SET("NEAREST_STATION = #{record.nearestStation,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalEducationDate() != null) {
            sql.SET("FINAL_EDUCATION_DATE = #{record.finalEducationDate,jdbcType=DATE}");
        }
        
        if (record.getFinalEducationContent() != null) {
            sql.SET("FINAL_EDUCATION_CONTENT = #{record.finalEducationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSkills() != null) {
            sql.SET("SKILLS = #{record.skills,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginId() != null) {
            sql.SET("LOGIN_ID = #{record.loginId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginPw() != null) {
            sql.SET("LOGIN_PW = #{record.loginPw,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminFlg() != null) {
            sql.SET("ADMIN_FLG = #{record.adminFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getPrfImgStrgDrctry() != null) {
            sql.SET("PRF_IMG_STRG_DRCTRY = #{record.prfImgStrgDrctry,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            sql.SET("POSTAL_CODE = #{record.postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNumber() != null) {
            sql.SET("PHONE_NUMBER = #{record.phoneNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            sql.SET("BRANCH_NAME = #{record.branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            sql.SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountType() != null) {
            sql.SET("ACCOUNT_TYPE = #{record.accountType,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountNumber() != null) {
            sql.SET("ACCOUNT_NUMBER = #{record.accountNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountName() != null) {
            sql.SET("ACCOUNT_NAME = #{record.accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{record.deleteFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDatetime() != null) {
            sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedUser() != null) {
            sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        }
        
        if (record.getLastModifiedDatetime() != null) {
            sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastModifiedUser() != null) {
            sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        }
        
        if (record.getVersionExKey() != null) {
            sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST0100");
        
        sql.SET("USER_ID = #{record.userId,jdbcType=INTEGER}");
        sql.SET("USER_NAME = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("USER_NAME_KANA = #{record.userNameKana,jdbcType=VARCHAR}");
        sql.SET("GENDER = #{record.gender,jdbcType=VARCHAR}");
        sql.SET("AGE = #{record.age,jdbcType=INTEGER}");
        sql.SET("BIRTHDAY = #{record.birthday,jdbcType=DATE}");
        sql.SET("NATIONALITY = #{record.nationality,jdbcType=VARCHAR}");
        sql.SET("PARTNER_FLG = #{record.partnerFlg,jdbcType=VARCHAR}");
        sql.SET("NEAREST_STATION = #{record.nearestStation,jdbcType=VARCHAR}");
        sql.SET("FINAL_EDUCATION_DATE = #{record.finalEducationDate,jdbcType=DATE}");
        sql.SET("FINAL_EDUCATION_CONTENT = #{record.finalEducationContent,jdbcType=VARCHAR}");
        sql.SET("SKILLS = #{record.skills,jdbcType=VARCHAR}");
        sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        sql.SET("LOGIN_ID = #{record.loginId,jdbcType=VARCHAR}");
        sql.SET("LOGIN_PW = #{record.loginPw,jdbcType=VARCHAR}");
        sql.SET("ADMIN_FLG = #{record.adminFlg,jdbcType=VARCHAR}");
        sql.SET("PRF_IMG_STRG_DRCTRY = #{record.prfImgStrgDrctry,jdbcType=VARCHAR}");
        sql.SET("POSTAL_CODE = #{record.postalCode,jdbcType=VARCHAR}");
        sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        sql.SET("PHONE_NUMBER = #{record.phoneNumber,jdbcType=VARCHAR}");
        sql.SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        sql.SET("BRANCH_NAME = #{record.branchName,jdbcType=VARCHAR}");
        sql.SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        sql.SET("ACCOUNT_TYPE = #{record.accountType,jdbcType=VARCHAR}");
        sql.SET("ACCOUNT_NUMBER = #{record.accountNumber,jdbcType=VARCHAR}");
        sql.SET("ACCOUNT_NAME = #{record.accountName,jdbcType=VARCHAR}");
        sql.SET("DELETE_FLG = #{record.deleteFlg,jdbcType=VARCHAR}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst0100Example example = (Keyst0100Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst0100 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST0100");
        
        if (record.getUserName() != null) {
            sql.SET("USER_NAME = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNameKana() != null) {
            sql.SET("USER_NAME_KANA = #{userNameKana,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("GENDER = #{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("AGE = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{birthday,jdbcType=DATE}");
        }
        
        if (record.getNationality() != null) {
            sql.SET("NATIONALITY = #{nationality,jdbcType=VARCHAR}");
        }
        
        if (record.getPartnerFlg() != null) {
            sql.SET("PARTNER_FLG = #{partnerFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getNearestStation() != null) {
            sql.SET("NEAREST_STATION = #{nearestStation,jdbcType=VARCHAR}");
        }
        
        if (record.getFinalEducationDate() != null) {
            sql.SET("FINAL_EDUCATION_DATE = #{finalEducationDate,jdbcType=DATE}");
        }
        
        if (record.getFinalEducationContent() != null) {
            sql.SET("FINAL_EDUCATION_CONTENT = #{finalEducationContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSkills() != null) {
            sql.SET("SKILLS = #{skills,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginId() != null) {
            sql.SET("LOGIN_ID = #{loginId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginPw() != null) {
            sql.SET("LOGIN_PW = #{loginPw,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminFlg() != null) {
            sql.SET("ADMIN_FLG = #{adminFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getPrfImgStrgDrctry() != null) {
            sql.SET("PRF_IMG_STRG_DRCTRY = #{prfImgStrgDrctry,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            sql.SET("POSTAL_CODE = #{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNumber() != null) {
            sql.SET("PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("BANK_NAME = #{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            sql.SET("BRANCH_NAME = #{branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            sql.SET("BRANCH_ID = #{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountType() != null) {
            sql.SET("ACCOUNT_TYPE = #{accountType,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountNumber() != null) {
            sql.SET("ACCOUNT_NUMBER = #{accountNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getAccountName() != null) {
            sql.SET("ACCOUNT_NAME = #{accountName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{deleteFlg,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedDatetime() != null) {
            sql.SET("CREATED_DATETIME = #{createdDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedUser() != null) {
            sql.SET("CREATED_USER = #{createdUser,jdbcType=INTEGER}");
        }
        
        if (record.getLastModifiedDatetime() != null) {
            sql.SET("LAST_MODIFIED_DATETIME = #{lastModifiedDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastModifiedUser() != null) {
            sql.SET("LAST_MODIFIED_USER = #{lastModifiedUser,jdbcType=INTEGER}");
        }
        
        if (record.getVersionExKey() != null) {
            sql.SET("VERSION_EX_KEY = #{versionExKey,jdbcType=INTEGER}");
        }
        
        sql.WHERE("USER_ID = #{userId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst0100Example example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}