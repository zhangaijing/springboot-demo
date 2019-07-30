package com.zyy.taskmanage.dao.mapper;

import com.zyy.taskmanage.dao.model.DeviceExternal;
import com.zyy.taskmanage.dao.model.DeviceExternalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceExternalMapper {
    /**
     *
     * @param example
     */
    long countByExample(DeviceExternalExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(DeviceExternalExample example);

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
    int insert(DeviceExternal record);

    /**
     *
     * @param record
     */
    int insertSelective(DeviceExternal record);

    /**
     *
     * @param example
     */
    List<DeviceExternal> selectByExample(DeviceExternalExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    DeviceExternal selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") DeviceExternal record, @Param("example") DeviceExternalExample example);

    /**
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") DeviceExternal record, @Param("example") DeviceExternalExample example);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(DeviceExternal record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(DeviceExternal record);
}