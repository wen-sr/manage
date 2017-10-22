package com.jxlhwl.common;

public class Constant {
    public static final String CURRENT_USER     = "currentUser";
    public static final String USERNAME         = "username";
    public static final String EMAIL            = "email";

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }

    public enum DeviceStatusEnum{

        TAKE(0, "领用"),
        RETURN(1, "归还"),
        FIX(2, "维修"),
        QUERY(3, "查询"),
        REPAIRING(4, "维修中"),
        REPAIRED(5, "已维修")
        ;

        private Integer code;
        private String msg;

        DeviceStatusEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public static DeviceStatusEnum codeOf(int code){
            for(DeviceStatusEnum deviceStatusEnum : values()){
                if(deviceStatusEnum.getCode() == code){
                    return deviceStatusEnum;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }


}
