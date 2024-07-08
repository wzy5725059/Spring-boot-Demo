package com.dce.demo.controller;

import com.dce.demo.mapper.SysInfoMapper;
import com.dce.demo.model.SysInfo;
import com.dce.demo.model.SysInfoExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Resource
    private SysInfoMapper sysInfoMapper;
    @GetMapping("/test")
    public String test() {
        return sysInfoMapper.selectByExample(new SysInfoExample()).get(0).getName();
    }
}
