package com.example.demo.controller;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Demo demo){
        demoService.insert(demo);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<Demo> find(@RequestBody String id){
        return new ResponseEntity<>(demoService.find(id), HttpStatus.ACCEPTED);
    }
}
