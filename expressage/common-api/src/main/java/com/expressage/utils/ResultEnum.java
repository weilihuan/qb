package com.expressage.utils;

public enum ResultEnum {

    YF_0000(1, "成功"),
    YF_9999(0,"失败");

    private final Integer code;
    private final String msg;

    ResultEnum(Integer code , String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
