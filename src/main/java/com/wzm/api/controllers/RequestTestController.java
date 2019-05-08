package com.wzm.api.controllers;

/**
 * Created by Administrator on 2019/5/3 0009.
 */


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        return "this is a test string. Time:2019-05-08 16:58:00";
    }
}