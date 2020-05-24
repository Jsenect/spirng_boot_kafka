package com.lzz.spirngboot_kafka_demo.controller;

import com.lzz.spirngboot_kafka_demo.producer.MsgProducer;
import com.lzz.spirngboot_kafka_demo.service.EventDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzl
 * @Date 2020/5/20 10:28
 */

@RestController
public class EventController {

    @Autowired
    private EventDataService eventDataService;


    @Autowired
    private MsgProducer msgProducer;

    @RequestMapping("/send")
    public void findAll() {
        this.msgProducer.send();
    }


    @RequestMapping("/sendStatis")
    public void findStatis() {
        this.msgProducer.sendStatis();
    }


}
