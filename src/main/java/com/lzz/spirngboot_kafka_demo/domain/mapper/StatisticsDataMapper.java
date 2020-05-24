package com.lzz.spirngboot_kafka_demo.domain.mapper;

import com.lzz.spirngboot_kafka_demo.domain.entity.StatisticsData;
import com.lzz.spirngboot_kafka_demo.domain.entity.StatisticsDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StatisticsDataMapper {
    long countByExample(StatisticsDataExample example);

    int deleteByExample(StatisticsDataExample example);

    int insert(StatisticsData record);

    int insertSelective(StatisticsData record);

    List<StatisticsData> selectByExample(StatisticsDataExample example);

    int updateByExampleSelective(@Param("record") StatisticsData record, @Param("example") StatisticsDataExample example);

    int updateByExample(@Param("record") StatisticsData record, @Param("example") StatisticsDataExample example);
}