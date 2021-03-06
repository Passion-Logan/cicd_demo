package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wql
 * @desc TestController
 * @date 2021/11/12
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/11/12
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String test() {
        return "hello";
    }

}
