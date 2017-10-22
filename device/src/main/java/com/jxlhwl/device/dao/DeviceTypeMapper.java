package com.jxlhwl.device.dao;


import com.jxlhwl.device.pojo.DeviceType;

public interface DeviceTypeMapper {
    int deleteByPrimaryKey(Integer deviceTypeId);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    DeviceType selectByPrimaryKey(Integer deviceTypeId);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKey(DeviceType record);
}