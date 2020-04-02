package com.xixi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("info")
    public String info() {
        return "info";
    }
    // 开发人员
}
