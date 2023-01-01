package com.example.bobapi.sample.mapper;

import com.example.bobapi.sample.vo.SampleResultVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SampleRepository {

    List<SampleResultVo> getSampleList();
}
