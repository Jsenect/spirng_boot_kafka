package com.lzz.spirngboot_kafka_demo.serializer;

import com.lzz.spirngboot_kafka_demo.manager.FstManager;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * create by niling on 2019/12/4
 */
public class FstKafkaDeserializer implements Deserializer<Object> {
    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public Object deserialize(String s, byte[] bytes) {
        if (null == bytes || 0 == bytes.length) {
            return null;
        }
        return FstManager.INSTANCE().asObject(bytes);
    }

    @Override
    public void close() {

    }
}
