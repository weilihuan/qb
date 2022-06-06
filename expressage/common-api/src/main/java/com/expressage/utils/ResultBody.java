package com.expressage.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

import static com.expressage.utils.ResultEnum.*;

public class ResultBody<T> implements Serializable {
    private static final long serialVersionUID = 4580737268023862568L;

    private Integer code;

    private String msg;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public ResultBody() {
    }

    public ResultBody(Integer code){
        this.code = code;
    }

    //是否成功（自定义结果码为1000为成功）
    @JsonIgnore
    public boolean isSuccess(){
        return this.code == 1;
    }
    
    //成功时引用
    public static <T> ResultBody<T> success(){
        return success(YF_0000);
    }
    public static <T> ResultBody<T> success(T data){
        return success(YF_0000,data);
    }
    public static <T> ResultBody<T> success(ResultEnum re){
        return success(re,null);
    }
    public static <T> ResultBody<T> success(ResultEnum re,T data){
        Integer code = re.getCode();
        String msg = re.getMsg();
        return success(code,msg,data);
    }
    public static <T> ResultBody<T> success(Integer code, String msg, T data){
        ResultBody<T> result = new ResultBody<>(1);
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
    //失败时引用
    public static <T> ResultBody<T> fail(){
        return fail(YF_9999);
    }
    public static <T> ResultBody<T> fail(ResultEnum re){
        return fail(re,null);
    }
    public static <T> ResultBody<T> fail(String msg){
        return fail(YF_9999.getCode(),msg,null);
    }
    public static <T> ResultBody<T> fail(T data){
        return fail(YF_9999,data);
    }
    public static <T> ResultBody<T> fail(ResultEnum re, T data){
        Integer code = re.getCode();
        String msg = re.getMsg();
        return fail(code,msg,data);
    }
    public static <T> ResultBody<T> fail(Integer code , String msg, T data){
        ResultBody<T> result = new ResultBody<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
