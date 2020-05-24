package com.lzz.spirngboot_kafka_demo.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class StatisticsData implements Serializable {
    private Long id;

    private String radarId;

    private Double position;

    private String direction;

    private Integer laneNum;

    private Long cycle;

    private Integer sumCar;

    private Integer sumSmallCar;

    private Integer sumMidCar;

    private Integer sumBigCar;

    private Double avgSpeed;

    private Integer sumTarget;

    private Double sumSpeed;

    private Double avgSmallSpeed;

    private Integer sumSmallTarget;

    private Double sumSmallSpeed;

    private Double avgMidSpeed;

    private Integer sumMidTarget;

    private Double sumMidSpeed;

    private Double avgBigSpeed;

    private Integer sumBigTarget;

    private Double sumBigSpeed;

    private Double occupancy;

    private Double headway;

    private Double gap;

    private Double speed85;

    private Integer sumEvent;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRadarId() {
        return radarId;
    }

    public void setRadarId(String radarId) {
        this.radarId = radarId == null ? null : radarId.trim();
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Integer getLaneNum() {
        return laneNum;
    }

    public void setLaneNum(Integer laneNum) {
        this.laneNum = laneNum;
    }

    public Long getCycle() {
        return cycle;
    }

    public void setCycle(Long cycle) {
        this.cycle = cycle;
    }

    public Integer getSumCar() {
        return sumCar;
    }

    public void setSumCar(Integer sumCar) {
        this.sumCar = sumCar;
    }

    public Integer getSumSmallCar() {
        return sumSmallCar;
    }

    public void setSumSmallCar(Integer sumSmallCar) {
        this.sumSmallCar = sumSmallCar;
    }

    public Integer getSumMidCar() {
        return sumMidCar;
    }

    public void setSumMidCar(Integer sumMidCar) {
        this.sumMidCar = sumMidCar;
    }

    public Integer getSumBigCar() {
        return sumBigCar;
    }

    public void setSumBigCar(Integer sumBigCar) {
        this.sumBigCar = sumBigCar;
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Integer getSumTarget() {
        return sumTarget;
    }

    public void setSumTarget(Integer sumTarget) {
        this.sumTarget = sumTarget;
    }

    public Double getSumSpeed() {
        return sumSpeed;
    }

    public void setSumSpeed(Double sumSpeed) {
        this.sumSpeed = sumSpeed;
    }

    public Double getAvgSmallSpeed() {
        return avgSmallSpeed;
    }

    public void setAvgSmallSpeed(Double avgSmallSpeed) {
        this.avgSmallSpeed = avgSmallSpeed;
    }

    public Integer getSumSmallTarget() {
        return sumSmallTarget;
    }

    public void setSumSmallTarget(Integer sumSmallTarget) {
        this.sumSmallTarget = sumSmallTarget;
    }

    public Double getSumSmallSpeed() {
        return sumSmallSpeed;
    }

    public void setSumSmallSpeed(Double sumSmallSpeed) {
        this.sumSmallSpeed = sumSmallSpeed;
    }

    public Double getAvgMidSpeed() {
        return avgMidSpeed;
    }

    public void setAvgMidSpeed(Double avgMidSpeed) {
        this.avgMidSpeed = avgMidSpeed;
    }

    public Integer getSumMidTarget() {
        return sumMidTarget;
    }

    public void setSumMidTarget(Integer sumMidTarget) {
        this.sumMidTarget = sumMidTarget;
    }

    public Double getSumMidSpeed() {
        return sumMidSpeed;
    }

    public void setSumMidSpeed(Double sumMidSpeed) {
        this.sumMidSpeed = sumMidSpeed;
    }

    public Double getAvgBigSpeed() {
        return avgBigSpeed;
    }

    public void setAvgBigSpeed(Double avgBigSpeed) {
        this.avgBigSpeed = avgBigSpeed;
    }

    public Integer getSumBigTarget() {
        return sumBigTarget;
    }

    public void setSumBigTarget(Integer sumBigTarget) {
        this.sumBigTarget = sumBigTarget;
    }

    public Double getSumBigSpeed() {
        return sumBigSpeed;
    }

    public void setSumBigSpeed(Double sumBigSpeed) {
        this.sumBigSpeed = sumBigSpeed;
    }

    public Double getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Double occupancy) {
        this.occupancy = occupancy;
    }

    public Double getHeadway() {
        return headway;
    }

    public void setHeadway(Double headway) {
        this.headway = headway;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public Double getSpeed85() {
        return speed85;
    }

    public void setSpeed85(Double speed85) {
        this.speed85 = speed85;
    }

    public Integer getSumEvent() {
        return sumEvent;
    }

    public void setSumEvent(Integer sumEvent) {
        this.sumEvent = sumEvent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}