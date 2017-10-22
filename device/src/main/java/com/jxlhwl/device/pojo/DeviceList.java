package com.jxlhwl.device.pojo;

import java.util.Date;

public class DeviceList {
    private String deviceId;

    private Integer deviceTypeId;

    private Date adddate;

    private Date editdate;

    public DeviceList(String deviceId, Integer deviceTypeId, Date adddate, Date editdate) {
        this.deviceId = deviceId;
        this.deviceTypeId = deviceTypeId;
        this.adddate = adddate;
        this.editdate = editdate;
    }

    public DeviceList() {
        super();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }
}