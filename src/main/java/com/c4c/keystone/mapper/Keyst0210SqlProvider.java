package com.c4c.keystone.mapper;

import com.c4c.keystone.entity.Keyst0210;
import com.c4c.keystone.entity.Keyst0210Example.Criteria;
import com.c4c.keystone.entity.Keyst0210Example.Criterion;
import com.c4c.keystone.entity.Keyst0210Example;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Keyst0210SqlProvider {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String countByExample(Keyst0210Example example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEYST0210");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String deleteByExample(Keyst0210Example example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEYST0210");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String insertSelective(Keyst0210 record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEYST0210");
        
        if (record.getSkillSheetId() != null) {
            sql.VALUES("SKILL_SHEET_ID", "#{skillSheetId,jdbcType=INTEGER}");
        }
        
        if (record.getRefNo() != null) {
            sql.VALUES("REF_NO", "#{refNo,jdbcType=INTEGER}");
        }
        
        if (record.getPrjCode() != null) {
            sql.VALUES("PRJ_CODE", "#{prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.VALUES("PRJ_START_DATE", "#{prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.VALUES("PRJ_END_DATE", "#{prjEndDate,jdbcType=DATE}");
        }
        
        if (record.getBizInCharge() != null) {
            sql.VALUES("BIZ_IN_CHARGE", "#{bizInCharge,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("`COMMENT`", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getDevScale() != null) {
            sql.VALUES("DEV_SCALE", "#{devScale,jdbcType=VARCHAR}");
        }
        
        if (record.getOs() != null) {
            sql.VALUES("OS", "#{os,jdbcType=INTEGER}");
        }
        
        if (record.getDb() != null) {
            sql.VALUES("DB", "#{db,jdbcType=INTEGER}");
        }
        
        if (record.getFwMwTool() != null) {
            sql.VALUES("FW_MW_TOOL", "#{fwMwTool,jdbcType=VARCHAR}");
        }
        
        if (record.getPgLang() != null) {
            sql.VALUES("PG_LANG", "#{pgLang,jdbcType=VARCHAR}");
        }
        
        if (record.getSowManagement() != null) {
            sql.VALUES("SOW_MANAGEMENT", "#{sowManagement,jdbcType=INTEGER}");
        }
        
        if (record.getSowReqDefinition() != null) {
            sql.VALUES("SOW_REQ_DEFINITION", "#{sowReqDefinition,jdbcType=INTEGER}");
        }
        
        if (record.getSowBasicDesign() != null) {
            sql.VALUES("SOW_BASIC_DESIGN", "#{sowBasicDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowDetailDesign() != null) {
            sql.VALUES("SOW_DETAIL_DESIGN", "#{sowDetailDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowImplementation() != null) {
            sql.VALUES("SOW_IMPLEMENTATION", "#{sowImplementation,jdbcType=INTEGER}");
        }
        
        if (record.getSowTest() != null) {
            sql.VALUES("SOW_TEST", "#{sowTest,jdbcType=INTEGER}");
        }
        
        if (record.getSowMaintenanceOperation() != null) {
            sql.VALUES("SOW_MAINTENANCE_OPERATION", "#{sowMaintenanceOperation,jdbcType=INTEGER}");
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
    public String selectByExample(Keyst0210Example example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SKILL_SHEET_ID");
        } else {
            sql.SELECT("SKILL_SHEET_ID");
        }
        sql.SELECT("REF_NO");
        sql.SELECT("PRJ_CODE");
        sql.SELECT("PRJ_START_DATE");
        sql.SELECT("PRJ_END_DATE");
        sql.SELECT("BIZ_IN_CHARGE");
        sql.SELECT("`COMMENT`");
        sql.SELECT("DEV_SCALE");
        sql.SELECT("OS");
        sql.SELECT("DB");
        sql.SELECT("FW_MW_TOOL");
        sql.SELECT("PG_LANG");
        sql.SELECT("SOW_MANAGEMENT");
        sql.SELECT("SOW_REQ_DEFINITION");
        sql.SELECT("SOW_BASIC_DESIGN");
        sql.SELECT("SOW_DETAIL_DESIGN");
        sql.SELECT("SOW_IMPLEMENTATION");
        sql.SELECT("SOW_TEST");
        sql.SELECT("SOW_MAINTENANCE_OPERATION");
        sql.SELECT("CREATED_DATETIME");
        sql.SELECT("CREATED_USER");
        sql.SELECT("LAST_MODIFIED_DATETIME");
        sql.SELECT("LAST_MODIFIED_USER");
        sql.SELECT("VERSION_EX_KEY");
        sql.FROM("KEYST0210");
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
        Keyst0210 record = (Keyst0210) parameter.get("record");
        Keyst0210Example example = (Keyst0210Example) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEYST0210");
        
        if (record.getSkillSheetId() != null) {
            sql.SET("SKILL_SHEET_ID = #{record.skillSheetId,jdbcType=INTEGER}");
        }
        
        if (record.getRefNo() != null) {
            sql.SET("REF_NO = #{record.refNo,jdbcType=INTEGER}");
        }
        
        if (record.getPrjCode() != null) {
            sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.SET("PRJ_START_DATE = #{record.prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.SET("PRJ_END_DATE = #{record.prjEndDate,jdbcType=DATE}");
        }
        
        if (record.getBizInCharge() != null) {
            sql.SET("BIZ_IN_CHARGE = #{record.bizInCharge,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("`COMMENT` = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getDevScale() != null) {
            sql.SET("DEV_SCALE = #{record.devScale,jdbcType=VARCHAR}");
        }
        
        if (record.getOs() != null) {
            sql.SET("OS = #{record.os,jdbcType=INTEGER}");
        }
        
        if (record.getDb() != null) {
            sql.SET("DB = #{record.db,jdbcType=INTEGER}");
        }
        
        if (record.getFwMwTool() != null) {
            sql.SET("FW_MW_TOOL = #{record.fwMwTool,jdbcType=VARCHAR}");
        }
        
        if (record.getPgLang() != null) {
            sql.SET("PG_LANG = #{record.pgLang,jdbcType=VARCHAR}");
        }
        
        if (record.getSowManagement() != null) {
            sql.SET("SOW_MANAGEMENT = #{record.sowManagement,jdbcType=INTEGER}");
        }
        
        if (record.getSowReqDefinition() != null) {
            sql.SET("SOW_REQ_DEFINITION = #{record.sowReqDefinition,jdbcType=INTEGER}");
        }
        
        if (record.getSowBasicDesign() != null) {
            sql.SET("SOW_BASIC_DESIGN = #{record.sowBasicDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowDetailDesign() != null) {
            sql.SET("SOW_DETAIL_DESIGN = #{record.sowDetailDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowImplementation() != null) {
            sql.SET("SOW_IMPLEMENTATION = #{record.sowImplementation,jdbcType=INTEGER}");
        }
        
        if (record.getSowTest() != null) {
            sql.SET("SOW_TEST = #{record.sowTest,jdbcType=INTEGER}");
        }
        
        if (record.getSowMaintenanceOperation() != null) {
            sql.SET("SOW_MAINTENANCE_OPERATION = #{record.sowMaintenanceOperation,jdbcType=INTEGER}");
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
        sql.UPDATE("KEYST0210");
        
        sql.SET("SKILL_SHEET_ID = #{record.skillSheetId,jdbcType=INTEGER}");
        sql.SET("REF_NO = #{record.refNo,jdbcType=INTEGER}");
        sql.SET("PRJ_CODE = #{record.prjCode,jdbcType=VARCHAR}");
        sql.SET("PRJ_START_DATE = #{record.prjStartDate,jdbcType=DATE}");
        sql.SET("PRJ_END_DATE = #{record.prjEndDate,jdbcType=DATE}");
        sql.SET("BIZ_IN_CHARGE = #{record.bizInCharge,jdbcType=VARCHAR}");
        sql.SET("`COMMENT` = #{record.comment,jdbcType=VARCHAR}");
        sql.SET("DEV_SCALE = #{record.devScale,jdbcType=VARCHAR}");
        sql.SET("OS = #{record.os,jdbcType=INTEGER}");
        sql.SET("DB = #{record.db,jdbcType=INTEGER}");
        sql.SET("FW_MW_TOOL = #{record.fwMwTool,jdbcType=VARCHAR}");
        sql.SET("PG_LANG = #{record.pgLang,jdbcType=VARCHAR}");
        sql.SET("SOW_MANAGEMENT = #{record.sowManagement,jdbcType=INTEGER}");
        sql.SET("SOW_REQ_DEFINITION = #{record.sowReqDefinition,jdbcType=INTEGER}");
        sql.SET("SOW_BASIC_DESIGN = #{record.sowBasicDesign,jdbcType=INTEGER}");
        sql.SET("SOW_DETAIL_DESIGN = #{record.sowDetailDesign,jdbcType=INTEGER}");
        sql.SET("SOW_IMPLEMENTATION = #{record.sowImplementation,jdbcType=INTEGER}");
        sql.SET("SOW_TEST = #{record.sowTest,jdbcType=INTEGER}");
        sql.SET("SOW_MAINTENANCE_OPERATION = #{record.sowMaintenanceOperation,jdbcType=INTEGER}");
        sql.SET("CREATED_DATETIME = #{record.createdDatetime,jdbcType=TIMESTAMP}");
        sql.SET("CREATED_USER = #{record.createdUser,jdbcType=INTEGER}");
        sql.SET("LAST_MODIFIED_DATETIME = #{record.lastModifiedDatetime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_MODIFIED_USER = #{record.lastModifiedUser,jdbcType=INTEGER}");
        sql.SET("VERSION_EX_KEY = #{record.versionExKey,jdbcType=INTEGER}");
        
        Keyst0210Example example = (Keyst0210Example) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String updateByPrimaryKeySelective(Keyst0210 record) {
        SQL sql = new SQL();
        sql.UPDATE("KEYST0210");
        
        if (record.getPrjCode() != null) {
            sql.SET("PRJ_CODE = #{prjCode,jdbcType=VARCHAR}");
        }
        
        if (record.getPrjStartDate() != null) {
            sql.SET("PRJ_START_DATE = #{prjStartDate,jdbcType=DATE}");
        }
        
        if (record.getPrjEndDate() != null) {
            sql.SET("PRJ_END_DATE = #{prjEndDate,jdbcType=DATE}");
        }
        
        if (record.getBizInCharge() != null) {
            sql.SET("BIZ_IN_CHARGE = #{bizInCharge,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("`COMMENT` = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getDevScale() != null) {
            sql.SET("DEV_SCALE = #{devScale,jdbcType=VARCHAR}");
        }
        
        if (record.getOs() != null) {
            sql.SET("OS = #{os,jdbcType=INTEGER}");
        }
        
        if (record.getDb() != null) {
            sql.SET("DB = #{db,jdbcType=INTEGER}");
        }
        
        if (record.getFwMwTool() != null) {
            sql.SET("FW_MW_TOOL = #{fwMwTool,jdbcType=VARCHAR}");
        }
        
        if (record.getPgLang() != null) {
            sql.SET("PG_LANG = #{pgLang,jdbcType=VARCHAR}");
        }
        
        if (record.getSowManagement() != null) {
            sql.SET("SOW_MANAGEMENT = #{sowManagement,jdbcType=INTEGER}");
        }
        
        if (record.getSowReqDefinition() != null) {
            sql.SET("SOW_REQ_DEFINITION = #{sowReqDefinition,jdbcType=INTEGER}");
        }
        
        if (record.getSowBasicDesign() != null) {
            sql.SET("SOW_BASIC_DESIGN = #{sowBasicDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowDetailDesign() != null) {
            sql.SET("SOW_DETAIL_DESIGN = #{sowDetailDesign,jdbcType=INTEGER}");
        }
        
        if (record.getSowImplementation() != null) {
            sql.SET("SOW_IMPLEMENTATION = #{sowImplementation,jdbcType=INTEGER}");
        }
        
        if (record.getSowTest() != null) {
            sql.SET("SOW_TEST = #{sowTest,jdbcType=INTEGER}");
        }
        
        if (record.getSowMaintenanceOperation() != null) {
            sql.SET("SOW_MAINTENANCE_OPERATION = #{sowMaintenanceOperation,jdbcType=INTEGER}");
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
        
        sql.WHERE("SKILL_SHEET_ID = #{skillSheetId,jdbcType=INTEGER}");
        sql.WHERE("REF_NO = #{refNo,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected void applyWhere(SQL sql, Keyst0210Example example, boolean includeExamplePhrase) {
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