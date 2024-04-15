package com.breczinski.webapitest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
}
