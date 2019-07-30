package com.zyy.taskmanage.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zyy.taskmanage.dao.model.DeviceExternal;
import com.zyy.taskmanage.service.DeviceExternalService;

/**
 * @Author zhangyy
 * @DateTime 2019-07-30 17:59
 * @Description
 */
@RestController
@RequestMapping("/deviceExternal")
public class DeviceExternalController {

    @Resource
    private DeviceExternalService externalService;

    @PostMapping("/add")
    public Long add(@RequestBody DeviceExternal deviceExternal){
        return externalService.add(deviceExternal);
    }
}
