package com.example.bobapi.sample;

import com.example.bobapi.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("")
    public Object getSample(HttpServletRequest request){



        return sampleService.getSampleList();
    }
}
