package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Keyst5100Example {
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
    public Keyst5100Example() {
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

        public Criteria andPrjNameIsNull() {
            addCriterion("PRJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrjNameIsNotNull() {
            addCriterion("PRJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrjNameEqualTo(String value) {
            addCriterion("PRJ_NAME =", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotEqualTo(String value) {
            addCriterion("PRJ_NAME <>", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameGreaterThan(String value) {
            addCriterion("PRJ_NAME >", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_NAME >=", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLessThan(String value) {
            addCriterion("PRJ_NAME <", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLessThanOrEqualTo(String value) {
            addCriterion("PRJ_NAME <=", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameLike(String value) {
            addCriterion("PRJ_NAME like", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotLike(String value) {
            addCriterion("PRJ_NAME not like", value, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameIn(List<String> values) {
            addCriterion("PRJ_NAME in", values, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotIn(List<String> values) {
            addCriterion("PRJ_NAME not in", values, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameBetween(String value1, String value2) {
            addCriterion("PRJ_NAME between", value1, value2, "prjName");
            return (Criteria) this;
        }

        public Criteria andPrjNameNotBetween(String value1, String value2) {
            addCriterion("PRJ_NAME not between", value1, value2, "prjName");
            return (Criteria) this;
        }

        public Criteria andCustCodeIsNull() {
            addCriterion("CUST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustCodeIsNotNull() {
            addCriterion("CUST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustCodeEqualTo(String value) {
            addCriterion("CUST_CODE =", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotEqualTo(String value) {
            addCriterion("CUST_CODE <>", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThan(String value) {
            addCriterion("CUST_CODE >", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_CODE >=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThan(String value) {
            addCriterion("CUST_CODE <", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThanOrEqualTo(String value) {
            addCriterion("CUST_CODE <=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLike(String value) {
            addCriterion("CUST_CODE like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotLike(String value) {
            addCriterion("CUST_CODE not like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeIn(List<String> values) {
            addCriterion("CUST_CODE in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotIn(List<String> values) {
            addCriterion("CUST_CODE not in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeBetween(String value1, String value2) {
            addCriterion("CUST_CODE between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotBetween(String value1, String value2) {
            addCriterion("CUST_CODE not between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andEndCustNameIsNull() {
            addCriterion("END_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEndCustNameIsNotNull() {
            addCriterion("END_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEndCustNameEqualTo(String value) {
            addCriterion("END_CUST_NAME =", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameNotEqualTo(String value) {
            addCriterion("END_CUST_NAME <>", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameGreaterThan(String value) {
            addCriterion("END_CUST_NAME >", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("END_CUST_NAME >=", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameLessThan(String value) {
            addCriterion("END_CUST_NAME <", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameLessThanOrEqualTo(String value) {
            addCriterion("END_CUST_NAME <=", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameLike(String value) {
            addCriterion("END_CUST_NAME like", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameNotLike(String value) {
            addCriterion("END_CUST_NAME not like", value, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameIn(List<String> values) {
            addCriterion("END_CUST_NAME in", values, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameNotIn(List<String> values) {
            addCriterion("END_CUST_NAME not in", values, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameBetween(String value1, String value2) {
            addCriterion("END_CUST_NAME between", value1, value2, "endCustName");
            return (Criteria) this;
        }

        public Criteria andEndCustNameNotBetween(String value1, String value2) {
            addCriterion("END_CUST_NAME not between", value1, value2, "endCustName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andDeleteFlgEqualTo(Integer value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(Integer value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(Integer value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(Integer value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<Integer> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<Integer> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(Integer value1, Integer value2) {
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