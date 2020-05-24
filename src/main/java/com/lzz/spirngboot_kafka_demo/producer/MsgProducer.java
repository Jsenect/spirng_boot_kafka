package com.lzz.spirngboot_kafka_demo.producer;

import com.github.pagehelper.PageInfo;
import com.gx.rvf.common.lib.dto.DataMetricEventDto;
import com.gx.rvf.common.lib.dto.DataMetricStatisticsDto;
import com.lzz.spirngboot_kafka_demo.domain.entity.EventData;
import com.lzz.spirngboot_kafka_demo.domain.entity.StatisticsData;
import com.lzz.spirngboot_kafka_demo.service.EventDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zzl
 * @Date 2020/5/20 9:46
 */
@Slf4j
@Component
@EnableScheduling
public class MsgProducer {


    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private EventDataService eventDataService;


    public void send() {
        PageInfo<EventData> findall = eventDataService.findall();
        List<EventData> list = findall.getList();
        log.info("list为{ }" + list);
        list.forEach(e ->
        {
            DataMetricEventDto dataMetricEventDto = new DataMetricEventDto();
            log.info("radarId 为:{}" + e.getRadarId());
            com.gx.rvf.common.lib.entity.metric.remote.EventData eventData = new com.gx.rvf.common.lib.entity.metric.remote.EventData();
            BeanUtils.copyProperties(e,eventData);
            dataMetricEventDto.setEventData(eventData);

            ListenableFuture listenableFuture = kafkaTemplate.send("rvf-metric-event-1", dataMetricEventDto);
            listenableFuture.addCallback(o -> log.info("生产者发送消息成功"),
                    throwable -> log.info("发送消息失败"));
        });

    }


    public void sendStatis() {
        PageInfo<StatisticsData> statis = eventDataService.findStatis();
        List<StatisticsData> list = statis.getList();
        List<com.gx.rvf.common.lib.entity.metric.remote.StatisticsData > arrayList = new ArrayList<>();
        list.forEach(e ->
        {
            com.gx.rvf.common.lib.entity.metric.remote.StatisticsData statisticsData = new com.gx.rvf.common.lib.entity.metric.remote.StatisticsData();
            BeanUtils.copyProperties(e,statisticsData);
            arrayList.add(statisticsData);
        });

        DataMetricStatisticsDto dataMetricEventDto = new DataMetricStatisticsDto();
        dataMetricEventDto.setDataList(arrayList);
        ListenableFuture listenableFuture = kafkaTemplate.send("rvf-metric-statistic-1", dataMetricEventDto);
        listenableFuture.addCallback(o -> log.info("生产者发送消息成功"),
                throwable -> log.info("发送消息失败"));
    }


}
