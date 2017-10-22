package com.jxlhwl.web.controller;


import com.github.pagehelper.PageInfo;
import com.jxlhwl.common.LayuiTableResponse;
import com.jxlhwl.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jxlhwl.device.pojo.DeviceRepair;
import com.jxlhwl.device.pojo.DeviceStatus;
import com.jxlhwl.device.service.DeviceStatusService;
import com.jxlhwl.device.service.IDeviceUserService;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-20  13:48
 */
@Controller
@RequestMapping("/com/jxlhwl/device")
public class DeviceStatusController {

    @Autowired
    DeviceStatusService deviceStatusService;

    @Autowired
    IDeviceUserService deviceUserService;

    @RequestMapping("/takeReturn")
    @ResponseBody
    public ServerResponse takeReturn(@RequestParam(value = "deviceTypeId", defaultValue = "1") Integer deviceTypeId,
                                     @RequestParam(value = "deviceId") String deviceId,
                                     @RequestParam(value = "status") Integer status,
                                     @RequestParam(value = "userId") Integer userId){
        ServerResponse response = deviceStatusService.takeReturn(deviceId, deviceTypeId, status, userId);
        return response;
    }

    @RequestMapping("/getDeviceUsers")
    @ResponseBody
    public ServerResponse getDeviceUsers(){
        ServerResponse response = deviceUserService.getDeviceUsers();
        return response;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public LayuiTableResponse findAll(@RequestParam(value = "pageSize", defaultValue = "10") String pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                                      DeviceStatus deviceStatus){
        deviceStatus = deviceStatus.toNull(deviceStatus);
        ServerResponse<PageInfo> response = deviceStatusService.findAll(deviceStatus, Integer.parseInt(pageSize), pageNum);
        LayuiTableResponse layuiTableResponse = response.parseToLayuiTableResponse(response);
        return layuiTableResponse;
    }

    @RequestMapping("/repair")
    @ResponseBody
    public LayuiTableResponse find(@RequestParam(value = "pageSize", defaultValue = "10") String pageSize,
                               @RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                               DeviceRepair deviceRepair){
        deviceRepair = deviceRepair.toNull(deviceRepair);
        ServerResponse<PageInfo> response = deviceStatusService.findRepair(deviceRepair, Integer.parseInt(pageSize), pageNum);
        LayuiTableResponse layuiTableResponse = response.parseToLayuiTableResponse(response);
        return layuiTableResponse;
    }

    @RequestMapping("/updateRepair")
    @ResponseBody
    public ServerResponse updateRepair(DeviceRepair deviceRepair){
        return deviceStatusService.updateRepair(deviceRepair);
    }

}
