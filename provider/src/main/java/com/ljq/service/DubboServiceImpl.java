package com.ljq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ljq.DubboService;


@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String welcome(String name) {
        return "hello, I am " + name;
    }
}
