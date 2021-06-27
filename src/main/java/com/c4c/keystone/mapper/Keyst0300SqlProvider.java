package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300Example.Criteria;
import com.c4c.keystone.entity.Keyst0300Example.Criterion;
import com.c4c.keystone.entity.Keyst0300Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst0300SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst0300Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST0300");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst0300Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST0300");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst0300 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST0300");
        
        if (record.getReserveId() != null) {
            sql.VALUES("RESERVE_ID", "#{reserveId,jdbcType=INTEGER}");
        }
        
        if (record.getImplYearMonth() != null) {
            sql.VALUES("IMPL_YEAR_MONTH", "#{implYearMonth,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerId() != null) {
            sql.VALUES("MANAGER_ID", "#{managerId,jdbcType=INTEGER}");
        }
        
        if (record.getTeam() != null) {
            sql.VALUES("TEAM", "#{team,jdbcType=VARCHAR}");
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
    public String selectByExample(Keyst0300Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("RESERVE_ID");
        } else {
            sql.SELECT("RESERVE_ID");
        }
        sql.SELECT("IMPL_YEAR_MONTH");
        sql.SELECT("MANAGER_ID");
        sql.SELECT("TEAM");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST0300");
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
        Keyst0300 record = (Keyst0300) parameter.get("record");
        Keyst0300Example example = (Keyst0300Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST0300");
        
        if (record.getReserveId() != null) {
            sql.SET("RESERVE_ID = #{record.reserveId,jdbcType=INTEGER}");
        }
        
        if (record.getImplYearMonth() != null) {
            sql.SET("IMPL_YEAR_MONTH = #{record.implYearMonth,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerId() != null) {
            sql.SET("MANAGER_ID = #{record.managerId,jdbcType=INTEGER}");
        }
        
        if (record.getTeam() != null) {
            sql.SET("TEAM = #{record.team,jdbcType=VARCHAR}");
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
        sql.UPDATE("KEYST0300");
        
        sql.SET("RESERVE_ID = #{record.reserveId,jdbcType=INTEGER}");
        sql.SET("IMPL_YEAR_MONTH = #{record.implYearMonth,jdbcType=VARCHAR}");
        sql.SET("MANAGER_ID = #{record.managerId,jdbcType=INTEGER}");
        sql.SET("TEAM = #{record.team,jdbcType=VARCHAR}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst0300Example example = (Keyst0300Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst0300 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST0300");
        
        if (record.getImplYearMonth() != null) {
            sql.SET("IMPL_YEAR_MONTH = #{implYearMonth,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerId() != null) {
            sql.SET("MANAGER_ID = #{managerId,jdbcType=INTEGER}");
        }
        
        if (record.getTeam() != null) {
            sql.SET("TEAM = #{team,jdbcType=VARCHAR}");
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
        
        sql.WHERE("RESERVE_ID = #{reserveId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst0300Example example, boolean includeExamplePhrase) {
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