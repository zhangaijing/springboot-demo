package com.zyy.taskmanage.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zyy.taskmanage.dao.model.DeviceDmx;

/**
 * @Author zhangyy
 * @DateTime 2019-07-30 14:40
 * @Description
 */
public interface DeviceDmxService {

    /**
     * DMX添加
     * @param deviceDmx
     */
    void add(DeviceDmx deviceDmx);

    /**
     * DMX更新
     * @param deviceDmx
     */
    void update(DeviceDmx deviceDmx);

    /**
     * DMX删除
     * @param id
     */
    void delete(Long id);

    /**
     * 根据ID获取DMX
     * @param id
     * @return
     */
    DeviceDmx getById(Long id);

    /**
     * 根据查询条件获取DMX分页
     * @param ids
     * @return
     */
    PageInfo<DeviceDmx> pageBySearch(List<Long> ids);
}
