package com.dce.demo.mapper;

import com.dce.demo.model.SysInfo;
import com.dce.demo.model.SysInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysInfoMapper {


    List<SysInfo> selectByExample(SysInfoExample example);
    }