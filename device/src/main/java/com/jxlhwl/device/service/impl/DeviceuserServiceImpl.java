package com.jxlhwl.device.service.impl;

import com.jxlhwl.common.ServerResponse;
import com.jxlhwl.device.service.IDeviceUserService;
import com.jxlhwl.device.dao.DeviceUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jxlhwl.device.pojo.DeviceUsers;

import java.util.List;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-27  8:47
 */
@Service
public class DeviceuserServiceImpl implements IDeviceUserService {

    @Autowired
    DeviceUsersMapper deviceUsersMapper;

    @Override
    public ServerResponse getDeviceUsers() {
        List<DeviceUsers> deviceUsersList = deviceUsersMapper.selectAll();
        return ServerResponse.createBySuccess(deviceUsersList);
    }
}
