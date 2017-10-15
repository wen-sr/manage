package pojo;

import java.util.Date;

public class DeviceType {
    private Integer deviceTypeId;

    private String deviceTypeName;

    private Date adddate;

    private Date editdate;

    public DeviceType(Integer deviceTypeId, String deviceTypeName, Date adddate, Date editdate) {
        this.deviceTypeId = deviceTypeId;
        this.deviceTypeName = deviceTypeName;
        this.adddate = adddate;
        this.editdate = editdate;
    }

    public DeviceType() {
        super();
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