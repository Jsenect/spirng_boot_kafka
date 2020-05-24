package com.lzz.spirngboot_kafka_demo.serializer;

import com.lzz.spirngboot_kafka_demo.manager.FstManager;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * create by niling on 2019/12/4
 */
public class FstKafkaSerializer implements Serializer<Object> {

    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public byte[] serialize(String s, Object o) {
        if (null == o) {
            return null;
        }
        return FstManager.INSTANCE().asByteArray(o);
    }

    @Override
    public void close() {

    }
}
