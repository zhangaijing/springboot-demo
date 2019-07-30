package com.zyy.taskmanage.service.impl;

import javax.annotation.Resource;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyy.taskmanage.dao.mapper.DeviceDmxMapper;
import com.zyy.taskmanage.dao.model.DeviceDmx;
import com.zyy.taskmanage.dao.model.DeviceDmxExample;
import com.zyy.taskmanage.service.DeviceDmxService;

/**
 * @Author zhangyy
 * @DateTime 2019-07-30 14:44
 * @Description
 */
@Service
public class DeviceDmxServiceImpl implements DeviceDmxService {

    @Resource
    private DeviceDmxMapper deviceDmxMapper;

    @Override public void add(DeviceDmx deviceDmx){
        deviceDmxMapper.insert(deviceDmx);
    }

    @Override public void update(DeviceDmx deviceDmx){
        deviceDmxMapper.updateByPrimaryKey(deviceDmx);
    }

    @Override public void delete(Long id){
        deviceDmxMapper.deleteByPrimaryKey(id);
    }

    @Override public DeviceDmx getById(Long id){
        DeviceDmx deviceDmx=deviceDmxMapper.selectByPrimaryKey(id);
        return deviceDmx;
    }

    @Override public PageInfo<DeviceDmx> pageBySearch(List<Long> ids){
        DeviceDmxExample deviceDmxExample=new DeviceDmxExample();
        deviceDmxExample.createCriteria().andIdIn(ids);
        PageHelper.startPage(1, 20);
        PageInfo<DeviceDmx> deviceDmxPageInfo=new PageInfo<>(deviceDmxMapper.selectByExample(deviceDmxExample));
        return deviceDmxPageInfo;
    }
}
