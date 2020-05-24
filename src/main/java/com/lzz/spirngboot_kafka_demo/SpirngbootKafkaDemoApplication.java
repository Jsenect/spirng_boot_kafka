package com.lzz.spirngboot_kafka_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lzz.spirngboot_kafka_demo.domain.mapper"})
public class SpirngbootKafkaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpirngbootKafkaDemoApplication.class, args);
    }

}
