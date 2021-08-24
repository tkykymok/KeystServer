package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Keyst0210Example {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Keyst0210Example() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSkillSheetIdIsNull() {
            addCriterion("SKILL_SHEET_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdIsNotNull() {
            addCriterion("SKILL_SHEET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdEqualTo(Integer value) {
            addCriterion("SKILL_SHEET_ID =", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdNotEqualTo(Integer value) {
            addCriterion("SKILL_SHEET_ID <>", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdGreaterThan(Integer value) {
            addCriterion("SKILL_SHEET_ID >", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKILL_SHEET_ID >=", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdLessThan(Integer value) {
            addCriterion("SKILL_SHEET_ID <", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdLessThanOrEqualTo(Integer value) {
            addCriterion("SKILL_SHEET_ID <=", value, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdIn(List<Integer> values) {
            addCriterion("SKILL_SHEET_ID in", values, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdNotIn(List<Integer> values) {
            addCriterion("SKILL_SHEET_ID not in", values, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdBetween(Integer value1, Integer value2) {
            addCriterion("SKILL_SHEET_ID between", value1, value2, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andSkillSheetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SKILL_SHEET_ID not between", value1, value2, "skillSheetId");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNull() {
            addCriterion("REF_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNotNull() {
            addCriterion("REF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefNoEqualTo(Integer value) {
            addCriterion("REF_NO =", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotEqualTo(Integer value) {
            addCriterion("REF_NO <>", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThan(Integer value) {
            addCriterion("REF_NO >", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_NO >=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThan(Integer value) {
            addCriterion("REF_NO <", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThanOrEqualTo(Integer value) {
            addCriterion("REF_NO <=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoIn(List<Integer> values) {
            addCriterion("REF_NO in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotIn(List<Integer> values) {
            addCriterion("REF_NO not in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoBetween(Integer value1, Integer value2) {
            addCriterion("REF_NO between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_NO not between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIsNull() {
            addCriterion("PRJ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIsNotNull() {
            addCriterion("PRJ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrjCodeEqualTo(String value) {
            addCriterion("PRJ_CODE =", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotEqualTo(String value) {
            addCriterion("PRJ_CODE <>", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeGreaterThan(String value) {
            addCriterion("PRJ_CODE >", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_CODE >=", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLessThan(String value) {
            addCriterion("PRJ_CODE <", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLessThanOrEqualTo(String value) {
            addCriterion("PRJ_CODE <=", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeLike(String value) {
            addCriterion("PRJ_CODE like", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotLike(String value) {
            addCriterion("PRJ_CODE not like", value, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeIn(List<String> values) {
            addCriterion("PRJ_CODE in", values, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotIn(List<String> values) {
            addCriterion("PRJ_CODE not in", values, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeBetween(String value1, String value2) {
            addCriterion("PRJ_CODE between", value1, value2, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjCodeNotBetween(String value1, String value2) {
            addCriterion("PRJ_CODE not between", value1, value2, "prjCode");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateIsNull() {
            addCriterion("PRJ_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateIsNotNull() {
            addCriterion("PRJ_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateEqualTo(LocalDate value) {
            addCriterion("PRJ_START_DATE =", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateNotEqualTo(LocalDate value) {
            addCriterion("PRJ_START_DATE <>", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateGreaterThan(LocalDate value) {
            addCriterion("PRJ_START_DATE >", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("PRJ_START_DATE >=", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateLessThan(LocalDate value) {
            addCriterion("PRJ_START_DATE <", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("PRJ_START_DATE <=", value, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateIn(List<LocalDate> values) {
            addCriterion("PRJ_START_DATE in", values, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateNotIn(List<LocalDate> values) {
            addCriterion("PRJ_START_DATE not in", values, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PRJ_START_DATE between", value1, value2, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjStartDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PRJ_START_DATE not between", value1, value2, "prjStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateIsNull() {
            addCriterion("PRJ_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateIsNotNull() {
            addCriterion("PRJ_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateEqualTo(LocalDate value) {
            addCriterion("PRJ_END_DATE =", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateNotEqualTo(LocalDate value) {
            addCriterion("PRJ_END_DATE <>", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateGreaterThan(LocalDate value) {
            addCriterion("PRJ_END_DATE >", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("PRJ_END_DATE >=", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateLessThan(LocalDate value) {
            addCriterion("PRJ_END_DATE <", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("PRJ_END_DATE <=", value, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateIn(List<LocalDate> values) {
            addCriterion("PRJ_END_DATE in", values, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateNotIn(List<LocalDate> values) {
            addCriterion("PRJ_END_DATE not in", values, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PRJ_END_DATE between", value1, value2, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjEndDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PRJ_END_DATE not between", value1, value2, "prjEndDate");
            return (Criteria) this;
        }

        public Criteria andBizInChargeIsNull() {
            addCriterion("BIZ_IN_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andBizInChargeIsNotNull() {
            addCriterion("BIZ_IN_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andBizInChargeEqualTo(String value) {
            addCriterion("BIZ_IN_CHARGE =", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeNotEqualTo(String value) {
            addCriterion("BIZ_IN_CHARGE <>", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeGreaterThan(String value) {
            addCriterion("BIZ_IN_CHARGE >", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_IN_CHARGE >=", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeLessThan(String value) {
            addCriterion("BIZ_IN_CHARGE <", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_IN_CHARGE <=", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeLike(String value) {
            addCriterion("BIZ_IN_CHARGE like", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeNotLike(String value) {
            addCriterion("BIZ_IN_CHARGE not like", value, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeIn(List<String> values) {
            addCriterion("BIZ_IN_CHARGE in", values, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeNotIn(List<String> values) {
            addCriterion("BIZ_IN_CHARGE not in", values, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeBetween(String value1, String value2) {
            addCriterion("BIZ_IN_CHARGE between", value1, value2, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andBizInChargeNotBetween(String value1, String value2) {
            addCriterion("BIZ_IN_CHARGE not between", value1, value2, "bizInCharge");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("`COMMENT` is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("`COMMENT` is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("`COMMENT` =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("`COMMENT` <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("`COMMENT` >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("`COMMENT` >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("`COMMENT` <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("`COMMENT` <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("`COMMENT` like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("`COMMENT` not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("`COMMENT` in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("`COMMENT` not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("`COMMENT` between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("`COMMENT` not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDevScaleIsNull() {
            addCriterion("DEV_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andDevScaleIsNotNull() {
            addCriterion("DEV_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andDevScaleEqualTo(String value) {
            addCriterion("DEV_SCALE =", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleNotEqualTo(String value) {
            addCriterion("DEV_SCALE <>", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleGreaterThan(String value) {
            addCriterion("DEV_SCALE >", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleGreaterThanOrEqualTo(String value) {
            addCriterion("DEV_SCALE >=", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleLessThan(String value) {
            addCriterion("DEV_SCALE <", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleLessThanOrEqualTo(String value) {
            addCriterion("DEV_SCALE <=", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleLike(String value) {
            addCriterion("DEV_SCALE like", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleNotLike(String value) {
            addCriterion("DEV_SCALE not like", value, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleIn(List<String> values) {
            addCriterion("DEV_SCALE in", values, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleNotIn(List<String> values) {
            addCriterion("DEV_SCALE not in", values, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleBetween(String value1, String value2) {
            addCriterion("DEV_SCALE between", value1, value2, "devScale");
            return (Criteria) this;
        }

        public Criteria andDevScaleNotBetween(String value1, String value2) {
            addCriterion("DEV_SCALE not between", value1, value2, "devScale");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("OS is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("OS is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(Integer value) {
            addCriterion("OS =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(Integer value) {
            addCriterion("OS <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(Integer value) {
            addCriterion("OS >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(Integer value) {
            addCriterion("OS >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(Integer value) {
            addCriterion("OS <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(Integer value) {
            addCriterion("OS <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<Integer> values) {
            addCriterion("OS in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<Integer> values) {
            addCriterion("OS not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(Integer value1, Integer value2) {
            addCriterion("OS between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(Integer value1, Integer value2) {
            addCriterion("OS not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("DB is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("DB is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(Integer value) {
            addCriterion("DB =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(Integer value) {
            addCriterion("DB <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(Integer value) {
            addCriterion("DB >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(Integer value) {
            addCriterion("DB >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(Integer value) {
            addCriterion("DB <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(Integer value) {
            addCriterion("DB <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<Integer> values) {
            addCriterion("DB in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<Integer> values) {
            addCriterion("DB not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(Integer value1, Integer value2) {
            addCriterion("DB between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(Integer value1, Integer value2) {
            addCriterion("DB not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andFwMwToolIsNull() {
            addCriterion("FW_MW_TOOL is null");
            return (Criteria) this;
        }

        public Criteria andFwMwToolIsNotNull() {
            addCriterion("FW_MW_TOOL is not null");
            return (Criteria) this;
        }

        public Criteria andFwMwToolEqualTo(String value) {
            addCriterion("FW_MW_TOOL =", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolNotEqualTo(String value) {
            addCriterion("FW_MW_TOOL <>", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolGreaterThan(String value) {
            addCriterion("FW_MW_TOOL >", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolGreaterThanOrEqualTo(String value) {
            addCriterion("FW_MW_TOOL >=", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolLessThan(String value) {
            addCriterion("FW_MW_TOOL <", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolLessThanOrEqualTo(String value) {
            addCriterion("FW_MW_TOOL <=", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolLike(String value) {
            addCriterion("FW_MW_TOOL like", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolNotLike(String value) {
            addCriterion("FW_MW_TOOL not like", value, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolIn(List<String> values) {
            addCriterion("FW_MW_TOOL in", values, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolNotIn(List<String> values) {
            addCriterion("FW_MW_TOOL not in", values, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolBetween(String value1, String value2) {
            addCriterion("FW_MW_TOOL between", value1, value2, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andFwMwToolNotBetween(String value1, String value2) {
            addCriterion("FW_MW_TOOL not between", value1, value2, "fwMwTool");
            return (Criteria) this;
        }

        public Criteria andPgLangIsNull() {
            addCriterion("PG_LANG is null");
            return (Criteria) this;
        }

        public Criteria andPgLangIsNotNull() {
            addCriterion("PG_LANG is not null");
            return (Criteria) this;
        }

        public Criteria andPgLangEqualTo(String value) {
            addCriterion("PG_LANG =", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangNotEqualTo(String value) {
            addCriterion("PG_LANG <>", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangGreaterThan(String value) {
            addCriterion("PG_LANG >", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangGreaterThanOrEqualTo(String value) {
            addCriterion("PG_LANG >=", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangLessThan(String value) {
            addCriterion("PG_LANG <", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangLessThanOrEqualTo(String value) {
            addCriterion("PG_LANG <=", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangLike(String value) {
            addCriterion("PG_LANG like", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangNotLike(String value) {
            addCriterion("PG_LANG not like", value, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangIn(List<String> values) {
            addCriterion("PG_LANG in", values, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangNotIn(List<String> values) {
            addCriterion("PG_LANG not in", values, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangBetween(String value1, String value2) {
            addCriterion("PG_LANG between", value1, value2, "pgLang");
            return (Criteria) this;
        }

        public Criteria andPgLangNotBetween(String value1, String value2) {
            addCriterion("PG_LANG not between", value1, value2, "pgLang");
            return (Criteria) this;
        }

        public Criteria andSowManagementIsNull() {
            addCriterion("SOW_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andSowManagementIsNotNull() {
            addCriterion("SOW_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSowManagementEqualTo(Integer value) {
            addCriterion("SOW_MANAGEMENT =", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementNotEqualTo(Integer value) {
            addCriterion("SOW_MANAGEMENT <>", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementGreaterThan(Integer value) {
            addCriterion("SOW_MANAGEMENT >", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_MANAGEMENT >=", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementLessThan(Integer value) {
            addCriterion("SOW_MANAGEMENT <", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_MANAGEMENT <=", value, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementIn(List<Integer> values) {
            addCriterion("SOW_MANAGEMENT in", values, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementNotIn(List<Integer> values) {
            addCriterion("SOW_MANAGEMENT not in", values, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementBetween(Integer value1, Integer value2) {
            addCriterion("SOW_MANAGEMENT between", value1, value2, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowManagementNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_MANAGEMENT not between", value1, value2, "sowManagement");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionIsNull() {
            addCriterion("SOW_REQ_DEFINITION is null");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionIsNotNull() {
            addCriterion("SOW_REQ_DEFINITION is not null");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionEqualTo(Integer value) {
            addCriterion("SOW_REQ_DEFINITION =", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionNotEqualTo(Integer value) {
            addCriterion("SOW_REQ_DEFINITION <>", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionGreaterThan(Integer value) {
            addCriterion("SOW_REQ_DEFINITION >", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_REQ_DEFINITION >=", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionLessThan(Integer value) {
            addCriterion("SOW_REQ_DEFINITION <", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_REQ_DEFINITION <=", value, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionIn(List<Integer> values) {
            addCriterion("SOW_REQ_DEFINITION in", values, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionNotIn(List<Integer> values) {
            addCriterion("SOW_REQ_DEFINITION not in", values, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionBetween(Integer value1, Integer value2) {
            addCriterion("SOW_REQ_DEFINITION between", value1, value2, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowReqDefinitionNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_REQ_DEFINITION not between", value1, value2, "sowReqDefinition");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignIsNull() {
            addCriterion("SOW_BASIC_DESIGN is null");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignIsNotNull() {
            addCriterion("SOW_BASIC_DESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignEqualTo(Integer value) {
            addCriterion("SOW_BASIC_DESIGN =", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignNotEqualTo(Integer value) {
            addCriterion("SOW_BASIC_DESIGN <>", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignGreaterThan(Integer value) {
            addCriterion("SOW_BASIC_DESIGN >", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_BASIC_DESIGN >=", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignLessThan(Integer value) {
            addCriterion("SOW_BASIC_DESIGN <", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_BASIC_DESIGN <=", value, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignIn(List<Integer> values) {
            addCriterion("SOW_BASIC_DESIGN in", values, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignNotIn(List<Integer> values) {
            addCriterion("SOW_BASIC_DESIGN not in", values, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignBetween(Integer value1, Integer value2) {
            addCriterion("SOW_BASIC_DESIGN between", value1, value2, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowBasicDesignNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_BASIC_DESIGN not between", value1, value2, "sowBasicDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignIsNull() {
            addCriterion("SOW_DETAIL_DESIGN is null");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignIsNotNull() {
            addCriterion("SOW_DETAIL_DESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignEqualTo(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN =", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignNotEqualTo(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN <>", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignGreaterThan(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN >", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN >=", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignLessThan(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN <", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_DETAIL_DESIGN <=", value, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignIn(List<Integer> values) {
            addCriterion("SOW_DETAIL_DESIGN in", values, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignNotIn(List<Integer> values) {
            addCriterion("SOW_DETAIL_DESIGN not in", values, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignBetween(Integer value1, Integer value2) {
            addCriterion("SOW_DETAIL_DESIGN between", value1, value2, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowDetailDesignNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_DETAIL_DESIGN not between", value1, value2, "sowDetailDesign");
            return (Criteria) this;
        }

        public Criteria andSowImplementationIsNull() {
            addCriterion("SOW_IMPLEMENTATION is null");
            return (Criteria) this;
        }

        public Criteria andSowImplementationIsNotNull() {
            addCriterion("SOW_IMPLEMENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andSowImplementationEqualTo(Integer value) {
            addCriterion("SOW_IMPLEMENTATION =", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationNotEqualTo(Integer value) {
            addCriterion("SOW_IMPLEMENTATION <>", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationGreaterThan(Integer value) {
            addCriterion("SOW_IMPLEMENTATION >", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_IMPLEMENTATION >=", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationLessThan(Integer value) {
            addCriterion("SOW_IMPLEMENTATION <", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_IMPLEMENTATION <=", value, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationIn(List<Integer> values) {
            addCriterion("SOW_IMPLEMENTATION in", values, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationNotIn(List<Integer> values) {
            addCriterion("SOW_IMPLEMENTATION not in", values, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationBetween(Integer value1, Integer value2) {
            addCriterion("SOW_IMPLEMENTATION between", value1, value2, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowImplementationNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_IMPLEMENTATION not between", value1, value2, "sowImplementation");
            return (Criteria) this;
        }

        public Criteria andSowTestIsNull() {
            addCriterion("SOW_TEST is null");
            return (Criteria) this;
        }

        public Criteria andSowTestIsNotNull() {
            addCriterion("SOW_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andSowTestEqualTo(Integer value) {
            addCriterion("SOW_TEST =", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestNotEqualTo(Integer value) {
            addCriterion("SOW_TEST <>", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestGreaterThan(Integer value) {
            addCriterion("SOW_TEST >", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_TEST >=", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestLessThan(Integer value) {
            addCriterion("SOW_TEST <", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_TEST <=", value, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestIn(List<Integer> values) {
            addCriterion("SOW_TEST in", values, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestNotIn(List<Integer> values) {
            addCriterion("SOW_TEST not in", values, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestBetween(Integer value1, Integer value2) {
            addCriterion("SOW_TEST between", value1, value2, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowTestNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_TEST not between", value1, value2, "sowTest");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationIsNull() {
            addCriterion("SOW_MAINTENANCE_OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationIsNotNull() {
            addCriterion("SOW_MAINTENANCE_OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationEqualTo(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION =", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationNotEqualTo(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION <>", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationGreaterThan(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION >", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION >=", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationLessThan(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION <", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationLessThanOrEqualTo(Integer value) {
            addCriterion("SOW_MAINTENANCE_OPERATION <=", value, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationIn(List<Integer> values) {
            addCriterion("SOW_MAINTENANCE_OPERATION in", values, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationNotIn(List<Integer> values) {
            addCriterion("SOW_MAINTENANCE_OPERATION not in", values, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationBetween(Integer value1, Integer value2) {
            addCriterion("SOW_MAINTENANCE_OPERATION between", value1, value2, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andSowMaintenanceOperationNotBetween(Integer value1, Integer value2) {
            addCriterion("SOW_MAINTENANCE_OPERATION not between", value1, value2, "sowMaintenanceOperation");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNull() {
            addCriterion("CREATED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNotNull() {
            addCriterion("CREATED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME =", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <>", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("CREATED_DATETIME >", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME >=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThan(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("CREATED_DATETIME <=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIn(List<LocalDateTime> values) {
            addCriterion("CREATED_DATETIME in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("CREATED_DATETIME not in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CREATED_DATETIME between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("CREATED_DATETIME not between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(Integer value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(Integer value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(Integer value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(Integer value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<Integer> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<Integer> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIsNull() {
            addCriterion("LAST_MODIFIED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIsNotNull() {
            addCriterion("LAST_MODIFIED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeEqualTo(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME =", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME <>", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME >", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME >=", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeLessThan(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME <", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("LAST_MODIFIED_DATETIME <=", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIn(List<LocalDateTime> values) {
            addCriterion("LAST_MODIFIED_DATETIME in", values, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("LAST_MODIFIED_DATETIME not in", values, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_MODIFIED_DATETIME between", value1, value2, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("LAST_MODIFIED_DATETIME not between", value1, value2, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserIsNull() {
            addCriterion("LAST_MODIFIED_USER is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserIsNotNull() {
            addCriterion("LAST_MODIFIED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_USER =", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserNotEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_USER <>", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserGreaterThan(Integer value) {
            addCriterion("LAST_MODIFIED_USER >", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_USER >=", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserLessThan(Integer value) {
            addCriterion("LAST_MODIFIED_USER <", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_MODIFIED_USER <=", value, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserIn(List<Integer> values) {
            addCriterion("LAST_MODIFIED_USER in", values, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserNotIn(List<Integer> values) {
            addCriterion("LAST_MODIFIED_USER not in", values, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIED_USER between", value1, value2, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andLastModifiedUserNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_MODIFIED_USER not between", value1, value2, "lastModifiedUser");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIsNull() {
            addCriterion("VERSION_EX_KEY is null");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIsNotNull() {
            addCriterion("VERSION_EX_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY =", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY <>", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyGreaterThan(Integer value) {
            addCriterion("VERSION_EX_KEY >", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY >=", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyLessThan(Integer value) {
            addCriterion("VERSION_EX_KEY <", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_EX_KEY <=", value, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyIn(List<Integer> values) {
            addCriterion("VERSION_EX_KEY in", values, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotIn(List<Integer> values) {
            addCriterion("VERSION_EX_KEY not in", values, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_EX_KEY between", value1, value2, "versionExKey");
            return (Criteria) this;
        }

        public Criteria andVersionExKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_EX_KEY not between", value1, value2, "versionExKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}