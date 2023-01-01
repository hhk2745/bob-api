package com.example.bobapi.sample.service;

import com.example.bobapi.sample.mapper.SampleRepository;
import com.example.bobapi.sample.vo.SampleResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;


    public List<SampleResultVo> getSampleList(){
        try{
            return sampleRepository.getSampleList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
