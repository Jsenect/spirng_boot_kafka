package com.lzz.spirngboot_kafka_demo.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatisticsDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticsDataExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRadarIdIsNull() {
            addCriterion("radar_id is null");
            return (Criteria) this;
        }

        public Criteria andRadarIdIsNotNull() {
            addCriterion("radar_id is not null");
            return (Criteria) this;
        }

        public Criteria andRadarIdEqualTo(String value) {
            addCriterion("radar_id =", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdNotEqualTo(String value) {
            addCriterion("radar_id <>", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdGreaterThan(String value) {
            addCriterion("radar_id >", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdGreaterThanOrEqualTo(String value) {
            addCriterion("radar_id >=", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdLessThan(String value) {
            addCriterion("radar_id <", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdLessThanOrEqualTo(String value) {
            addCriterion("radar_id <=", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdLike(String value) {
            addCriterion("radar_id like", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdNotLike(String value) {
            addCriterion("radar_id not like", value, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdIn(List<String> values) {
            addCriterion("radar_id in", values, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdNotIn(List<String> values) {
            addCriterion("radar_id not in", values, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdBetween(String value1, String value2) {
            addCriterion("radar_id between", value1, value2, "radarId");
            return (Criteria) this;
        }

        public Criteria andRadarIdNotBetween(String value1, String value2) {
            addCriterion("radar_id not between", value1, value2, "radarId");
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

        public Criteria andPositionEqualTo(Double value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Double value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Double value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Double value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Double value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Double value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Double> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Double> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Double value1, Double value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Double value1, Double value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andLaneNumIsNull() {
            addCriterion("lane_num is null");
            return (Criteria) this;
        }

        public Criteria andLaneNumIsNotNull() {
            addCriterion("lane_num is not null");
            return (Criteria) this;
        }

        public Criteria andLaneNumEqualTo(Integer value) {
            addCriterion("lane_num =", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumNotEqualTo(Integer value) {
            addCriterion("lane_num <>", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumGreaterThan(Integer value) {
            addCriterion("lane_num >", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lane_num >=", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumLessThan(Integer value) {
            addCriterion("lane_num <", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumLessThanOrEqualTo(Integer value) {
            addCriterion("lane_num <=", value, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumIn(List<Integer> values) {
            addCriterion("lane_num in", values, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumNotIn(List<Integer> values) {
            addCriterion("lane_num not in", values, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumBetween(Integer value1, Integer value2) {
            addCriterion("lane_num between", value1, value2, "laneNum");
            return (Criteria) this;
        }

        public Criteria andLaneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("lane_num not between", value1, value2, "laneNum");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(Long value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(Long value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(Long value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(Long value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(Long value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(Long value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<Long> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<Long> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(Long value1, Long value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(Long value1, Long value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andSumCarIsNull() {
            addCriterion("sum_car is null");
            return (Criteria) this;
        }

        public Criteria andSumCarIsNotNull() {
            addCriterion("sum_car is not null");
            return (Criteria) this;
        }

        public Criteria andSumCarEqualTo(Integer value) {
            addCriterion("sum_car =", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarNotEqualTo(Integer value) {
            addCriterion("sum_car <>", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarGreaterThan(Integer value) {
            addCriterion("sum_car >", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_car >=", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarLessThan(Integer value) {
            addCriterion("sum_car <", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarLessThanOrEqualTo(Integer value) {
            addCriterion("sum_car <=", value, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarIn(List<Integer> values) {
            addCriterion("sum_car in", values, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarNotIn(List<Integer> values) {
            addCriterion("sum_car not in", values, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarBetween(Integer value1, Integer value2) {
            addCriterion("sum_car between", value1, value2, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumCarNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_car not between", value1, value2, "sumCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarIsNull() {
            addCriterion("sum_small_car is null");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarIsNotNull() {
            addCriterion("sum_small_car is not null");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarEqualTo(Integer value) {
            addCriterion("sum_small_car =", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarNotEqualTo(Integer value) {
            addCriterion("sum_small_car <>", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarGreaterThan(Integer value) {
            addCriterion("sum_small_car >", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_small_car >=", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarLessThan(Integer value) {
            addCriterion("sum_small_car <", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarLessThanOrEqualTo(Integer value) {
            addCriterion("sum_small_car <=", value, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarIn(List<Integer> values) {
            addCriterion("sum_small_car in", values, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarNotIn(List<Integer> values) {
            addCriterion("sum_small_car not in", values, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarBetween(Integer value1, Integer value2) {
            addCriterion("sum_small_car between", value1, value2, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumSmallCarNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_small_car not between", value1, value2, "sumSmallCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarIsNull() {
            addCriterion("sum_mid_car is null");
            return (Criteria) this;
        }

        public Criteria andSumMidCarIsNotNull() {
            addCriterion("sum_mid_car is not null");
            return (Criteria) this;
        }

        public Criteria andSumMidCarEqualTo(Integer value) {
            addCriterion("sum_mid_car =", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarNotEqualTo(Integer value) {
            addCriterion("sum_mid_car <>", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarGreaterThan(Integer value) {
            addCriterion("sum_mid_car >", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_mid_car >=", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarLessThan(Integer value) {
            addCriterion("sum_mid_car <", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarLessThanOrEqualTo(Integer value) {
            addCriterion("sum_mid_car <=", value, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarIn(List<Integer> values) {
            addCriterion("sum_mid_car in", values, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarNotIn(List<Integer> values) {
            addCriterion("sum_mid_car not in", values, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarBetween(Integer value1, Integer value2) {
            addCriterion("sum_mid_car between", value1, value2, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumMidCarNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_mid_car not between", value1, value2, "sumMidCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarIsNull() {
            addCriterion("sum_big_car is null");
            return (Criteria) this;
        }

        public Criteria andSumBigCarIsNotNull() {
            addCriterion("sum_big_car is not null");
            return (Criteria) this;
        }

        public Criteria andSumBigCarEqualTo(Integer value) {
            addCriterion("sum_big_car =", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarNotEqualTo(Integer value) {
            addCriterion("sum_big_car <>", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarGreaterThan(Integer value) {
            addCriterion("sum_big_car >", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_big_car >=", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarLessThan(Integer value) {
            addCriterion("sum_big_car <", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarLessThanOrEqualTo(Integer value) {
            addCriterion("sum_big_car <=", value, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarIn(List<Integer> values) {
            addCriterion("sum_big_car in", values, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarNotIn(List<Integer> values) {
            addCriterion("sum_big_car not in", values, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarBetween(Integer value1, Integer value2) {
            addCriterion("sum_big_car between", value1, value2, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andSumBigCarNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_big_car not between", value1, value2, "sumBigCar");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIsNull() {
            addCriterion("avg_speed is null");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIsNotNull() {
            addCriterion("avg_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedEqualTo(Double value) {
            addCriterion("avg_speed =", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotEqualTo(Double value) {
            addCriterion("avg_speed <>", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedGreaterThan(Double value) {
            addCriterion("avg_speed >", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_speed >=", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedLessThan(Double value) {
            addCriterion("avg_speed <", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedLessThanOrEqualTo(Double value) {
            addCriterion("avg_speed <=", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIn(List<Double> values) {
            addCriterion("avg_speed in", values, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotIn(List<Double> values) {
            addCriterion("avg_speed not in", values, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedBetween(Double value1, Double value2) {
            addCriterion("avg_speed between", value1, value2, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotBetween(Double value1, Double value2) {
            addCriterion("avg_speed not between", value1, value2, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andSumTargetIsNull() {
            addCriterion("sum_target is null");
            return (Criteria) this;
        }

        public Criteria andSumTargetIsNotNull() {
            addCriterion("sum_target is not null");
            return (Criteria) this;
        }

        public Criteria andSumTargetEqualTo(Integer value) {
            addCriterion("sum_target =", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetNotEqualTo(Integer value) {
            addCriterion("sum_target <>", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetGreaterThan(Integer value) {
            addCriterion("sum_target >", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_target >=", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetLessThan(Integer value) {
            addCriterion("sum_target <", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetLessThanOrEqualTo(Integer value) {
            addCriterion("sum_target <=", value, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetIn(List<Integer> values) {
            addCriterion("sum_target in", values, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetNotIn(List<Integer> values) {
            addCriterion("sum_target not in", values, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetBetween(Integer value1, Integer value2) {
            addCriterion("sum_target between", value1, value2, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_target not between", value1, value2, "sumTarget");
            return (Criteria) this;
        }

        public Criteria andSumSpeedIsNull() {
            addCriterion("sum_speed is null");
            return (Criteria) this;
        }

        public Criteria andSumSpeedIsNotNull() {
            addCriterion("sum_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSumSpeedEqualTo(Double value) {
            addCriterion("sum_speed =", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedNotEqualTo(Double value) {
            addCriterion("sum_speed <>", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedGreaterThan(Double value) {
            addCriterion("sum_speed >", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_speed >=", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedLessThan(Double value) {
            addCriterion("sum_speed <", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sum_speed <=", value, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedIn(List<Double> values) {
            addCriterion("sum_speed in", values, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedNotIn(List<Double> values) {
            addCriterion("sum_speed not in", values, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedBetween(Double value1, Double value2) {
            addCriterion("sum_speed between", value1, value2, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sum_speed not between", value1, value2, "sumSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedIsNull() {
            addCriterion("avg_small_speed is null");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedIsNotNull() {
            addCriterion("avg_small_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedEqualTo(Double value) {
            addCriterion("avg_small_speed =", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedNotEqualTo(Double value) {
            addCriterion("avg_small_speed <>", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedGreaterThan(Double value) {
            addCriterion("avg_small_speed >", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_small_speed >=", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedLessThan(Double value) {
            addCriterion("avg_small_speed <", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedLessThanOrEqualTo(Double value) {
            addCriterion("avg_small_speed <=", value, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedIn(List<Double> values) {
            addCriterion("avg_small_speed in", values, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedNotIn(List<Double> values) {
            addCriterion("avg_small_speed not in", values, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedBetween(Double value1, Double value2) {
            addCriterion("avg_small_speed between", value1, value2, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSmallSpeedNotBetween(Double value1, Double value2) {
            addCriterion("avg_small_speed not between", value1, value2, "avgSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetIsNull() {
            addCriterion("sum_small_target is null");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetIsNotNull() {
            addCriterion("sum_small_target is not null");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetEqualTo(Integer value) {
            addCriterion("sum_small_target =", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetNotEqualTo(Integer value) {
            addCriterion("sum_small_target <>", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetGreaterThan(Integer value) {
            addCriterion("sum_small_target >", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_small_target >=", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetLessThan(Integer value) {
            addCriterion("sum_small_target <", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetLessThanOrEqualTo(Integer value) {
            addCriterion("sum_small_target <=", value, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetIn(List<Integer> values) {
            addCriterion("sum_small_target in", values, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetNotIn(List<Integer> values) {
            addCriterion("sum_small_target not in", values, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetBetween(Integer value1, Integer value2) {
            addCriterion("sum_small_target between", value1, value2, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_small_target not between", value1, value2, "sumSmallTarget");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedIsNull() {
            addCriterion("sum_small_speed is null");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedIsNotNull() {
            addCriterion("sum_small_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedEqualTo(Double value) {
            addCriterion("sum_small_speed =", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedNotEqualTo(Double value) {
            addCriterion("sum_small_speed <>", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedGreaterThan(Double value) {
            addCriterion("sum_small_speed >", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_small_speed >=", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedLessThan(Double value) {
            addCriterion("sum_small_speed <", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sum_small_speed <=", value, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedIn(List<Double> values) {
            addCriterion("sum_small_speed in", values, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedNotIn(List<Double> values) {
            addCriterion("sum_small_speed not in", values, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedBetween(Double value1, Double value2) {
            addCriterion("sum_small_speed between", value1, value2, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andSumSmallSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sum_small_speed not between", value1, value2, "sumSmallSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedIsNull() {
            addCriterion("avg_mid_speed is null");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedIsNotNull() {
            addCriterion("avg_mid_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedEqualTo(Double value) {
            addCriterion("avg_mid_speed =", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedNotEqualTo(Double value) {
            addCriterion("avg_mid_speed <>", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedGreaterThan(Double value) {
            addCriterion("avg_mid_speed >", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_mid_speed >=", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedLessThan(Double value) {
            addCriterion("avg_mid_speed <", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedLessThanOrEqualTo(Double value) {
            addCriterion("avg_mid_speed <=", value, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedIn(List<Double> values) {
            addCriterion("avg_mid_speed in", values, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedNotIn(List<Double> values) {
            addCriterion("avg_mid_speed not in", values, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedBetween(Double value1, Double value2) {
            addCriterion("avg_mid_speed between", value1, value2, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgMidSpeedNotBetween(Double value1, Double value2) {
            addCriterion("avg_mid_speed not between", value1, value2, "avgMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetIsNull() {
            addCriterion("sum_mid_target is null");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetIsNotNull() {
            addCriterion("sum_mid_target is not null");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetEqualTo(Integer value) {
            addCriterion("sum_mid_target =", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetNotEqualTo(Integer value) {
            addCriterion("sum_mid_target <>", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetGreaterThan(Integer value) {
            addCriterion("sum_mid_target >", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_mid_target >=", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetLessThan(Integer value) {
            addCriterion("sum_mid_target <", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetLessThanOrEqualTo(Integer value) {
            addCriterion("sum_mid_target <=", value, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetIn(List<Integer> values) {
            addCriterion("sum_mid_target in", values, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetNotIn(List<Integer> values) {
            addCriterion("sum_mid_target not in", values, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetBetween(Integer value1, Integer value2) {
            addCriterion("sum_mid_target between", value1, value2, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_mid_target not between", value1, value2, "sumMidTarget");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedIsNull() {
            addCriterion("sum_mid_speed is null");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedIsNotNull() {
            addCriterion("sum_mid_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedEqualTo(Double value) {
            addCriterion("sum_mid_speed =", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedNotEqualTo(Double value) {
            addCriterion("sum_mid_speed <>", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedGreaterThan(Double value) {
            addCriterion("sum_mid_speed >", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_mid_speed >=", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedLessThan(Double value) {
            addCriterion("sum_mid_speed <", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sum_mid_speed <=", value, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedIn(List<Double> values) {
            addCriterion("sum_mid_speed in", values, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedNotIn(List<Double> values) {
            addCriterion("sum_mid_speed not in", values, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedBetween(Double value1, Double value2) {
            addCriterion("sum_mid_speed between", value1, value2, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andSumMidSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sum_mid_speed not between", value1, value2, "sumMidSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedIsNull() {
            addCriterion("avg_big_speed is null");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedIsNotNull() {
            addCriterion("avg_big_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedEqualTo(Double value) {
            addCriterion("avg_big_speed =", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedNotEqualTo(Double value) {
            addCriterion("avg_big_speed <>", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedGreaterThan(Double value) {
            addCriterion("avg_big_speed >", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_big_speed >=", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedLessThan(Double value) {
            addCriterion("avg_big_speed <", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedLessThanOrEqualTo(Double value) {
            addCriterion("avg_big_speed <=", value, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedIn(List<Double> values) {
            addCriterion("avg_big_speed in", values, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedNotIn(List<Double> values) {
            addCriterion("avg_big_speed not in", values, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedBetween(Double value1, Double value2) {
            addCriterion("avg_big_speed between", value1, value2, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgBigSpeedNotBetween(Double value1, Double value2) {
            addCriterion("avg_big_speed not between", value1, value2, "avgBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetIsNull() {
            addCriterion("sum_big_target is null");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetIsNotNull() {
            addCriterion("sum_big_target is not null");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetEqualTo(Integer value) {
            addCriterion("sum_big_target =", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetNotEqualTo(Integer value) {
            addCriterion("sum_big_target <>", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetGreaterThan(Integer value) {
            addCriterion("sum_big_target >", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_big_target >=", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetLessThan(Integer value) {
            addCriterion("sum_big_target <", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetLessThanOrEqualTo(Integer value) {
            addCriterion("sum_big_target <=", value, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetIn(List<Integer> values) {
            addCriterion("sum_big_target in", values, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetNotIn(List<Integer> values) {
            addCriterion("sum_big_target not in", values, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetBetween(Integer value1, Integer value2) {
            addCriterion("sum_big_target between", value1, value2, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_big_target not between", value1, value2, "sumBigTarget");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedIsNull() {
            addCriterion("sum_big_speed is null");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedIsNotNull() {
            addCriterion("sum_big_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedEqualTo(Double value) {
            addCriterion("sum_big_speed =", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedNotEqualTo(Double value) {
            addCriterion("sum_big_speed <>", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedGreaterThan(Double value) {
            addCriterion("sum_big_speed >", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_big_speed >=", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedLessThan(Double value) {
            addCriterion("sum_big_speed <", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sum_big_speed <=", value, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedIn(List<Double> values) {
            addCriterion("sum_big_speed in", values, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedNotIn(List<Double> values) {
            addCriterion("sum_big_speed not in", values, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedBetween(Double value1, Double value2) {
            addCriterion("sum_big_speed between", value1, value2, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andSumBigSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sum_big_speed not between", value1, value2, "sumBigSpeed");
            return (Criteria) this;
        }

        public Criteria andOccupancyIsNull() {
            addCriterion("occupancy is null");
            return (Criteria) this;
        }

        public Criteria andOccupancyIsNotNull() {
            addCriterion("occupancy is not null");
            return (Criteria) this;
        }

        public Criteria andOccupancyEqualTo(Double value) {
            addCriterion("occupancy =", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyNotEqualTo(Double value) {
            addCriterion("occupancy <>", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyGreaterThan(Double value) {
            addCriterion("occupancy >", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyGreaterThanOrEqualTo(Double value) {
            addCriterion("occupancy >=", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyLessThan(Double value) {
            addCriterion("occupancy <", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyLessThanOrEqualTo(Double value) {
            addCriterion("occupancy <=", value, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyIn(List<Double> values) {
            addCriterion("occupancy in", values, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyNotIn(List<Double> values) {
            addCriterion("occupancy not in", values, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyBetween(Double value1, Double value2) {
            addCriterion("occupancy between", value1, value2, "occupancy");
            return (Criteria) this;
        }

        public Criteria andOccupancyNotBetween(Double value1, Double value2) {
            addCriterion("occupancy not between", value1, value2, "occupancy");
            return (Criteria) this;
        }

        public Criteria andHeadwayIsNull() {
            addCriterion("headway is null");
            return (Criteria) this;
        }

        public Criteria andHeadwayIsNotNull() {
            addCriterion("headway is not null");
            return (Criteria) this;
        }

        public Criteria andHeadwayEqualTo(Double value) {
            addCriterion("headway =", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayNotEqualTo(Double value) {
            addCriterion("headway <>", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayGreaterThan(Double value) {
            addCriterion("headway >", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayGreaterThanOrEqualTo(Double value) {
            addCriterion("headway >=", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayLessThan(Double value) {
            addCriterion("headway <", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayLessThanOrEqualTo(Double value) {
            addCriterion("headway <=", value, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayIn(List<Double> values) {
            addCriterion("headway in", values, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayNotIn(List<Double> values) {
            addCriterion("headway not in", values, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayBetween(Double value1, Double value2) {
            addCriterion("headway between", value1, value2, "headway");
            return (Criteria) this;
        }

        public Criteria andHeadwayNotBetween(Double value1, Double value2) {
            addCriterion("headway not between", value1, value2, "headway");
            return (Criteria) this;
        }

        public Criteria andGapIsNull() {
            addCriterion("gap is null");
            return (Criteria) this;
        }

        public Criteria andGapIsNotNull() {
            addCriterion("gap is not null");
            return (Criteria) this;
        }

        public Criteria andGapEqualTo(Double value) {
            addCriterion("gap =", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotEqualTo(Double value) {
            addCriterion("gap <>", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapGreaterThan(Double value) {
            addCriterion("gap >", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapGreaterThanOrEqualTo(Double value) {
            addCriterion("gap >=", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapLessThan(Double value) {
            addCriterion("gap <", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapLessThanOrEqualTo(Double value) {
            addCriterion("gap <=", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapIn(List<Double> values) {
            addCriterion("gap in", values, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotIn(List<Double> values) {
            addCriterion("gap not in", values, "gap");
            return (Criteria) this;
        }

        public Criteria andGapBetween(Double value1, Double value2) {
            addCriterion("gap between", value1, value2, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotBetween(Double value1, Double value2) {
            addCriterion("gap not between", value1, value2, "gap");
            return (Criteria) this;
        }

        public Criteria andSpeed85IsNull() {
            addCriterion("speed_85 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed85IsNotNull() {
            addCriterion("speed_85 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed85EqualTo(Double value) {
            addCriterion("speed_85 =", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85NotEqualTo(Double value) {
            addCriterion("speed_85 <>", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85GreaterThan(Double value) {
            addCriterion("speed_85 >", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85GreaterThanOrEqualTo(Double value) {
            addCriterion("speed_85 >=", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85LessThan(Double value) {
            addCriterion("speed_85 <", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85LessThanOrEqualTo(Double value) {
            addCriterion("speed_85 <=", value, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85In(List<Double> values) {
            addCriterion("speed_85 in", values, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85NotIn(List<Double> values) {
            addCriterion("speed_85 not in", values, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85Between(Double value1, Double value2) {
            addCriterion("speed_85 between", value1, value2, "speed85");
            return (Criteria) this;
        }

        public Criteria andSpeed85NotBetween(Double value1, Double value2) {
            addCriterion("speed_85 not between", value1, value2, "speed85");
            return (Criteria) this;
        }

        public Criteria andSumEventIsNull() {
            addCriterion("sum_event is null");
            return (Criteria) this;
        }

        public Criteria andSumEventIsNotNull() {
            addCriterion("sum_event is not null");
            return (Criteria) this;
        }

        public Criteria andSumEventEqualTo(Integer value) {
            addCriterion("sum_event =", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventNotEqualTo(Integer value) {
            addCriterion("sum_event <>", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventGreaterThan(Integer value) {
            addCriterion("sum_event >", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_event >=", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventLessThan(Integer value) {
            addCriterion("sum_event <", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventLessThanOrEqualTo(Integer value) {
            addCriterion("sum_event <=", value, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventIn(List<Integer> values) {
            addCriterion("sum_event in", values, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventNotIn(List<Integer> values) {
            addCriterion("sum_event not in", values, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventBetween(Integer value1, Integer value2) {
            addCriterion("sum_event between", value1, value2, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andSumEventNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_event not between", value1, value2, "sumEvent");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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