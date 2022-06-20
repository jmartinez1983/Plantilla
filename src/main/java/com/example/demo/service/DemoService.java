package com.example.demo.service;

import com.example.demo.domain.Demo;

public interface DemoService {

    public void insert(Demo demo);

    public Demo find(String id);
}
