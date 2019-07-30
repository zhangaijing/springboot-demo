package com.zyy.taskmanage.controller;

import javax.annotation.Resource;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zyy.taskmanage.dao.model.DeviceDmx;
import com.zyy.taskmanage.service.DeviceDmxService;

/**
 * @Author zhangyy
 * @DateTime 2019-07-30 14:38
 * @Description
 */
@RestController
@RequestMapping("/deviceDmx")
public class DeviceDmxController {

    @Resource
    private DeviceDmxService deviceDmxService;

    @PostMapping("/add")
    public void add(@RequestBody DeviceDmx deviceDmx){
        deviceDmxService.add(deviceDmx);
    }

    @PostMapping("/update")
    public void udpate(@RequestBody DeviceDmx deviceDmx){
        deviceDmxService.update(deviceDmx);
    }

    @PostMapping("/remove")
    public void remove(@RequestBody Long id){
        deviceDmxService.delete(id);
    }

    @PostMapping("/getById")
    public DeviceDmx getById(@RequestBody Long id){
        return deviceDmxService.getById(id);
    }

    @PostMapping("/pageBySearch")
    public PageInfo<DeviceDmx> pageBySearch(@RequestBody List<Long> ids){
        return deviceDmxService.pageBySearch(ids);
    }
}
