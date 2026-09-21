package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
    	log.info("Hello Api Called");
    	return "Hello from CI/CD Demo!";
    }
}