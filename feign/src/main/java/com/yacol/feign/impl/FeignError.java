package com.yacol.feign.impl;

import com.yacol.entiry.Student;
import com.yacol.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务维护中";
    }
}
