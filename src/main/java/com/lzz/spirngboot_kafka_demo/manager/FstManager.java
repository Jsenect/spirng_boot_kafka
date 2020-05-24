package com.lzz.spirngboot_kafka_demo.manager;


import org.nustaq.serialization.FSTConfiguration;

/**
 * create by niling on 2019/12/4
 */
public class FstManager {

    public static volatile FSTConfiguration fstConfiguration = FSTConfiguration.getDefaultConfiguration();

    public static FSTConfiguration INSTANCE() {
        return fstConfiguration;
    }

}
