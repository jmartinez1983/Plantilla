package com.example.demo.service;

import com.example.demo.DemoApplication;
import com.example.demo.domain.Demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class DemoServiceImplTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void insertTest() {
        Demo demo = Demo.builder().id("1").name("nombre").build();
        demoService.insert(demo);
        demo = demoService.find("1");
        Assertions.assertEquals(demo.getName(), "nombre");
    }
}
