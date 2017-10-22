package com.jxlhwl.device.service;


import com.github.pagehelper.PageInfo;
import com.jxlhwl.common.ServerResponse;
import com.jxlhwl.device.pojo.DeviceStatus;
import com.jxlhwl.device.pojo.DeviceRepair;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-20  14:08
 */
public interface DeviceStatusService {
    ServerResponse takeReturn(String deviceId, Integer deviceTypeId, Integer status, Integer userId);

    ServerResponse findAll(DeviceStatus deviceStatus, int pageSize, int currentPage);

    ServerResponse<PageInfo> findRepair(DeviceRepair deviceRepair, int pageSize, int pageNum);

    ServerResponse updateRepair(DeviceRepair deviceRepair);
}
