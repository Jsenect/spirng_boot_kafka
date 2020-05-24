package com.lzz.spirngboot_kafka_demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzz.spirngboot_kafka_demo.domain.entity.EventData;
import com.lzz.spirngboot_kafka_demo.domain.entity.EventDataExample;
import com.lzz.spirngboot_kafka_demo.domain.entity.StatisticsData;
import com.lzz.spirngboot_kafka_demo.domain.entity.StatisticsDataExample;
import com.lzz.spirngboot_kafka_demo.domain.mapper.EventDataMapper;
import com.lzz.spirngboot_kafka_demo.domain.mapper.StatisticsDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/5/20 10:26
 */
@Service
public class EventDataService {


    @Autowired
    EventDataMapper eventDataMapper;

    @Autowired
    StatisticsDataMapper statisticsDataMapper;

    public PageInfo<EventData> findall() {
        EventDataExample eventDataExample = new EventDataExample();
        EventDataExample.Criteria criteria = eventDataExample.createCriteria();
        criteria.andEventIdEqualTo(3);
        PageHelper.startPage(1, 20);
        List<EventData> eventData = this.eventDataMapper.selectByExample(eventDataExample);
        PageInfo<EventData> pageInfo = PageInfo.of(eventData);
        return pageInfo;
    }


    public PageInfo<StatisticsData> findStatis() {
        StatisticsDataExample statisticsDataExample = new StatisticsDataExample();
        StatisticsDataExample.Criteria criteria1 = statisticsDataExample.createCriteria();
        criteria1.andLaneNumEqualTo(3);
        PageHelper.startPage(1, 20);
        List<StatisticsData> eventData = this.statisticsDataMapper.selectByExample(statisticsDataExample);
        PageInfo<StatisticsData> pageInfo = PageInfo.of(eventData);
        return pageInfo;
    }



}
