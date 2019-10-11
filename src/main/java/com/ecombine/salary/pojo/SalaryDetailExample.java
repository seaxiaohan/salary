package com.ecombine.salary.pojo;

import java.util.ArrayList;
import java.util.List;

public class SalaryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andJobnoIsNull() {
            addCriterion("jobNo is null");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNotNull() {
            addCriterion("jobNo is not null");
            return (Criteria) this;
        }

        public Criteria andJobnoEqualTo(String value) {
            addCriterion("jobNo =", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotEqualTo(String value) {
            addCriterion("jobNo <>", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThan(String value) {
            addCriterion("jobNo >", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("jobNo >=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThan(String value) {
            addCriterion("jobNo <", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThanOrEqualTo(String value) {
            addCriterion("jobNo <=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLike(String value) {
            addCriterion("jobNo like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotLike(String value) {
            addCriterion("jobNo not like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoIn(List<String> values) {
            addCriterion("jobNo in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotIn(List<String> values) {
            addCriterion("jobNo not in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoBetween(String value1, String value2) {
            addCriterion("jobNo between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotBetween(String value1, String value2) {
            addCriterion("jobNo not between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNull() {
            addCriterion("telNo is null");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNotNull() {
            addCriterion("telNo is not null");
            return (Criteria) this;
        }

        public Criteria andTelnoEqualTo(String value) {
            addCriterion("telNo =", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotEqualTo(String value) {
            addCriterion("telNo <>", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThan(String value) {
            addCriterion("telNo >", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThanOrEqualTo(String value) {
            addCriterion("telNo >=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThan(String value) {
            addCriterion("telNo <", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThanOrEqualTo(String value) {
            addCriterion("telNo <=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLike(String value) {
            addCriterion("telNo like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotLike(String value) {
            addCriterion("telNo not like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoIn(List<String> values) {
            addCriterion("telNo in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotIn(List<String> values) {
            addCriterion("telNo not in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoBetween(String value1, String value2) {
            addCriterion("telNo between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotBetween(String value1, String value2) {
            addCriterion("telNo not between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andWagedbIsNull() {
            addCriterion("wageDb is null");
            return (Criteria) this;
        }

        public Criteria andWagedbIsNotNull() {
            addCriterion("wageDb is not null");
            return (Criteria) this;
        }

        public Criteria andWagedbEqualTo(String value) {
            addCriterion("wageDb =", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbNotEqualTo(String value) {
            addCriterion("wageDb <>", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbGreaterThan(String value) {
            addCriterion("wageDb >", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbGreaterThanOrEqualTo(String value) {
            addCriterion("wageDb >=", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbLessThan(String value) {
            addCriterion("wageDb <", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbLessThanOrEqualTo(String value) {
            addCriterion("wageDb <=", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbLike(String value) {
            addCriterion("wageDb like", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbNotLike(String value) {
            addCriterion("wageDb not like", value, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbIn(List<String> values) {
            addCriterion("wageDb in", values, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbNotIn(List<String> values) {
            addCriterion("wageDb not in", values, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbBetween(String value1, String value2) {
            addCriterion("wageDb between", value1, value2, "wagedb");
            return (Criteria) this;
        }

        public Criteria andWagedbNotBetween(String value1, String value2) {
            addCriterion("wageDb not between", value1, value2, "wagedb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbIsNull() {
            addCriterion("jxgzblDb is null");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbIsNotNull() {
            addCriterion("jxgzblDb is not null");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbEqualTo(String value) {
            addCriterion("jxgzblDb =", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbNotEqualTo(String value) {
            addCriterion("jxgzblDb <>", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbGreaterThan(String value) {
            addCriterion("jxgzblDb >", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbGreaterThanOrEqualTo(String value) {
            addCriterion("jxgzblDb >=", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbLessThan(String value) {
            addCriterion("jxgzblDb <", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbLessThanOrEqualTo(String value) {
            addCriterion("jxgzblDb <=", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbLike(String value) {
            addCriterion("jxgzblDb like", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbNotLike(String value) {
            addCriterion("jxgzblDb not like", value, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbIn(List<String> values) {
            addCriterion("jxgzblDb in", values, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbNotIn(List<String> values) {
            addCriterion("jxgzblDb not in", values, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbBetween(String value1, String value2) {
            addCriterion("jxgzblDb between", value1, value2, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andJxgzbldbNotBetween(String value1, String value2) {
            addCriterion("jxgzblDb not between", value1, value2, "jxgzbldb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbIsNull() {
            addCriterion("yfjxgzDb is null");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbIsNotNull() {
            addCriterion("yfjxgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbEqualTo(String value) {
            addCriterion("yfjxgzDb =", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbNotEqualTo(String value) {
            addCriterion("yfjxgzDb <>", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbGreaterThan(String value) {
            addCriterion("yfjxgzDb >", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("yfjxgzDb >=", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbLessThan(String value) {
            addCriterion("yfjxgzDb <", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbLessThanOrEqualTo(String value) {
            addCriterion("yfjxgzDb <=", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbLike(String value) {
            addCriterion("yfjxgzDb like", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbNotLike(String value) {
            addCriterion("yfjxgzDb not like", value, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbIn(List<String> values) {
            addCriterion("yfjxgzDb in", values, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbNotIn(List<String> values) {
            addCriterion("yfjxgzDb not in", values, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbBetween(String value1, String value2) {
            addCriterion("yfjxgzDb between", value1, value2, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andYfjxgzdbNotBetween(String value1, String value2) {
            addCriterion("yfjxgzDb not between", value1, value2, "yfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbIsNull() {
            addCriterion("jxxsDb is null");
            return (Criteria) this;
        }

        public Criteria andJxxsdbIsNotNull() {
            addCriterion("jxxsDb is not null");
            return (Criteria) this;
        }

        public Criteria andJxxsdbEqualTo(String value) {
            addCriterion("jxxsDb =", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbNotEqualTo(String value) {
            addCriterion("jxxsDb <>", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbGreaterThan(String value) {
            addCriterion("jxxsDb >", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbGreaterThanOrEqualTo(String value) {
            addCriterion("jxxsDb >=", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbLessThan(String value) {
            addCriterion("jxxsDb <", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbLessThanOrEqualTo(String value) {
            addCriterion("jxxsDb <=", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbLike(String value) {
            addCriterion("jxxsDb like", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbNotLike(String value) {
            addCriterion("jxxsDb not like", value, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbIn(List<String> values) {
            addCriterion("jxxsDb in", values, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbNotIn(List<String> values) {
            addCriterion("jxxsDb not in", values, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbBetween(String value1, String value2) {
            addCriterion("jxxsDb between", value1, value2, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andJxxsdbNotBetween(String value1, String value2) {
            addCriterion("jxxsDb not between", value1, value2, "jxxsdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbIsNull() {
            addCriterion("sfjxgzDb is null");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbIsNotNull() {
            addCriterion("sfjxgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbEqualTo(String value) {
            addCriterion("sfjxgzDb =", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbNotEqualTo(String value) {
            addCriterion("sfjxgzDb <>", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbGreaterThan(String value) {
            addCriterion("sfjxgzDb >", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("sfjxgzDb >=", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbLessThan(String value) {
            addCriterion("sfjxgzDb <", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbLessThanOrEqualTo(String value) {
            addCriterion("sfjxgzDb <=", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbLike(String value) {
            addCriterion("sfjxgzDb like", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbNotLike(String value) {
            addCriterion("sfjxgzDb not like", value, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbIn(List<String> values) {
            addCriterion("sfjxgzDb in", values, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbNotIn(List<String> values) {
            addCriterion("sfjxgzDb not in", values, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbBetween(String value1, String value2) {
            addCriterion("sfjxgzDb between", value1, value2, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andSfjxgzdbNotBetween(String value1, String value2) {
            addCriterion("sfjxgzDb not between", value1, value2, "sfjxgzdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbIsNull() {
            addCriterion("gwbtDb is null");
            return (Criteria) this;
        }

        public Criteria andGwbtdbIsNotNull() {
            addCriterion("gwbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andGwbtdbEqualTo(String value) {
            addCriterion("gwbtDb =", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbNotEqualTo(String value) {
            addCriterion("gwbtDb <>", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbGreaterThan(String value) {
            addCriterion("gwbtDb >", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("gwbtDb >=", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbLessThan(String value) {
            addCriterion("gwbtDb <", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbLessThanOrEqualTo(String value) {
            addCriterion("gwbtDb <=", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbLike(String value) {
            addCriterion("gwbtDb like", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbNotLike(String value) {
            addCriterion("gwbtDb not like", value, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbIn(List<String> values) {
            addCriterion("gwbtDb in", values, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbNotIn(List<String> values) {
            addCriterion("gwbtDb not in", values, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbBetween(String value1, String value2) {
            addCriterion("gwbtDb between", value1, value2, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andGwbtdbNotBetween(String value1, String value2) {
            addCriterion("gwbtDb not between", value1, value2, "gwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbIsNull() {
            addCriterion("zwbtDb is null");
            return (Criteria) this;
        }

        public Criteria andZwbtdbIsNotNull() {
            addCriterion("zwbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andZwbtdbEqualTo(String value) {
            addCriterion("zwbtDb =", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbNotEqualTo(String value) {
            addCriterion("zwbtDb <>", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbGreaterThan(String value) {
            addCriterion("zwbtDb >", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("zwbtDb >=", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbLessThan(String value) {
            addCriterion("zwbtDb <", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbLessThanOrEqualTo(String value) {
            addCriterion("zwbtDb <=", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbLike(String value) {
            addCriterion("zwbtDb like", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbNotLike(String value) {
            addCriterion("zwbtDb not like", value, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbIn(List<String> values) {
            addCriterion("zwbtDb in", values, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbNotIn(List<String> values) {
            addCriterion("zwbtDb not in", values, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbBetween(String value1, String value2) {
            addCriterion("zwbtDb between", value1, value2, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbtdbNotBetween(String value1, String value2) {
            addCriterion("zwbtDb not between", value1, value2, "zwbtdb");
            return (Criteria) this;
        }

        public Criteria andGxjldbIsNull() {
            addCriterion("gxjlDb is null");
            return (Criteria) this;
        }

        public Criteria andGxjldbIsNotNull() {
            addCriterion("gxjlDb is not null");
            return (Criteria) this;
        }

        public Criteria andGxjldbEqualTo(String value) {
            addCriterion("gxjlDb =", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbNotEqualTo(String value) {
            addCriterion("gxjlDb <>", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbGreaterThan(String value) {
            addCriterion("gxjlDb >", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbGreaterThanOrEqualTo(String value) {
            addCriterion("gxjlDb >=", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbLessThan(String value) {
            addCriterion("gxjlDb <", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbLessThanOrEqualTo(String value) {
            addCriterion("gxjlDb <=", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbLike(String value) {
            addCriterion("gxjlDb like", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbNotLike(String value) {
            addCriterion("gxjlDb not like", value, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbIn(List<String> values) {
            addCriterion("gxjlDb in", values, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbNotIn(List<String> values) {
            addCriterion("gxjlDb not in", values, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbBetween(String value1, String value2) {
            addCriterion("gxjlDb between", value1, value2, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxjldbNotBetween(String value1, String value2) {
            addCriterion("gxjlDb not between", value1, value2, "gxjldb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbIsNull() {
            addCriterion("gxcfDb is null");
            return (Criteria) this;
        }

        public Criteria andGxcfdbIsNotNull() {
            addCriterion("gxcfDb is not null");
            return (Criteria) this;
        }

        public Criteria andGxcfdbEqualTo(String value) {
            addCriterion("gxcfDb =", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbNotEqualTo(String value) {
            addCriterion("gxcfDb <>", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbGreaterThan(String value) {
            addCriterion("gxcfDb >", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbGreaterThanOrEqualTo(String value) {
            addCriterion("gxcfDb >=", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbLessThan(String value) {
            addCriterion("gxcfDb <", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbLessThanOrEqualTo(String value) {
            addCriterion("gxcfDb <=", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbLike(String value) {
            addCriterion("gxcfDb like", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbNotLike(String value) {
            addCriterion("gxcfDb not like", value, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbIn(List<String> values) {
            addCriterion("gxcfDb in", values, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbNotIn(List<String> values) {
            addCriterion("gxcfDb not in", values, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbBetween(String value1, String value2) {
            addCriterion("gxcfDb between", value1, value2, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andGxcfdbNotBetween(String value1, String value2) {
            addCriterion("gxcfDb not between", value1, value2, "gxcfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbIsNull() {
            addCriterion("jbfDb is null");
            return (Criteria) this;
        }

        public Criteria andJbfdbIsNotNull() {
            addCriterion("jbfDb is not null");
            return (Criteria) this;
        }

        public Criteria andJbfdbEqualTo(String value) {
            addCriterion("jbfDb =", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbNotEqualTo(String value) {
            addCriterion("jbfDb <>", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbGreaterThan(String value) {
            addCriterion("jbfDb >", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbGreaterThanOrEqualTo(String value) {
            addCriterion("jbfDb >=", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbLessThan(String value) {
            addCriterion("jbfDb <", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbLessThanOrEqualTo(String value) {
            addCriterion("jbfDb <=", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbLike(String value) {
            addCriterion("jbfDb like", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbNotLike(String value) {
            addCriterion("jbfDb not like", value, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbIn(List<String> values) {
            addCriterion("jbfDb in", values, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbNotIn(List<String> values) {
            addCriterion("jbfDb not in", values, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbBetween(String value1, String value2) {
            addCriterion("jbfDb between", value1, value2, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andJbfdbNotBetween(String value1, String value2) {
            addCriterion("jbfDb not between", value1, value2, "jbfdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbIsNull() {
            addCriterion("kqjgzDb is null");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbIsNotNull() {
            addCriterion("kqjgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbEqualTo(String value) {
            addCriterion("kqjgzDb =", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbNotEqualTo(String value) {
            addCriterion("kqjgzDb <>", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbGreaterThan(String value) {
            addCriterion("kqjgzDb >", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("kqjgzDb >=", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbLessThan(String value) {
            addCriterion("kqjgzDb <", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbLessThanOrEqualTo(String value) {
            addCriterion("kqjgzDb <=", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbLike(String value) {
            addCriterion("kqjgzDb like", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbNotLike(String value) {
            addCriterion("kqjgzDb not like", value, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbIn(List<String> values) {
            addCriterion("kqjgzDb in", values, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbNotIn(List<String> values) {
            addCriterion("kqjgzDb not in", values, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbBetween(String value1, String value2) {
            addCriterion("kqjgzDb between", value1, value2, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andKqjgzdbNotBetween(String value1, String value2) {
            addCriterion("kqjgzDb not between", value1, value2, "kqjgzdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbIsNull() {
            addCriterion("cfbtDb is null");
            return (Criteria) this;
        }

        public Criteria andCfbtdbIsNotNull() {
            addCriterion("cfbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andCfbtdbEqualTo(String value) {
            addCriterion("cfbtDb =", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbNotEqualTo(String value) {
            addCriterion("cfbtDb <>", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbGreaterThan(String value) {
            addCriterion("cfbtDb >", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("cfbtDb >=", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbLessThan(String value) {
            addCriterion("cfbtDb <", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbLessThanOrEqualTo(String value) {
            addCriterion("cfbtDb <=", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbLike(String value) {
            addCriterion("cfbtDb like", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbNotLike(String value) {
            addCriterion("cfbtDb not like", value, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbIn(List<String> values) {
            addCriterion("cfbtDb in", values, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbNotIn(List<String> values) {
            addCriterion("cfbtDb not in", values, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbBetween(String value1, String value2) {
            addCriterion("cfbtDb between", value1, value2, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andCfbtdbNotBetween(String value1, String value2) {
            addCriterion("cfbtDb not between", value1, value2, "cfbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbIsNull() {
            addCriterion("gzbtDb is null");
            return (Criteria) this;
        }

        public Criteria andGzbtdbIsNotNull() {
            addCriterion("gzbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andGzbtdbEqualTo(String value) {
            addCriterion("gzbtDb =", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbNotEqualTo(String value) {
            addCriterion("gzbtDb <>", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbGreaterThan(String value) {
            addCriterion("gzbtDb >", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("gzbtDb >=", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbLessThan(String value) {
            addCriterion("gzbtDb <", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbLessThanOrEqualTo(String value) {
            addCriterion("gzbtDb <=", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbLike(String value) {
            addCriterion("gzbtDb like", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbNotLike(String value) {
            addCriterion("gzbtDb not like", value, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbIn(List<String> values) {
            addCriterion("gzbtDb in", values, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbNotIn(List<String> values) {
            addCriterion("gzbtDb not in", values, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbBetween(String value1, String value2) {
            addCriterion("gzbtDb between", value1, value2, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzbtdbNotBetween(String value1, String value2) {
            addCriterion("gzbtDb not between", value1, value2, "gzbtdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbIsNull() {
            addCriterion("gzkxDb is null");
            return (Criteria) this;
        }

        public Criteria andGzkxdbIsNotNull() {
            addCriterion("gzkxDb is not null");
            return (Criteria) this;
        }

        public Criteria andGzkxdbEqualTo(String value) {
            addCriterion("gzkxDb =", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbNotEqualTo(String value) {
            addCriterion("gzkxDb <>", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbGreaterThan(String value) {
            addCriterion("gzkxDb >", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbGreaterThanOrEqualTo(String value) {
            addCriterion("gzkxDb >=", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbLessThan(String value) {
            addCriterion("gzkxDb <", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbLessThanOrEqualTo(String value) {
            addCriterion("gzkxDb <=", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbLike(String value) {
            addCriterion("gzkxDb like", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbNotLike(String value) {
            addCriterion("gzkxDb not like", value, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbIn(List<String> values) {
            addCriterion("gzkxDb in", values, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbNotIn(List<String> values) {
            addCriterion("gzkxDb not in", values, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbBetween(String value1, String value2) {
            addCriterion("gzkxDb between", value1, value2, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andGzkxdbNotBetween(String value1, String value2) {
            addCriterion("gzkxDb not between", value1, value2, "gzkxdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbIsNull() {
            addCriterion("yfgzhjDb is null");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbIsNotNull() {
            addCriterion("yfgzhjDb is not null");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbEqualTo(String value) {
            addCriterion("yfgzhjDb =", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbNotEqualTo(String value) {
            addCriterion("yfgzhjDb <>", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbGreaterThan(String value) {
            addCriterion("yfgzhjDb >", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbGreaterThanOrEqualTo(String value) {
            addCriterion("yfgzhjDb >=", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbLessThan(String value) {
            addCriterion("yfgzhjDb <", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbLessThanOrEqualTo(String value) {
            addCriterion("yfgzhjDb <=", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbLike(String value) {
            addCriterion("yfgzhjDb like", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbNotLike(String value) {
            addCriterion("yfgzhjDb not like", value, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbIn(List<String> values) {
            addCriterion("yfgzhjDb in", values, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbNotIn(List<String> values) {
            addCriterion("yfgzhjDb not in", values, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbBetween(String value1, String value2) {
            addCriterion("yfgzhjDb between", value1, value2, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andYfgzhjdbNotBetween(String value1, String value2) {
            addCriterion("yfgzhjDb not between", value1, value2, "yfgzhjdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbIsNull() {
            addCriterion("dkbxfDb is null");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbIsNotNull() {
            addCriterion("dkbxfDb is not null");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbEqualTo(String value) {
            addCriterion("dkbxfDb =", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbNotEqualTo(String value) {
            addCriterion("dkbxfDb <>", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbGreaterThan(String value) {
            addCriterion("dkbxfDb >", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbGreaterThanOrEqualTo(String value) {
            addCriterion("dkbxfDb >=", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbLessThan(String value) {
            addCriterion("dkbxfDb <", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbLessThanOrEqualTo(String value) {
            addCriterion("dkbxfDb <=", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbLike(String value) {
            addCriterion("dkbxfDb like", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbNotLike(String value) {
            addCriterion("dkbxfDb not like", value, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbIn(List<String> values) {
            addCriterion("dkbxfDb in", values, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbNotIn(List<String> values) {
            addCriterion("dkbxfDb not in", values, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbBetween(String value1, String value2) {
            addCriterion("dkbxfDb between", value1, value2, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkbxfdbNotBetween(String value1, String value2) {
            addCriterion("dkbxfDb not between", value1, value2, "dkbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbIsNull() {
            addCriterion("dkgjjDb is null");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbIsNotNull() {
            addCriterion("dkgjjDb is not null");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbEqualTo(String value) {
            addCriterion("dkgjjDb =", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbNotEqualTo(String value) {
            addCriterion("dkgjjDb <>", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbGreaterThan(String value) {
            addCriterion("dkgjjDb >", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbGreaterThanOrEqualTo(String value) {
            addCriterion("dkgjjDb >=", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbLessThan(String value) {
            addCriterion("dkgjjDb <", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbLessThanOrEqualTo(String value) {
            addCriterion("dkgjjDb <=", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbLike(String value) {
            addCriterion("dkgjjDb like", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbNotLike(String value) {
            addCriterion("dkgjjDb not like", value, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbIn(List<String> values) {
            addCriterion("dkgjjDb in", values, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbNotIn(List<String> values) {
            addCriterion("dkgjjDb not in", values, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbBetween(String value1, String value2) {
            addCriterion("dkgjjDb between", value1, value2, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andDkgjjdbNotBetween(String value1, String value2) {
            addCriterion("dkgjjDb not between", value1, value2, "dkgjjdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbIsNull() {
            addCriterion("gjjcbDb is null");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbIsNotNull() {
            addCriterion("gjjcbDb is not null");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbEqualTo(String value) {
            addCriterion("gjjcbDb =", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbNotEqualTo(String value) {
            addCriterion("gjjcbDb <>", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbGreaterThan(String value) {
            addCriterion("gjjcbDb >", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbGreaterThanOrEqualTo(String value) {
            addCriterion("gjjcbDb >=", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbLessThan(String value) {
            addCriterion("gjjcbDb <", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbLessThanOrEqualTo(String value) {
            addCriterion("gjjcbDb <=", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbLike(String value) {
            addCriterion("gjjcbDb like", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbNotLike(String value) {
            addCriterion("gjjcbDb not like", value, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbIn(List<String> values) {
            addCriterion("gjjcbDb in", values, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbNotIn(List<String> values) {
            addCriterion("gjjcbDb not in", values, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbBetween(String value1, String value2) {
            addCriterion("gjjcbDb between", value1, value2, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andGjjcbdbNotBetween(String value1, String value2) {
            addCriterion("gjjcbDb not between", value1, value2, "gjjcbdb");
            return (Criteria) this;
        }

        public Criteria andYssdedbIsNull() {
            addCriterion("yssdeDb is null");
            return (Criteria) this;
        }

        public Criteria andYssdedbIsNotNull() {
            addCriterion("yssdeDb is not null");
            return (Criteria) this;
        }

        public Criteria andYssdedbEqualTo(String value) {
            addCriterion("yssdeDb =", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbNotEqualTo(String value) {
            addCriterion("yssdeDb <>", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbGreaterThan(String value) {
            addCriterion("yssdeDb >", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbGreaterThanOrEqualTo(String value) {
            addCriterion("yssdeDb >=", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbLessThan(String value) {
            addCriterion("yssdeDb <", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbLessThanOrEqualTo(String value) {
            addCriterion("yssdeDb <=", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbLike(String value) {
            addCriterion("yssdeDb like", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbNotLike(String value) {
            addCriterion("yssdeDb not like", value, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbIn(List<String> values) {
            addCriterion("yssdeDb in", values, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbNotIn(List<String> values) {
            addCriterion("yssdeDb not in", values, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbBetween(String value1, String value2) {
            addCriterion("yssdeDb between", value1, value2, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andYssdedbNotBetween(String value1, String value2) {
            addCriterion("yssdeDb not between", value1, value2, "yssdedb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbIsNull() {
            addCriterion("kgrsdsDb is null");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbIsNotNull() {
            addCriterion("kgrsdsDb is not null");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbEqualTo(String value) {
            addCriterion("kgrsdsDb =", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbNotEqualTo(String value) {
            addCriterion("kgrsdsDb <>", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbGreaterThan(String value) {
            addCriterion("kgrsdsDb >", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbGreaterThanOrEqualTo(String value) {
            addCriterion("kgrsdsDb >=", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbLessThan(String value) {
            addCriterion("kgrsdsDb <", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbLessThanOrEqualTo(String value) {
            addCriterion("kgrsdsDb <=", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbLike(String value) {
            addCriterion("kgrsdsDb like", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbNotLike(String value) {
            addCriterion("kgrsdsDb not like", value, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbIn(List<String> values) {
            addCriterion("kgrsdsDb in", values, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbNotIn(List<String> values) {
            addCriterion("kgrsdsDb not in", values, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbBetween(String value1, String value2) {
            addCriterion("kgrsdsDb between", value1, value2, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andKgrsdsdbNotBetween(String value1, String value2) {
            addCriterion("kgrsdsDb not between", value1, value2, "kgrsdsdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbIsNull() {
            addCriterion("dkgfDb is null");
            return (Criteria) this;
        }

        public Criteria andDkgfdbIsNotNull() {
            addCriterion("dkgfDb is not null");
            return (Criteria) this;
        }

        public Criteria andDkgfdbEqualTo(String value) {
            addCriterion("dkgfDb =", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbNotEqualTo(String value) {
            addCriterion("dkgfDb <>", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbGreaterThan(String value) {
            addCriterion("dkgfDb >", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbGreaterThanOrEqualTo(String value) {
            addCriterion("dkgfDb >=", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbLessThan(String value) {
            addCriterion("dkgfDb <", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbLessThanOrEqualTo(String value) {
            addCriterion("dkgfDb <=", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbLike(String value) {
            addCriterion("dkgfDb like", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbNotLike(String value) {
            addCriterion("dkgfDb not like", value, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbIn(List<String> values) {
            addCriterion("dkgfDb in", values, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbNotIn(List<String> values) {
            addCriterion("dkgfDb not in", values, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbBetween(String value1, String value2) {
            addCriterion("dkgfDb between", value1, value2, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andDkgfdbNotBetween(String value1, String value2) {
            addCriterion("dkgfDb not between", value1, value2, "dkgfdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbIsNull() {
            addCriterion("kqtDb is null");
            return (Criteria) this;
        }

        public Criteria andKqtdbIsNotNull() {
            addCriterion("kqtDb is not null");
            return (Criteria) this;
        }

        public Criteria andKqtdbEqualTo(String value) {
            addCriterion("kqtDb =", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbNotEqualTo(String value) {
            addCriterion("kqtDb <>", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbGreaterThan(String value) {
            addCriterion("kqtDb >", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbGreaterThanOrEqualTo(String value) {
            addCriterion("kqtDb >=", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbLessThan(String value) {
            addCriterion("kqtDb <", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbLessThanOrEqualTo(String value) {
            addCriterion("kqtDb <=", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbLike(String value) {
            addCriterion("kqtDb like", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbNotLike(String value) {
            addCriterion("kqtDb not like", value, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbIn(List<String> values) {
            addCriterion("kqtDb in", values, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbNotIn(List<String> values) {
            addCriterion("kqtDb not in", values, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbBetween(String value1, String value2) {
            addCriterion("kqtDb between", value1, value2, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKqtdbNotBetween(String value1, String value2) {
            addCriterion("kqtDb not between", value1, value2, "kqtdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbIsNull() {
            addCriterion("kkhjDb is null");
            return (Criteria) this;
        }

        public Criteria andKkhjdbIsNotNull() {
            addCriterion("kkhjDb is not null");
            return (Criteria) this;
        }

        public Criteria andKkhjdbEqualTo(String value) {
            addCriterion("kkhjDb =", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbNotEqualTo(String value) {
            addCriterion("kkhjDb <>", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbGreaterThan(String value) {
            addCriterion("kkhjDb >", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbGreaterThanOrEqualTo(String value) {
            addCriterion("kkhjDb >=", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbLessThan(String value) {
            addCriterion("kkhjDb <", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbLessThanOrEqualTo(String value) {
            addCriterion("kkhjDb <=", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbLike(String value) {
            addCriterion("kkhjDb like", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbNotLike(String value) {
            addCriterion("kkhjDb not like", value, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbIn(List<String> values) {
            addCriterion("kkhjDb in", values, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbNotIn(List<String> values) {
            addCriterion("kkhjDb not in", values, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbBetween(String value1, String value2) {
            addCriterion("kkhjDb between", value1, value2, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andKkhjdbNotBetween(String value1, String value2) {
            addCriterion("kkhjDb not between", value1, value2, "kkhjdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbIsNull() {
            addCriterion("sfgzDb is null");
            return (Criteria) this;
        }

        public Criteria andSfgzdbIsNotNull() {
            addCriterion("sfgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andSfgzdbEqualTo(String value) {
            addCriterion("sfgzDb =", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbNotEqualTo(String value) {
            addCriterion("sfgzDb <>", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbGreaterThan(String value) {
            addCriterion("sfgzDb >", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("sfgzDb >=", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbLessThan(String value) {
            addCriterion("sfgzDb <", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbLessThanOrEqualTo(String value) {
            addCriterion("sfgzDb <=", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbLike(String value) {
            addCriterion("sfgzDb like", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbNotLike(String value) {
            addCriterion("sfgzDb not like", value, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbIn(List<String> values) {
            addCriterion("sfgzDb in", values, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbNotIn(List<String> values) {
            addCriterion("sfgzDb not in", values, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbBetween(String value1, String value2) {
            addCriterion("sfgzDb between", value1, value2, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSfgzdbNotBetween(String value1, String value2) {
            addCriterion("sfgzDb not between", value1, value2, "sfgzdb");
            return (Criteria) this;
        }

        public Criteria andSjcqIsNull() {
            addCriterion("sjcq is null");
            return (Criteria) this;
        }

        public Criteria andSjcqIsNotNull() {
            addCriterion("sjcq is not null");
            return (Criteria) this;
        }

        public Criteria andSjcqEqualTo(Long value) {
            addCriterion("sjcq =", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqNotEqualTo(Long value) {
            addCriterion("sjcq <>", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqGreaterThan(Long value) {
            addCriterion("sjcq >", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqGreaterThanOrEqualTo(Long value) {
            addCriterion("sjcq >=", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqLessThan(Long value) {
            addCriterion("sjcq <", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqLessThanOrEqualTo(Long value) {
            addCriterion("sjcq <=", value, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqIn(List<Long> values) {
            addCriterion("sjcq in", values, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqNotIn(List<Long> values) {
            addCriterion("sjcq not in", values, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqBetween(Long value1, Long value2) {
            addCriterion("sjcq between", value1, value2, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjcqNotBetween(Long value1, Long value2) {
            addCriterion("sjcq not between", value1, value2, "sjcq");
            return (Criteria) this;
        }

        public Criteria andSjtsIsNull() {
            addCriterion("sjts is null");
            return (Criteria) this;
        }

        public Criteria andSjtsIsNotNull() {
            addCriterion("sjts is not null");
            return (Criteria) this;
        }

        public Criteria andSjtsEqualTo(Long value) {
            addCriterion("sjts =", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotEqualTo(Long value) {
            addCriterion("sjts <>", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsGreaterThan(Long value) {
            addCriterion("sjts >", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsGreaterThanOrEqualTo(Long value) {
            addCriterion("sjts >=", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsLessThan(Long value) {
            addCriterion("sjts <", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsLessThanOrEqualTo(Long value) {
            addCriterion("sjts <=", value, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsIn(List<Long> values) {
            addCriterion("sjts in", values, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotIn(List<Long> values) {
            addCriterion("sjts not in", values, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsBetween(Long value1, Long value2) {
            addCriterion("sjts between", value1, value2, "sjts");
            return (Criteria) this;
        }

        public Criteria andSjtsNotBetween(Long value1, Long value2) {
            addCriterion("sjts not between", value1, value2, "sjts");
            return (Criteria) this;
        }

        public Criteria andBjtsIsNull() {
            addCriterion("bjts is null");
            return (Criteria) this;
        }

        public Criteria andBjtsIsNotNull() {
            addCriterion("bjts is not null");
            return (Criteria) this;
        }

        public Criteria andBjtsEqualTo(Long value) {
            addCriterion("bjts =", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotEqualTo(Long value) {
            addCriterion("bjts <>", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsGreaterThan(Long value) {
            addCriterion("bjts >", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsGreaterThanOrEqualTo(Long value) {
            addCriterion("bjts >=", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsLessThan(Long value) {
            addCriterion("bjts <", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsLessThanOrEqualTo(Long value) {
            addCriterion("bjts <=", value, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsIn(List<Long> values) {
            addCriterion("bjts in", values, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotIn(List<Long> values) {
            addCriterion("bjts not in", values, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsBetween(Long value1, Long value2) {
            addCriterion("bjts between", value1, value2, "bjts");
            return (Criteria) this;
        }

        public Criteria andBjtsNotBetween(Long value1, Long value2) {
            addCriterion("bjts not between", value1, value2, "bjts");
            return (Criteria) this;
        }

        public Criteria andCbtsIsNull() {
            addCriterion("cbts is null");
            return (Criteria) this;
        }

        public Criteria andCbtsIsNotNull() {
            addCriterion("cbts is not null");
            return (Criteria) this;
        }

        public Criteria andCbtsEqualTo(Long value) {
            addCriterion("cbts =", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotEqualTo(Long value) {
            addCriterion("cbts <>", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsGreaterThan(Long value) {
            addCriterion("cbts >", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsGreaterThanOrEqualTo(Long value) {
            addCriterion("cbts >=", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsLessThan(Long value) {
            addCriterion("cbts <", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsLessThanOrEqualTo(Long value) {
            addCriterion("cbts <=", value, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsIn(List<Long> values) {
            addCriterion("cbts in", values, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotIn(List<Long> values) {
            addCriterion("cbts not in", values, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsBetween(Long value1, Long value2) {
            addCriterion("cbts between", value1, value2, "cbts");
            return (Criteria) this;
        }

        public Criteria andCbtsNotBetween(Long value1, Long value2) {
            addCriterion("cbts not between", value1, value2, "cbts");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNull() {
            addCriterion("mailAddr is null");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNotNull() {
            addCriterion("mailAddr is not null");
            return (Criteria) this;
        }

        public Criteria andMailaddrEqualTo(String value) {
            addCriterion("mailAddr =", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotEqualTo(String value) {
            addCriterion("mailAddr <>", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThan(String value) {
            addCriterion("mailAddr >", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThanOrEqualTo(String value) {
            addCriterion("mailAddr >=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThan(String value) {
            addCriterion("mailAddr <", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThanOrEqualTo(String value) {
            addCriterion("mailAddr <=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLike(String value) {
            addCriterion("mailAddr like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotLike(String value) {
            addCriterion("mailAddr not like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrIn(List<String> values) {
            addCriterion("mailAddr in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotIn(List<String> values) {
            addCriterion("mailAddr not in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrBetween(String value1, String value2) {
            addCriterion("mailAddr between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotBetween(String value1, String value2) {
            addCriterion("mailAddr not between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andSmsactiIsNull() {
            addCriterion("smsActi is null");
            return (Criteria) this;
        }

        public Criteria andSmsactiIsNotNull() {
            addCriterion("smsActi is not null");
            return (Criteria) this;
        }

        public Criteria andSmsactiEqualTo(String value) {
            addCriterion("smsActi =", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiNotEqualTo(String value) {
            addCriterion("smsActi <>", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiGreaterThan(String value) {
            addCriterion("smsActi >", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiGreaterThanOrEqualTo(String value) {
            addCriterion("smsActi >=", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiLessThan(String value) {
            addCriterion("smsActi <", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiLessThanOrEqualTo(String value) {
            addCriterion("smsActi <=", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiLike(String value) {
            addCriterion("smsActi like", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiNotLike(String value) {
            addCriterion("smsActi not like", value, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiIn(List<String> values) {
            addCriterion("smsActi in", values, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiNotIn(List<String> values) {
            addCriterion("smsActi not in", values, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiBetween(String value1, String value2) {
            addCriterion("smsActi between", value1, value2, "smsacti");
            return (Criteria) this;
        }

        public Criteria andSmsactiNotBetween(String value1, String value2) {
            addCriterion("smsActi not between", value1, value2, "smsacti");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCqgzdbIsNull() {
            addCriterion("cqgzDb is null");
            return (Criteria) this;
        }

        public Criteria andCqgzdbIsNotNull() {
            addCriterion("cqgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andCqgzdbEqualTo(String value) {
            addCriterion("cqgzDb =", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbNotEqualTo(String value) {
            addCriterion("cqgzDb <>", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbGreaterThan(String value) {
            addCriterion("cqgzDb >", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("cqgzDb >=", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbLessThan(String value) {
            addCriterion("cqgzDb <", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbLessThanOrEqualTo(String value) {
            addCriterion("cqgzDb <=", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbLike(String value) {
            addCriterion("cqgzDb like", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbNotLike(String value) {
            addCriterion("cqgzDb not like", value, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbIn(List<String> values) {
            addCriterion("cqgzDb in", values, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbNotIn(List<String> values) {
            addCriterion("cqgzDb not in", values, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbBetween(String value1, String value2) {
            addCriterion("cqgzDb between", value1, value2, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andCqgzdbNotBetween(String value1, String value2) {
            addCriterion("cqgzDb not between", value1, value2, "cqgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbIsNull() {
            addCriterion("gwgzDb is null");
            return (Criteria) this;
        }

        public Criteria andGwgzdbIsNotNull() {
            addCriterion("gwgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andGwgzdbEqualTo(String value) {
            addCriterion("gwgzDb =", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbNotEqualTo(String value) {
            addCriterion("gwgzDb <>", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbGreaterThan(String value) {
            addCriterion("gwgzDb >", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("gwgzDb >=", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbLessThan(String value) {
            addCriterion("gwgzDb <", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbLessThanOrEqualTo(String value) {
            addCriterion("gwgzDb <=", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbLike(String value) {
            addCriterion("gwgzDb like", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbNotLike(String value) {
            addCriterion("gwgzDb not like", value, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbIn(List<String> values) {
            addCriterion("gwgzDb in", values, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbNotIn(List<String> values) {
            addCriterion("gwgzDb not in", values, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbBetween(String value1, String value2) {
            addCriterion("gwgzDb between", value1, value2, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andGwgzdbNotBetween(String value1, String value2) {
            addCriterion("gwgzDb not between", value1, value2, "gwgzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbIsNull() {
            addCriterion("jngzDb is null");
            return (Criteria) this;
        }

        public Criteria andJngzdbIsNotNull() {
            addCriterion("jngzDb is not null");
            return (Criteria) this;
        }

        public Criteria andJngzdbEqualTo(String value) {
            addCriterion("jngzDb =", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbNotEqualTo(String value) {
            addCriterion("jngzDb <>", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbGreaterThan(String value) {
            addCriterion("jngzDb >", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbGreaterThanOrEqualTo(String value) {
            addCriterion("jngzDb >=", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbLessThan(String value) {
            addCriterion("jngzDb <", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbLessThanOrEqualTo(String value) {
            addCriterion("jngzDb <=", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbLike(String value) {
            addCriterion("jngzDb like", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbNotLike(String value) {
            addCriterion("jngzDb not like", value, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbIn(List<String> values) {
            addCriterion("jngzDb in", values, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbNotIn(List<String> values) {
            addCriterion("jngzDb not in", values, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbBetween(String value1, String value2) {
            addCriterion("jngzDb between", value1, value2, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andJngzdbNotBetween(String value1, String value2) {
            addCriterion("jngzDb not between", value1, value2, "jngzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbIsNull() {
            addCriterion("bzgsgzDb is null");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbIsNotNull() {
            addCriterion("bzgsgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbEqualTo(String value) {
            addCriterion("bzgsgzDb =", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbNotEqualTo(String value) {
            addCriterion("bzgsgzDb <>", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbGreaterThan(String value) {
            addCriterion("bzgsgzDb >", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("bzgsgzDb >=", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbLessThan(String value) {
            addCriterion("bzgsgzDb <", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbLessThanOrEqualTo(String value) {
            addCriterion("bzgsgzDb <=", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbLike(String value) {
            addCriterion("bzgsgzDb like", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbNotLike(String value) {
            addCriterion("bzgsgzDb not like", value, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbIn(List<String> values) {
            addCriterion("bzgsgzDb in", values, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbNotIn(List<String> values) {
            addCriterion("bzgsgzDb not in", values, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbBetween(String value1, String value2) {
            addCriterion("bzgsgzDb between", value1, value2, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andBzgsgzdbNotBetween(String value1, String value2) {
            addCriterion("bzgsgzDb not between", value1, value2, "bzgsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbIsNull() {
            addCriterion("cegsgzDb is null");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbIsNotNull() {
            addCriterion("cegsgzDb is not null");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbEqualTo(String value) {
            addCriterion("cegsgzDb =", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbNotEqualTo(String value) {
            addCriterion("cegsgzDb <>", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbGreaterThan(String value) {
            addCriterion("cegsgzDb >", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbGreaterThanOrEqualTo(String value) {
            addCriterion("cegsgzDb >=", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbLessThan(String value) {
            addCriterion("cegsgzDb <", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbLessThanOrEqualTo(String value) {
            addCriterion("cegsgzDb <=", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbLike(String value) {
            addCriterion("cegsgzDb like", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbNotLike(String value) {
            addCriterion("cegsgzDb not like", value, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbIn(List<String> values) {
            addCriterion("cegsgzDb in", values, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbNotIn(List<String> values) {
            addCriterion("cegsgzDb not in", values, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbBetween(String value1, String value2) {
            addCriterion("cegsgzDb between", value1, value2, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andCegsgzdbNotBetween(String value1, String value2) {
            addCriterion("cegsgzDb not between", value1, value2, "cegsgzdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbIsNull() {
            addCriterion("jbgsbtDb is null");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbIsNotNull() {
            addCriterion("jbgsbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbEqualTo(String value) {
            addCriterion("jbgsbtDb =", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbNotEqualTo(String value) {
            addCriterion("jbgsbtDb <>", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbGreaterThan(String value) {
            addCriterion("jbgsbtDb >", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("jbgsbtDb >=", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbLessThan(String value) {
            addCriterion("jbgsbtDb <", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbLessThanOrEqualTo(String value) {
            addCriterion("jbgsbtDb <=", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbLike(String value) {
            addCriterion("jbgsbtDb like", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbNotLike(String value) {
            addCriterion("jbgsbtDb not like", value, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbIn(List<String> values) {
            addCriterion("jbgsbtDb in", values, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbNotIn(List<String> values) {
            addCriterion("jbgsbtDb not in", values, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbBetween(String value1, String value2) {
            addCriterion("jbgsbtDb between", value1, value2, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andJbgsbtdbNotBetween(String value1, String value2) {
            addCriterion("jbgsbtDb not between", value1, value2, "jbgsbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbIsNull() {
            addCriterion("gaowbtDb is null");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbIsNotNull() {
            addCriterion("gaowbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbEqualTo(String value) {
            addCriterion("gaowbtDb =", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbNotEqualTo(String value) {
            addCriterion("gaowbtDb <>", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbGreaterThan(String value) {
            addCriterion("gaowbtDb >", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("gaowbtDb >=", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbLessThan(String value) {
            addCriterion("gaowbtDb <", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbLessThanOrEqualTo(String value) {
            addCriterion("gaowbtDb <=", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbLike(String value) {
            addCriterion("gaowbtDb like", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbNotLike(String value) {
            addCriterion("gaowbtDb not like", value, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbIn(List<String> values) {
            addCriterion("gaowbtDb in", values, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbNotIn(List<String> values) {
            addCriterion("gaowbtDb not in", values, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbBetween(String value1, String value2) {
            addCriterion("gaowbtDb between", value1, value2, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andGaowbtdbNotBetween(String value1, String value2) {
            addCriterion("gaowbtDb not between", value1, value2, "gaowbtdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbIsNull() {
            addCriterion("bkshbxDb is null");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbIsNotNull() {
            addCriterion("bkshbxDb is not null");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbEqualTo(String value) {
            addCriterion("bkshbxDb =", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbNotEqualTo(String value) {
            addCriterion("bkshbxDb <>", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbGreaterThan(String value) {
            addCriterion("bkshbxDb >", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbGreaterThanOrEqualTo(String value) {
            addCriterion("bkshbxDb >=", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbLessThan(String value) {
            addCriterion("bkshbxDb <", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbLessThanOrEqualTo(String value) {
            addCriterion("bkshbxDb <=", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbLike(String value) {
            addCriterion("bkshbxDb like", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbNotLike(String value) {
            addCriterion("bkshbxDb not like", value, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbIn(List<String> values) {
            addCriterion("bkshbxDb in", values, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbNotIn(List<String> values) {
            addCriterion("bkshbxDb not in", values, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbBetween(String value1, String value2) {
            addCriterion("bkshbxDb between", value1, value2, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkshbxdbNotBetween(String value1, String value2) {
            addCriterion("bkshbxDb not between", value1, value2, "bkshbxdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbIsNull() {
            addCriterion("bkgjjDb is null");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbIsNotNull() {
            addCriterion("bkgjjDb is not null");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbEqualTo(String value) {
            addCriterion("bkgjjDb =", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbNotEqualTo(String value) {
            addCriterion("bkgjjDb <>", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbGreaterThan(String value) {
            addCriterion("bkgjjDb >", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbGreaterThanOrEqualTo(String value) {
            addCriterion("bkgjjDb >=", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbLessThan(String value) {
            addCriterion("bkgjjDb <", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbLessThanOrEqualTo(String value) {
            addCriterion("bkgjjDb <=", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbLike(String value) {
            addCriterion("bkgjjDb like", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbNotLike(String value) {
            addCriterion("bkgjjDb not like", value, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbIn(List<String> values) {
            addCriterion("bkgjjDb in", values, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbNotIn(List<String> values) {
            addCriterion("bkgjjDb not in", values, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbBetween(String value1, String value2) {
            addCriterion("bkgjjDb between", value1, value2, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andBkgjjdbNotBetween(String value1, String value2) {
            addCriterion("bkgjjDb not between", value1, value2, "bkgjjdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbIsNull() {
            addCriterion("klwsDb is null");
            return (Criteria) this;
        }

        public Criteria andKlwsdbIsNotNull() {
            addCriterion("klwsDb is not null");
            return (Criteria) this;
        }

        public Criteria andKlwsdbEqualTo(String value) {
            addCriterion("klwsDb =", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbNotEqualTo(String value) {
            addCriterion("klwsDb <>", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbGreaterThan(String value) {
            addCriterion("klwsDb >", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbGreaterThanOrEqualTo(String value) {
            addCriterion("klwsDb >=", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbLessThan(String value) {
            addCriterion("klwsDb <", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbLessThanOrEqualTo(String value) {
            addCriterion("klwsDb <=", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbLike(String value) {
            addCriterion("klwsDb like", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbNotLike(String value) {
            addCriterion("klwsDb not like", value, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbIn(List<String> values) {
            addCriterion("klwsDb in", values, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbNotIn(List<String> values) {
            addCriterion("klwsDb not in", values, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbBetween(String value1, String value2) {
            addCriterion("klwsDb between", value1, value2, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKlwsdbNotBetween(String value1, String value2) {
            addCriterion("klwsDb not between", value1, value2, "klwsdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbIsNull() {
            addCriterion("kgrjkDb is null");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbIsNotNull() {
            addCriterion("kgrjkDb is not null");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbEqualTo(String value) {
            addCriterion("kgrjkDb =", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbNotEqualTo(String value) {
            addCriterion("kgrjkDb <>", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbGreaterThan(String value) {
            addCriterion("kgrjkDb >", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbGreaterThanOrEqualTo(String value) {
            addCriterion("kgrjkDb >=", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbLessThan(String value) {
            addCriterion("kgrjkDb <", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbLessThanOrEqualTo(String value) {
            addCriterion("kgrjkDb <=", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbLike(String value) {
            addCriterion("kgrjkDb like", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbNotLike(String value) {
            addCriterion("kgrjkDb not like", value, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbIn(List<String> values) {
            addCriterion("kgrjkDb in", values, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbNotIn(List<String> values) {
            addCriterion("kgrjkDb not in", values, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbBetween(String value1, String value2) {
            addCriterion("kgrjkDb between", value1, value2, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKgrjkdbNotBetween(String value1, String value2) {
            addCriterion("kgrjkDb not between", value1, value2, "kgrjkdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbIsNull() {
            addCriterion("klxDb is null");
            return (Criteria) this;
        }

        public Criteria andKlxdbIsNotNull() {
            addCriterion("klxDb is not null");
            return (Criteria) this;
        }

        public Criteria andKlxdbEqualTo(String value) {
            addCriterion("klxDb =", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbNotEqualTo(String value) {
            addCriterion("klxDb <>", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbGreaterThan(String value) {
            addCriterion("klxDb >", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbGreaterThanOrEqualTo(String value) {
            addCriterion("klxDb >=", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbLessThan(String value) {
            addCriterion("klxDb <", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbLessThanOrEqualTo(String value) {
            addCriterion("klxDb <=", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbLike(String value) {
            addCriterion("klxDb like", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbNotLike(String value) {
            addCriterion("klxDb not like", value, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbIn(List<String> values) {
            addCriterion("klxDb in", values, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbNotIn(List<String> values) {
            addCriterion("klxDb not in", values, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbBetween(String value1, String value2) {
            addCriterion("klxDb between", value1, value2, "klxdb");
            return (Criteria) this;
        }

        public Criteria andKlxdbNotBetween(String value1, String value2) {
            addCriterion("klxDb not between", value1, value2, "klxdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbIsNull() {
            addCriterion("dkyfbxfDb is null");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbIsNotNull() {
            addCriterion("dkyfbxfDb is not null");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbEqualTo(String value) {
            addCriterion("dkyfbxfDb =", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbNotEqualTo(String value) {
            addCriterion("dkyfbxfDb <>", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbGreaterThan(String value) {
            addCriterion("dkyfbxfDb >", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbGreaterThanOrEqualTo(String value) {
            addCriterion("dkyfbxfDb >=", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbLessThan(String value) {
            addCriterion("dkyfbxfDb <", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbLessThanOrEqualTo(String value) {
            addCriterion("dkyfbxfDb <=", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbLike(String value) {
            addCriterion("dkyfbxfDb like", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbNotLike(String value) {
            addCriterion("dkyfbxfDb not like", value, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbIn(List<String> values) {
            addCriterion("dkyfbxfDb in", values, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbNotIn(List<String> values) {
            addCriterion("dkyfbxfDb not in", values, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbBetween(String value1, String value2) {
            addCriterion("dkyfbxfDb between", value1, value2, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andDkyfbxfdbNotBetween(String value1, String value2) {
            addCriterion("dkyfbxfDb not between", value1, value2, "dkyfbxfdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbIsNull() {
            addCriterion("zsbtDb is null");
            return (Criteria) this;
        }

        public Criteria andZsbtdbIsNotNull() {
            addCriterion("zsbtDb is not null");
            return (Criteria) this;
        }

        public Criteria andZsbtdbEqualTo(String value) {
            addCriterion("zsbtDb =", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbNotEqualTo(String value) {
            addCriterion("zsbtDb <>", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbGreaterThan(String value) {
            addCriterion("zsbtDb >", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbGreaterThanOrEqualTo(String value) {
            addCriterion("zsbtDb >=", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbLessThan(String value) {
            addCriterion("zsbtDb <", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbLessThanOrEqualTo(String value) {
            addCriterion("zsbtDb <=", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbLike(String value) {
            addCriterion("zsbtDb like", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbNotLike(String value) {
            addCriterion("zsbtDb not like", value, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbIn(List<String> values) {
            addCriterion("zsbtDb in", values, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbNotIn(List<String> values) {
            addCriterion("zsbtDb not in", values, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbBetween(String value1, String value2) {
            addCriterion("zsbtDb between", value1, value2, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZsbtdbNotBetween(String value1, String value2) {
            addCriterion("zsbtDb not between", value1, value2, "zsbtdb");
            return (Criteria) this;
        }

        public Criteria andZwbttsIsNull() {
            addCriterion("zwbtts is null");
            return (Criteria) this;
        }

        public Criteria andZwbttsIsNotNull() {
            addCriterion("zwbtts is not null");
            return (Criteria) this;
        }

        public Criteria andZwbttsEqualTo(Long value) {
            addCriterion("zwbtts =", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsNotEqualTo(Long value) {
            addCriterion("zwbtts <>", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsGreaterThan(Long value) {
            addCriterion("zwbtts >", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsGreaterThanOrEqualTo(Long value) {
            addCriterion("zwbtts >=", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsLessThan(Long value) {
            addCriterion("zwbtts <", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsLessThanOrEqualTo(Long value) {
            addCriterion("zwbtts <=", value, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsIn(List<Long> values) {
            addCriterion("zwbtts in", values, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsNotIn(List<Long> values) {
            addCriterion("zwbtts not in", values, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsBetween(Long value1, Long value2) {
            addCriterion("zwbtts between", value1, value2, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andZwbttsNotBetween(Long value1, Long value2) {
            addCriterion("zwbtts not between", value1, value2, "zwbtts");
            return (Criteria) this;
        }

        public Criteria andJbjstsIsNull() {
            addCriterion("jbjsts is null");
            return (Criteria) this;
        }

        public Criteria andJbjstsIsNotNull() {
            addCriterion("jbjsts is not null");
            return (Criteria) this;
        }

        public Criteria andJbjstsEqualTo(Long value) {
            addCriterion("jbjsts =", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsNotEqualTo(Long value) {
            addCriterion("jbjsts <>", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsGreaterThan(Long value) {
            addCriterion("jbjsts >", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsGreaterThanOrEqualTo(Long value) {
            addCriterion("jbjsts >=", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsLessThan(Long value) {
            addCriterion("jbjsts <", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsLessThanOrEqualTo(Long value) {
            addCriterion("jbjsts <=", value, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsIn(List<Long> values) {
            addCriterion("jbjsts in", values, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsNotIn(List<Long> values) {
            addCriterion("jbjsts not in", values, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsBetween(Long value1, Long value2) {
            addCriterion("jbjsts between", value1, value2, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbjstsNotBetween(Long value1, Long value2) {
            addCriterion("jbjsts not between", value1, value2, "jbjsts");
            return (Criteria) this;
        }

        public Criteria andJbyltsIsNull() {
            addCriterion("jbylts is null");
            return (Criteria) this;
        }

        public Criteria andJbyltsIsNotNull() {
            addCriterion("jbylts is not null");
            return (Criteria) this;
        }

        public Criteria andJbyltsEqualTo(Long value) {
            addCriterion("jbylts =", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsNotEqualTo(Long value) {
            addCriterion("jbylts <>", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsGreaterThan(Long value) {
            addCriterion("jbylts >", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsGreaterThanOrEqualTo(Long value) {
            addCriterion("jbylts >=", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsLessThan(Long value) {
            addCriterion("jbylts <", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsLessThanOrEqualTo(Long value) {
            addCriterion("jbylts <=", value, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsIn(List<Long> values) {
            addCriterion("jbylts in", values, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsNotIn(List<Long> values) {
            addCriterion("jbylts not in", values, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsBetween(Long value1, Long value2) {
            addCriterion("jbylts between", value1, value2, "jbylts");
            return (Criteria) this;
        }

        public Criteria andJbyltsNotBetween(Long value1, Long value2) {
            addCriterion("jbylts not between", value1, value2, "jbylts");
            return (Criteria) this;
        }

        public Criteria andYsjbxssIsNull() {
            addCriterion("ysjbxss is null");
            return (Criteria) this;
        }

        public Criteria andYsjbxssIsNotNull() {
            addCriterion("ysjbxss is not null");
            return (Criteria) this;
        }

        public Criteria andYsjbxssEqualTo(Long value) {
            addCriterion("ysjbxss =", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssNotEqualTo(Long value) {
            addCriterion("ysjbxss <>", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssGreaterThan(Long value) {
            addCriterion("ysjbxss >", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssGreaterThanOrEqualTo(Long value) {
            addCriterion("ysjbxss >=", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssLessThan(Long value) {
            addCriterion("ysjbxss <", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssLessThanOrEqualTo(Long value) {
            addCriterion("ysjbxss <=", value, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssIn(List<Long> values) {
            addCriterion("ysjbxss in", values, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssNotIn(List<Long> values) {
            addCriterion("ysjbxss not in", values, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssBetween(Long value1, Long value2) {
            addCriterion("ysjbxss between", value1, value2, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYsjbxssNotBetween(Long value1, Long value2) {
            addCriterion("ysjbxss not between", value1, value2, "ysjbxss");
            return (Criteria) this;
        }

        public Criteria andYrIsNull() {
            addCriterion("yr is null");
            return (Criteria) this;
        }

        public Criteria andYrIsNotNull() {
            addCriterion("yr is not null");
            return (Criteria) this;
        }

        public Criteria andYrEqualTo(String value) {
            addCriterion("yr =", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrNotEqualTo(String value) {
            addCriterion("yr <>", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrGreaterThan(String value) {
            addCriterion("yr >", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrGreaterThanOrEqualTo(String value) {
            addCriterion("yr >=", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrLessThan(String value) {
            addCriterion("yr <", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrLessThanOrEqualTo(String value) {
            addCriterion("yr <=", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrLike(String value) {
            addCriterion("yr like", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrNotLike(String value) {
            addCriterion("yr not like", value, "yr");
            return (Criteria) this;
        }

        public Criteria andYrIn(List<String> values) {
            addCriterion("yr in", values, "yr");
            return (Criteria) this;
        }

        public Criteria andYrNotIn(List<String> values) {
            addCriterion("yr not in", values, "yr");
            return (Criteria) this;
        }

        public Criteria andYrBetween(String value1, String value2) {
            addCriterion("yr between", value1, value2, "yr");
            return (Criteria) this;
        }

        public Criteria andYrNotBetween(String value1, String value2) {
            addCriterion("yr not between", value1, value2, "yr");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("departName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("departName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("departName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("departName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("departName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("departName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("departName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("departName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("departName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("departName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("departName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("departName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("departName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("departName not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("phoneNo is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("phoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("phoneNo =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("phoneNo <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("phoneNo >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNo >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("phoneNo <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("phoneNo <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("phoneNo like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("phoneNo not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("phoneNo in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("phoneNo not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("phoneNo between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("phoneNo not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
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