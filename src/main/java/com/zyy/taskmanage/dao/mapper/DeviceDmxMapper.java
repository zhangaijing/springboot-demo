package com.zyy.taskmanage.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zyy.taskmanage.dao.model.DeviceDmx;
import com.zyy.taskmanage.dao.model.DeviceDmxExample;

public interface DeviceDmxMapper {
    /**
     *
     * @param example
     */
    long countByExample(DeviceDmxExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(DeviceDmxExample example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(DeviceDmx record);

    /**
     *
     * @param record
     */
    int insertSelective(DeviceDmx record);

    /**
     *
     * @param example
     */
    List<DeviceDmx> selectByExample(DeviceDmxExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    DeviceDmx selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") DeviceDmx record,@Param("example") DeviceDmxExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") DeviceDmx record,@Param("example") DeviceDmxExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(DeviceDmx record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(DeviceDmx record);
}