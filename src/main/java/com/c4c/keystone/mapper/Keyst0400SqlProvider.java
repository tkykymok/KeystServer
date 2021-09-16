package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0400;
import com.c4c.keystone.entity.Keyst0400Example.Criteria;
import com.c4c.keystone.entity.Keyst0400Example.Criterion;
import com.c4c.keystone.entity.Keyst0400Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst0400SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst0400Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST0400");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst0400Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST0400");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst0400 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST0400");
        
        if (record.getNotificationId() != null) {
            sql.VALUES("NOTIFICATION_ID", "#{notificationId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("TITLE", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("CONTENT", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getNotificationRegId() != null) {
            sql.VALUES("NOTIFICATION_REG_ID", "#{notificationRegId,jdbcType=INTEGER}");
        }
        
        if (record.getNotificationRegDatetime() != null) {
            sql.VALUES("NOTIFICATION_REG_DATETIME", "#{notificationRegDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPostStartDate() != null) {
            sql.VALUES("POST_START_DATE", "#{postStartDate,jdbcType=DATE}");
        }
        
        if (record.getPostEndDate() != null) {
            sql.VALUES("POST_END_DATE", "#{postEndDate,jdbcType=DATE}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.VALUES("DELETE_FLG", "#{deleteFlg,jdbcType=INTEGER}");
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
    public String selectByExample(Keyst0400Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("NOTIFICATION_ID");
        } else {
            sql.SELECT("NOTIFICATION_ID");
        }
        sql.SELECT("TITLE");
        sql.SELECT("CONTENT");
        sql.SELECT("NOTIFICATION_REG_ID");
        sql.SELECT("NOTIFICATION_REG_DATETIME");
        sql.SELECT("POST_START_DATE");
        sql.SELECT("POST_END_DATE");
        sql.SELECT("DELETE_FLG");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST0400");
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
        Keyst0400 record = (Keyst0400) parameter.get("record");
        Keyst0400Example example = (Keyst0400Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST0400");
        
        if (record.getNotificationId() != null) {
            sql.SET("NOTIFICATION_ID = #{record.notificationId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("CONTENT = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getNotificationRegId() != null) {
            sql.SET("NOTIFICATION_REG_ID = #{record.notificationRegId,jdbcType=INTEGER}");
        }
        
        if (record.getNotificationRegDatetime() != null) {
            sql.SET("NOTIFICATION_REG_DATETIME = #{record.notificationRegDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPostStartDate() != null) {
            sql.SET("POST_START_DATE = #{record.postStartDate,jdbcType=DATE}");
        }
        
        if (record.getPostEndDate() != null) {
            sql.SET("POST_END_DATE = #{record.postEndDate,jdbcType=DATE}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{record.deleteFlg,jdbcType=INTEGER}");
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
        sql.UPDATE("KEYST0400");
        
        sql.SET("NOTIFICATION_ID = #{record.notificationId,jdbcType=INTEGER}");
        sql.SET("TITLE = #{record.title,jdbcType=VARCHAR}");
        sql.SET("CONTENT = #{record.content,jdbcType=VARCHAR}");
        sql.SET("NOTIFICATION_REG_ID = #{record.notificationRegId,jdbcType=INTEGER}");
        sql.SET("NOTIFICATION_REG_DATETIME = #{record.notificationRegDatetime,jdbcType=TIMESTAMP}");
        sql.SET("POST_START_DATE = #{record.postStartDate,jdbcType=DATE}");
        sql.SET("POST_END_DATE = #{record.postEndDate,jdbcType=DATE}");
        sql.SET("DELETE_FLG = #{record.deleteFlg,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst0400Example example = (Keyst0400Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst0400 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST0400");
        
        if (record.getTitle() != null) {
            sql.SET("TITLE = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("CONTENT = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getNotificationRegId() != null) {
            sql.SET("NOTIFICATION_REG_ID = #{notificationRegId,jdbcType=INTEGER}");
        }
        
        if (record.getNotificationRegDatetime() != null) {
            sql.SET("NOTIFICATION_REG_DATETIME = #{notificationRegDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPostStartDate() != null) {
            sql.SET("POST_START_DATE = #{postStartDate,jdbcType=DATE}");
        }
        
        if (record.getPostEndDate() != null) {
            sql.SET("POST_END_DATE = #{postEndDate,jdbcType=DATE}");
        }
        
        if (record.getDeleteFlg() != null) {
            sql.SET("DELETE_FLG = #{deleteFlg,jdbcType=INTEGER}");
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
        
        sql.WHERE("NOTIFICATION_ID = #{notificationId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst0400Example example, boolean includeExamplePhrase) {
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