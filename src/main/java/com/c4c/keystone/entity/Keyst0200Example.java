package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Keyst0200Example {
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
    public Keyst0200Example() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStrongAreaIsNull() {
            addCriterion("STRONG_AREA is null");
            return (Criteria) this;
        }

        public Criteria andStrongAreaIsNotNull() {
            addCriterion("STRONG_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andStrongAreaEqualTo(String value) {
            addCriterion("STRONG_AREA =", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaNotEqualTo(String value) {
            addCriterion("STRONG_AREA <>", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaGreaterThan(String value) {
            addCriterion("STRONG_AREA >", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaGreaterThanOrEqualTo(String value) {
            addCriterion("STRONG_AREA >=", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaLessThan(String value) {
            addCriterion("STRONG_AREA <", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaLessThanOrEqualTo(String value) {
            addCriterion("STRONG_AREA <=", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaLike(String value) {
            addCriterion("STRONG_AREA like", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaNotLike(String value) {
            addCriterion("STRONG_AREA not like", value, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaIn(List<String> values) {
            addCriterion("STRONG_AREA in", values, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaNotIn(List<String> values) {
            addCriterion("STRONG_AREA not in", values, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaBetween(String value1, String value2) {
            addCriterion("STRONG_AREA between", value1, value2, "strongArea");
            return (Criteria) this;
        }

        public Criteria andStrongAreaNotBetween(String value1, String value2) {
            addCriterion("STRONG_AREA not between", value1, value2, "strongArea");
            return (Criteria) this;
        }

        public Criteria andPrIsNull() {
            addCriterion("PR is null");
            return (Criteria) this;
        }

        public Criteria andPrIsNotNull() {
            addCriterion("PR is not null");
            return (Criteria) this;
        }

        public Criteria andPrEqualTo(String value) {
            addCriterion("PR =", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotEqualTo(String value) {
            addCriterion("PR <>", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThan(String value) {
            addCriterion("PR >", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThanOrEqualTo(String value) {
            addCriterion("PR >=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThan(String value) {
            addCriterion("PR <", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThanOrEqualTo(String value) {
            addCriterion("PR <=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLike(String value) {
            addCriterion("PR like", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotLike(String value) {
            addCriterion("PR not like", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrIn(List<String> values) {
            addCriterion("PR in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotIn(List<String> values) {
            addCriterion("PR not in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrBetween(String value1, String value2) {
            addCriterion("PR between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotBetween(String value1, String value2) {
            addCriterion("PR not between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesIsNull() {
            addCriterion("EVALUATION_OF_SALES is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesIsNotNull() {
            addCriterion("EVALUATION_OF_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesEqualTo(String value) {
            addCriterion("EVALUATION_OF_SALES =", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesNotEqualTo(String value) {
            addCriterion("EVALUATION_OF_SALES <>", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesGreaterThan(String value) {
            addCriterion("EVALUATION_OF_SALES >", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION_OF_SALES >=", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesLessThan(String value) {
            addCriterion("EVALUATION_OF_SALES <", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION_OF_SALES <=", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesLike(String value) {
            addCriterion("EVALUATION_OF_SALES like", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesNotLike(String value) {
            addCriterion("EVALUATION_OF_SALES not like", value, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesIn(List<String> values) {
            addCriterion("EVALUATION_OF_SALES in", values, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesNotIn(List<String> values) {
            addCriterion("EVALUATION_OF_SALES not in", values, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesBetween(String value1, String value2) {
            addCriterion("EVALUATION_OF_SALES between", value1, value2, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andEvaluationOfSalesNotBetween(String value1, String value2) {
            addCriterion("EVALUATION_OF_SALES not between", value1, value2, "evaluationOfSales");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeIsNull() {
            addCriterion("SKILL_SHEET_REG_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeIsNotNull() {
            addCriterion("SKILL_SHEET_REG_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeEqualTo(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME =", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME <>", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME >", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME >=", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeLessThan(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME <", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("SKILL_SHEET_REG_DATETIME <=", value, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeIn(List<LocalDateTime> values) {
            addCriterion("SKILL_SHEET_REG_DATETIME in", values, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("SKILL_SHEET_REG_DATETIME not in", values, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("SKILL_SHEET_REG_DATETIME between", value1, value2, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andSkillSheetRegDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("SKILL_SHEET_REG_DATETIME not between", value1, value2, "skillSheetRegDatetime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(String value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(String value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(String value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(String value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLike(String value) {
            addCriterion("DELETE_FLG like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotLike(String value) {
            addCriterion("DELETE_FLG not like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<String> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<String> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(String value1, String value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
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