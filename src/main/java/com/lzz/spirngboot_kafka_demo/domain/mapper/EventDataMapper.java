package com.lzz.spirngboot_kafka_demo.domain.mapper;

import com.lzz.spirngboot_kafka_demo.domain.entity.EventData;
import com.lzz.spirngboot_kafka_demo.domain.entity.EventDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventDataMapper {
    long countByExample(EventDataExample example);

    int deleteByExample(EventDataExample example);

    int insert(EventData record);

    int insertSelective(EventData record);

    List<EventData> selectByExample(EventDataExample example);

    int updateByExampleSelective(@Param("record") EventData record, @Param("example") EventDataExample example);

    int updateByExample(@Param("record") EventData record, @Param("example") EventDataExample example);
}