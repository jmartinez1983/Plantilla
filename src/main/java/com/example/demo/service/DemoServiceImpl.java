package com.example.demo.service;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.Demo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DemoServiceImpl implements DemoService  {

    private DemoDao demoDao;

    @Override
    public void insert(Demo demo) {
        demoDao.insert(demo);
    }

    @Override
    public Demo find(String id) {
        return demoDao.find(id);
    }
}
