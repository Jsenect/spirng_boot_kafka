package com.lzz.spirngboot_kafka_demo.consumer;

import com.gx.rvf.common.lib.dto.DataMetricEventDto;
import com.gx.rvf.common.lib.entity.metric.remote.EventData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author zzl
 * @Date 2020/5/20 9:52
 */
@Slf4j
//@Component
public class KafkaSimpleConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaSimpleConsumer.class);

    @KafkaListener(topics = "rvf-metric-event-1")
    public void consumer1(ConsumerRecord<String, Object> record) {

        Object value = record.value();
        if (value == null || !(value instanceof DataMetricEventDto)) {
            logger.warn("receive DataMetricEvent wrong value");
            return;
        }
        DataMetricEventDto eventDto = (DataMetricEventDto) value;

        EventData eventData = eventDto.getEventData();
        logger.info("时间对应的雷达的id为" + eventData.getRadarId());
        logger.info("消费者{}  消费到消息{}:" + eventDto.getEventData());

    }

}
