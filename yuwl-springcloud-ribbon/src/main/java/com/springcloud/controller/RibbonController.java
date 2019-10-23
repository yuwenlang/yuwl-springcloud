package com.springcloud.controller;

import com.springcloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://PROVIDER/student/findAll",Collection.class);
    }

    @GetMapping("getPort")
    public String getPort(){
        return restTemplate.getForObject("http://PROVIDER/student/getPortInfo",String.class);
    }

}
