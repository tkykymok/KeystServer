package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5110;
import com.c4c.keystone.entity.Keyst5110Example.Criteria;
import com.c4c.keystone.entity.Keyst5110Example.Criterion;
import com.c4c.keystone.entity.Keyst5110Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst5110SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst5110Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST5110");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst5110Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST5110");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst5110 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST5110");
        
        if (record.getPrjCode() != null) {
            sql.VALUES("PRJ_CODE", "#{prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getContractPrice() != null) {
            sql.VALUES("CONTRACT_PRICE", "#{contractPrice,jdbcType=INTEGER}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.VALUES("PRJ_START_DATE", "#{prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.VALUES("PRJ_END_DATE", "#{prjEndDate,jdbcType=DATE}");
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
    public String selectByExample(Keyst5110Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("PRJ_CODE");
        } else {
            sql.SELECT("PRJ_CODE");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("CONTRACT_PRICE");
        sql.SELECT("PRJ_START_DATE");
        sql.SELECT("PRJ_END_DATE");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST5110");
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
        Keyst5110 record = (Keyst5110) parameter.get("record");
        Keyst5110Example example = (Keyst5110Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST5110");
        
        if (record.getPrjCode() != null) {
            sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getContractPrice() != null) {
            sql.SET("CONTRACT_PRICE = #{record.contractPrice,jdbcType=INTEGER}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.SET("PRJ_START_DATE = #{record.prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.SET("PRJ_END_DATE = #{record.prjEndDate,jdbcType=DATE}");
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
        sql.UPDATE("KEYST5110");
        
        sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        sql.SET("USER_ID = #{record.userId,jdbcType=INTEGER}");
        sql.SET("CONTRACT_PRICE = #{record.contractPrice,jdbcType=INTEGER}");
        sql.SET("PRJ_START_DATE = #{record.prjStartDate,jdbcType=DATE}");
        sql.SET("PRJ_END_DATE = #{record.prjEndDate,jdbcType=DATE}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst5110Example example = (Keyst5110Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst5110 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST5110");
        
        if (record.getContractPrice() != null) {
            sql.SET("CONTRACT_PRICE = #{contractPrice,jdbcType=INTEGER}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.SET("PRJ_START_DATE = #{prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.SET("PRJ_END_DATE = #{prjEndDate,jdbcType=DATE}");
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
        
        sql.WHERE("PRJ_CODE = #{prjCode,jdbcType=VARCHAR}");
        sql.WHERE("USER_ID = #{userId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst5110Example example, boolean includeExamplePhrase) {
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