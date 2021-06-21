package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Keyst5300Example {
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
    public Keyst5300Example() {
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

        public Criteria andSkillCodeIsNull() {
            addCriterion("SKILL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSkillCodeIsNotNull() {
            addCriterion("SKILL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSkillCodeEqualTo(String value) {
            addCriterion("SKILL_CODE =", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeNotEqualTo(String value) {
            addCriterion("SKILL_CODE <>", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeGreaterThan(String value) {
            addCriterion("SKILL_CODE >", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SKILL_CODE >=", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeLessThan(String value) {
            addCriterion("SKILL_CODE <", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeLessThanOrEqualTo(String value) {
            addCriterion("SKILL_CODE <=", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeLike(String value) {
            addCriterion("SKILL_CODE like", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeNotLike(String value) {
            addCriterion("SKILL_CODE not like", value, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeIn(List<String> values) {
            addCriterion("SKILL_CODE in", values, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeNotIn(List<String> values) {
            addCriterion("SKILL_CODE not in", values, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeBetween(String value1, String value2) {
            addCriterion("SKILL_CODE between", value1, value2, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillCodeNotBetween(String value1, String value2) {
            addCriterion("SKILL_CODE not between", value1, value2, "skillCode");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNull() {
            addCriterion("SKILL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNotNull() {
            addCriterion("SKILL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkillNameEqualTo(String value) {
            addCriterion("SKILL_NAME =", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotEqualTo(String value) {
            addCriterion("SKILL_NAME <>", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThan(String value) {
            addCriterion("SKILL_NAME >", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKILL_NAME >=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThan(String value) {
            addCriterion("SKILL_NAME <", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThanOrEqualTo(String value) {
            addCriterion("SKILL_NAME <=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLike(String value) {
            addCriterion("SKILL_NAME like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotLike(String value) {
            addCriterion("SKILL_NAME not like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameIn(List<String> values) {
            addCriterion("SKILL_NAME in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotIn(List<String> values) {
            addCriterion("SKILL_NAME not in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameBetween(String value1, String value2) {
            addCriterion("SKILL_NAME between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotBetween(String value1, String value2) {
            addCriterion("SKILL_NAME not between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andLangFlgIsNull() {
            addCriterion("LANG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andLangFlgIsNotNull() {
            addCriterion("LANG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andLangFlgEqualTo(String value) {
            addCriterion("LANG_FLG =", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgNotEqualTo(String value) {
            addCriterion("LANG_FLG <>", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgGreaterThan(String value) {
            addCriterion("LANG_FLG >", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgGreaterThanOrEqualTo(String value) {
            addCriterion("LANG_FLG >=", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgLessThan(String value) {
            addCriterion("LANG_FLG <", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgLessThanOrEqualTo(String value) {
            addCriterion("LANG_FLG <=", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgLike(String value) {
            addCriterion("LANG_FLG like", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgNotLike(String value) {
            addCriterion("LANG_FLG not like", value, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgIn(List<String> values) {
            addCriterion("LANG_FLG in", values, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgNotIn(List<String> values) {
            addCriterion("LANG_FLG not in", values, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgBetween(String value1, String value2) {
            addCriterion("LANG_FLG between", value1, value2, "langFlg");
            return (Criteria) this;
        }

        public Criteria andLangFlgNotBetween(String value1, String value2) {
            addCriterion("LANG_FLG not between", value1, value2, "langFlg");
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