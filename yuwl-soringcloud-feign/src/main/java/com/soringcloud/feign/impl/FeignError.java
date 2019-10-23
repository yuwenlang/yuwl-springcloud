package com.soringcloud.feign.impl;

import com.soringcloud.entity.Student;
import com.soringcloud.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String getPort() {
        return "服务器维护中......";
    }
}
