package dao;

import com.management.device.pojo.DeviceRepair;

import java.util.List;

public interface DeviceRepairMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DeviceRepair record);

    int insertSelective(DeviceRepair record);

    DeviceRepair selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeviceRepair record);

    int updateByPrimaryKey(DeviceRepair record);

    List<DeviceRepair> findAll(DeviceRepair deviceRepair);
}