package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100Example.Criteria;
import com.c4c.keystone.entity.Keyst5100Example.Criterion;
import com.c4c.keystone.entity.Keyst5100Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst5100SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst5100Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST5100");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst5100Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST5100");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst5100 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST5100");
        
        if (record.getPrjCode() != null) {
            sql.VALUES("PRJ_CODE", "#{prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPrjName() != null) {
            sql.VALUES("PRJ_NAME", "#{prjName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCode() != null) {
            sql.VALUES("CUST_CODE", "#{custCode,jdbcType=VARCHAR}");
        }
        
        if (record.getEndCustName() != null) {
            sql.VALUES("END_CUST_NAME", "#{endCustName,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
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
    public String selectByExample(Keyst5100Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("PRJ_CODE");
        } else {
            sql.SELECT("PRJ_CODE");
        }
        sql.SELECT("PRJ_NAME");
        sql.SELECT("CUST_CODE");
        sql.SELECT("END_CUST_NAME");
        sql.SELECT("REMARK");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST5100");
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
        Keyst5100 record = (Keyst5100) parameter.get("record");
        Keyst5100Example example = (Keyst5100Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST5100");
        
        if (record.getPrjCode() != null) {
            sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPrjName() != null) {
            sql.SET("PRJ_NAME = #{record.prjName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCode() != null) {
            sql.SET("CUST_CODE = #{record.custCode,jdbcType=VARCHAR}");
        }
        
        if (record.getEndCustName() != null) {
            sql.SET("END_CUST_NAME = #{record.endCustName,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
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
        sql.UPDATE("KEYST5100");
        
        sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        sql.SET("PRJ_NAME = #{record.prjName,jdbcType=VARCHAR}");
        sql.SET("CUST_CODE = #{record.custCode,jdbcType=VARCHAR}");
        sql.SET("END_CUST_NAME = #{record.endCustName,jdbcType=VARCHAR}");
        sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("DELETE_FLG = #{record.deleteFlg,jdbcType=VARCHAR}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst5100Example example = (Keyst5100Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst5100 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST5100");
        
        if (record.getPrjName() != null) {
            sql.SET("PRJ_NAME = #{prjName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCode() != null) {
            sql.SET("CUST_CODE = #{custCode,jdbcType=VARCHAR}");
        }
        
        if (record.getEndCustName() != null) {
            sql.SET("END_CUST_NAME = #{endCustName,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
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
        
        sql.WHERE("PRJ_CODE = #{prjCode,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst5100Example example, boolean includeExamplePhrase) {
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