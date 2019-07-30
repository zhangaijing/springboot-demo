package com.zyy.taskmanage.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyy.taskmanage.dao.mapper.DeviceExternalMapper;
import com.zyy.taskmanage.dao.model.DeviceExternal;
import com.zyy.taskmanage.service.DeviceExternalService;

/**
 * @Author zhangyy
 * @DateTime 2019-07-30 17:56
 * @Description
 */
@Service
public class DeviceExternalServiceImpl implements DeviceExternalService {

    @Resource
    private DeviceExternalMapper deviceExternalMapper;

    @Override public Long add(DeviceExternal deviceExternal){
        deviceExternalMapper.insert(deviceExternal);
        return deviceExternal.getId();
    }
}
