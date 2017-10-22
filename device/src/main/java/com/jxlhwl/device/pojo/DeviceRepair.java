package com.jxlhwl.device.pojo;

import java.util.Date;

public class DeviceRepair {
    private Long id;

    private String deviceId;

    private Integer deviceTypeId;

    private String deviceTypeName;

    private Integer deviceUserId;

    private String deviceUserName;

    private Integer status;

    private String cause;

    private String bakup;

    private Date adddate;

    private Date editdate;

    public DeviceRepair(Long id, String deviceId, Integer deviceTypeId, String deviceTypeName, Integer deviceUserId, String deviceUserName, Integer status, String cause, String bakup, Date adddate, Date editdate) {
        this.id = id;
        this.deviceId = deviceId;
        this.deviceTypeId = deviceTypeId;
        this.deviceTypeName = deviceTypeName;
        this.deviceUserId = deviceUserId;
        this.deviceUserName = deviceUserName;
        this.status = status;
        this.cause = cause;
        this.bakup = bakup;
        this.adddate = adddate;
        this.editdate = editdate;
    }

    public DeviceRepair() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    public Integer getDeviceUserId() {
        return deviceUserId;
    }

    public void setDeviceUserId(Integer deviceUserId) {
        this.deviceUserId = deviceUserId;
    }

    public String getDeviceUserName() {
        return deviceUserName;
    }

    public void setDeviceUserName(String deviceUserName) {
        this.deviceUserName = deviceUserName == null ? null : deviceUserName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getBakup() {
        return bakup;
    }

    public void setBakup(String bakup) {
        this.bakup = bakup == null ? null : bakup.trim();
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

    public DeviceRepair toNull(DeviceRepair deviceRepair) {
        if(deviceRepair.deviceId == "") {
            deviceRepair.deviceId = null;
        }
        return deviceRepair;
    }
}