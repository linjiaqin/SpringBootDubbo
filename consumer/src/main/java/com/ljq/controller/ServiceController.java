package com.ljq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ljq.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Component
public class ServiceController {

    @Reference
    private DubboService dubboService;

    @RequestMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return dubboService.welcome(name);
    }
    @RequestMapping("/hello")
    public String Hello(String name) {
        return dubboService.welcome("ljq");
    }
}

