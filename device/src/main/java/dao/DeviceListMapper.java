package dao;

import com.management.device.pojo.DeviceList;
import org.apache.ibatis.annotations.Param;

public interface DeviceListMapper {
    int deleteByPrimaryKey(String deviceId);

    int insert(DeviceList record);

    int insertSelective(DeviceList record);

    DeviceList selectByPrimaryKey(String deviceId);

    int updateByPrimaryKeySelective(DeviceList record);

    int updateByPrimaryKey(DeviceList record);

    DeviceList selectByDeviceIdAndDeviceTypeId(@Param("deviceId") String deviceId, @Param("deviceTypeId") Integer deviceTypeId);
}