package vo;

import lombok.Data;

import java.util.Date;

/**
 * Description:
 * User: wen-sr
 * Date: 2017-10-10  15:36
 */
@Data
public class DeviceVo {
    private String deviceId;

    private Integer deviceTypeId;

    private String deviceTypeName;

    private Integer deviceUserId;

    private String deviceUserName;

    private String status;

    private String adddate;

    private String editdate;
}
