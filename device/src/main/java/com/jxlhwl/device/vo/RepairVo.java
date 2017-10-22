package com.jxlhwl.device.vo;

import lombok.Data;

@Data
public class RepairVo {
    private Long id;

    private String deviceId;

    private Integer deviceTypeId;

    private String deviceTypeName;

    private Integer deviceUserId;

    private String deviceUserName;

    private String status;

    private String cause;

    private String bakup;

    private String adddate;

    private String editdate;
}
