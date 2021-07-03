package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Keyst0100Example {
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
    public Keyst0100Example() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaIsNull() {
            addCriterion("USER_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaIsNotNull() {
            addCriterion("USER_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaEqualTo(String value) {
            addCriterion("USER_NAME_KANA =", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaNotEqualTo(String value) {
            addCriterion("USER_NAME_KANA <>", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaGreaterThan(String value) {
            addCriterion("USER_NAME_KANA >", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_KANA >=", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaLessThan(String value) {
            addCriterion("USER_NAME_KANA <", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_KANA <=", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaLike(String value) {
            addCriterion("USER_NAME_KANA like", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaNotLike(String value) {
            addCriterion("USER_NAME_KANA not like", value, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaIn(List<String> values) {
            addCriterion("USER_NAME_KANA in", values, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaNotIn(List<String> values) {
            addCriterion("USER_NAME_KANA not in", values, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaBetween(String value1, String value2) {
            addCriterion("USER_NAME_KANA between", value1, value2, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andUserNameKanaNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_KANA not between", value1, value2, "userNameKana");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("TEAM is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("TEAM =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("TEAM <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("TEAM >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("TEAM <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("TEAM <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("TEAM like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("TEAM not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("TEAM in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("TEAM not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("TEAM between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("TEAM not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(LocalDate value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(LocalDate value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(LocalDate value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(LocalDate value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(LocalDate value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<LocalDate> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<LocalDate> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(LocalDate value1, LocalDate value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgIsNull() {
            addCriterion("PARTNER_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgIsNotNull() {
            addCriterion("PARTNER_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgEqualTo(String value) {
            addCriterion("PARTNER_FLG =", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgNotEqualTo(String value) {
            addCriterion("PARTNER_FLG <>", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgGreaterThan(String value) {
            addCriterion("PARTNER_FLG >", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_FLG >=", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgLessThan(String value) {
            addCriterion("PARTNER_FLG <", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_FLG <=", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgLike(String value) {
            addCriterion("PARTNER_FLG like", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgNotLike(String value) {
            addCriterion("PARTNER_FLG not like", value, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgIn(List<String> values) {
            addCriterion("PARTNER_FLG in", values, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgNotIn(List<String> values) {
            addCriterion("PARTNER_FLG not in", values, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgBetween(String value1, String value2) {
            addCriterion("PARTNER_FLG between", value1, value2, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andPartnerFlgNotBetween(String value1, String value2) {
            addCriterion("PARTNER_FLG not between", value1, value2, "partnerFlg");
            return (Criteria) this;
        }

        public Criteria andNearestStationIsNull() {
            addCriterion("NEAREST_STATION is null");
            return (Criteria) this;
        }

        public Criteria andNearestStationIsNotNull() {
            addCriterion("NEAREST_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andNearestStationEqualTo(String value) {
            addCriterion("NEAREST_STATION =", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationNotEqualTo(String value) {
            addCriterion("NEAREST_STATION <>", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationGreaterThan(String value) {
            addCriterion("NEAREST_STATION >", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationGreaterThanOrEqualTo(String value) {
            addCriterion("NEAREST_STATION >=", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationLessThan(String value) {
            addCriterion("NEAREST_STATION <", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationLessThanOrEqualTo(String value) {
            addCriterion("NEAREST_STATION <=", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationLike(String value) {
            addCriterion("NEAREST_STATION like", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationNotLike(String value) {
            addCriterion("NEAREST_STATION not like", value, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationIn(List<String> values) {
            addCriterion("NEAREST_STATION in", values, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationNotIn(List<String> values) {
            addCriterion("NEAREST_STATION not in", values, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationBetween(String value1, String value2) {
            addCriterion("NEAREST_STATION between", value1, value2, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andNearestStationNotBetween(String value1, String value2) {
            addCriterion("NEAREST_STATION not between", value1, value2, "nearestStation");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateIsNull() {
            addCriterion("FINAL_EDUCATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateIsNotNull() {
            addCriterion("FINAL_EDUCATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateEqualTo(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE =", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateNotEqualTo(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE <>", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateGreaterThan(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE >", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE >=", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateLessThan(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE <", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("FINAL_EDUCATION_DATE <=", value, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateIn(List<LocalDate> values) {
            addCriterion("FINAL_EDUCATION_DATE in", values, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateNotIn(List<LocalDate> values) {
            addCriterion("FINAL_EDUCATION_DATE not in", values, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("FINAL_EDUCATION_DATE between", value1, value2, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("FINAL_EDUCATION_DATE not between", value1, value2, "finalEducationDate");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentIsNull() {
            addCriterion("FINAL_EDUCATION_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentIsNotNull() {
            addCriterion("FINAL_EDUCATION_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentEqualTo(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT =", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentNotEqualTo(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT <>", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentGreaterThan(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT >", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT >=", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentLessThan(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT <", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentLessThanOrEqualTo(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT <=", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentLike(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT like", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentNotLike(String value) {
            addCriterion("FINAL_EDUCATION_CONTENT not like", value, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentIn(List<String> values) {
            addCriterion("FINAL_EDUCATION_CONTENT in", values, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentNotIn(List<String> values) {
            addCriterion("FINAL_EDUCATION_CONTENT not in", values, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentBetween(String value1, String value2) {
            addCriterion("FINAL_EDUCATION_CONTENT between", value1, value2, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andFinalEducationContentNotBetween(String value1, String value2) {
            addCriterion("FINAL_EDUCATION_CONTENT not between", value1, value2, "finalEducationContent");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNull() {
            addCriterion("SKILLS is null");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNotNull() {
            addCriterion("SKILLS is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsEqualTo(String value) {
            addCriterion("SKILLS =", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotEqualTo(String value) {
            addCriterion("SKILLS <>", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThan(String value) {
            addCriterion("SKILLS >", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLS >=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThan(String value) {
            addCriterion("SKILLS <", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThanOrEqualTo(String value) {
            addCriterion("SKILLS <=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLike(String value) {
            addCriterion("SKILLS like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotLike(String value) {
            addCriterion("SKILLS not like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsIn(List<String> values) {
            addCriterion("SKILLS in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotIn(List<String> values) {
            addCriterion("SKILLS not in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsBetween(String value1, String value2) {
            addCriterion("SKILLS between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotBetween(String value1, String value2) {
            addCriterion("SKILLS not between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("LOGIN_ID =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("LOGIN_ID <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("LOGIN_ID >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("LOGIN_ID <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("LOGIN_ID like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("LOGIN_ID not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("LOGIN_ID in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("LOGIN_ID not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("LOGIN_ID between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNull() {
            addCriterion("LOGIN_PW is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwIsNotNull() {
            addCriterion("LOGIN_PW is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwEqualTo(String value) {
            addCriterion("LOGIN_PW =", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotEqualTo(String value) {
            addCriterion("LOGIN_PW <>", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThan(String value) {
            addCriterion("LOGIN_PW >", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PW >=", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThan(String value) {
            addCriterion("LOGIN_PW <", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PW <=", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwLike(String value) {
            addCriterion("LOGIN_PW like", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotLike(String value) {
            addCriterion("LOGIN_PW not like", value, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwIn(List<String> values) {
            addCriterion("LOGIN_PW in", values, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotIn(List<String> values) {
            addCriterion("LOGIN_PW not in", values, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwBetween(String value1, String value2) {
            addCriterion("LOGIN_PW between", value1, value2, "loginPw");
            return (Criteria) this;
        }

        public Criteria andLoginPwNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PW not between", value1, value2, "loginPw");
            return (Criteria) this;
        }

        public Criteria andAdminFlgIsNull() {
            addCriterion("ADMIN_FLG is null");
            return (Criteria) this;
        }

        public Criteria andAdminFlgIsNotNull() {
            addCriterion("ADMIN_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFlgEqualTo(String value) {
            addCriterion("ADMIN_FLG =", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgNotEqualTo(String value) {
            addCriterion("ADMIN_FLG <>", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgGreaterThan(String value) {
            addCriterion("ADMIN_FLG >", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_FLG >=", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgLessThan(String value) {
            addCriterion("ADMIN_FLG <", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_FLG <=", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgLike(String value) {
            addCriterion("ADMIN_FLG like", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgNotLike(String value) {
            addCriterion("ADMIN_FLG not like", value, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgIn(List<String> values) {
            addCriterion("ADMIN_FLG in", values, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgNotIn(List<String> values) {
            addCriterion("ADMIN_FLG not in", values, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgBetween(String value1, String value2) {
            addCriterion("ADMIN_FLG between", value1, value2, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andAdminFlgNotBetween(String value1, String value2) {
            addCriterion("ADMIN_FLG not between", value1, value2, "adminFlg");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryIsNull() {
            addCriterion("PRF_IMG_STRG_DRCTRY is null");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryIsNotNull() {
            addCriterion("PRF_IMG_STRG_DRCTRY is not null");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryEqualTo(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY =", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryNotEqualTo(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY <>", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryGreaterThan(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY >", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryGreaterThanOrEqualTo(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY >=", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryLessThan(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY <", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryLessThanOrEqualTo(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY <=", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryLike(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY like", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryNotLike(String value) {
            addCriterion("PRF_IMG_STRG_DRCTRY not like", value, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryIn(List<String> values) {
            addCriterion("PRF_IMG_STRG_DRCTRY in", values, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryNotIn(List<String> values) {
            addCriterion("PRF_IMG_STRG_DRCTRY not in", values, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryBetween(String value1, String value2) {
            addCriterion("PRF_IMG_STRG_DRCTRY between", value1, value2, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPrfImgStrgDrctryNotBetween(String value1, String value2) {
            addCriterion("PRF_IMG_STRG_DRCTRY not between", value1, value2, "prfImgStrgDrctry");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("POSTAL_CODE =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("POSTAL_CODE <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("POSTAL_CODE >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_CODE >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("POSTAL_CODE <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("POSTAL_CODE <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("POSTAL_CODE like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("POSTAL_CODE not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("POSTAL_CODE in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("POSTAL_CODE not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("POSTAL_CODE between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("POSTAL_CODE not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("BRANCH_NAME =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("BRANCH_NAME <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("BRANCH_NAME >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("BRANCH_NAME <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("BRANCH_NAME like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("BRANCH_NAME not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("BRANCH_NAME in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("BRANCH_NAME not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("ACCOUNT_TYPE like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("ACCOUNT_TYPE not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("ACCOUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("ACCOUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("ACCOUNT_NUMBER =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("ACCOUNT_NUMBER <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("ACCOUNT_NUMBER >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NUMBER >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("ACCOUNT_NUMBER <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NUMBER <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("ACCOUNT_NUMBER like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("ACCOUNT_NUMBER not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("ACCOUNT_NUMBER in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("ACCOUNT_NUMBER not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NUMBER between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NUMBER not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
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