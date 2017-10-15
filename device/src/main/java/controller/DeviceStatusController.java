package controller;

import com.github.pagehelper.PageInfo;
import com.management.common.LayuiTableResponse;
import com.management.common.ServerResponse;
import com.management.device.pojo.DeviceRepair;
import com.management.device.pojo.DeviceStatus;
import com.management.device.service.DeviceStatusService;
import com.management.device.service.IDeviceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-20  13:48
 */
@RestController
@RequestMapping("/device")
public class DeviceStatusController {

    @Autowired
    DeviceStatusService deviceStatusService;

    @Autowired
    IDeviceUserService deviceUserService;

    @RequestMapping("/takeReturn")
    public ServerResponse takeReturn(@RequestParam(value = "deviceTypeId", defaultValue = "1") Integer deviceTypeId,
                                     @RequestParam(value = "deviceId") String deviceId,
                                     @RequestParam(value = "status") Integer status,
                                     @RequestParam(value = "userId") Integer userId){
        ServerResponse response = deviceStatusService.takeReturn(deviceId, deviceTypeId, status, userId);
        return response;
    }

    @RequestMapping("/getDeviceUsers")
    public ServerResponse getDeviceUsers(){
        ServerResponse response = deviceUserService.getDeviceUsers();
        return response;
    }

    @RequestMapping("/findAll")
    public LayuiTableResponse findAll(@RequestParam(value = "pageSize", defaultValue = "10") String pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                                      DeviceStatus deviceStatus){
        deviceStatus = deviceStatus.toNull(deviceStatus);
        ServerResponse<PageInfo> response = deviceStatusService.findAll(deviceStatus, Integer.parseInt(pageSize), pageNum);
        LayuiTableResponse layuiTableResponse = response.parseToLayuiTableResponse(response);
        return layuiTableResponse;
    }

    @RequestMapping("/repair")
    public LayuiTableResponse find(@RequestParam(value = "pageSize", defaultValue = "10") String pageSize,
                               @RequestParam(value = "pageNum", defaultValue = "1")int pageNum,
                               DeviceRepair deviceRepair){
        deviceRepair = deviceRepair.toNull(deviceRepair);
        ServerResponse<PageInfo> response = deviceStatusService.findRepair(deviceRepair, Integer.parseInt(pageSize), pageNum);
        LayuiTableResponse layuiTableResponse = response.parseToLayuiTableResponse(response);
        return layuiTableResponse;
    }

    @RequestMapping("/updateRepair")
    public ServerResponse updateRepair(DeviceRepair deviceRepair){
        return deviceStatusService.updateRepair(deviceRepair);
    }

}
