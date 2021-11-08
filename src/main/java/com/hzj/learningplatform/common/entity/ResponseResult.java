package com.hzj.learningplatform.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回结果响应格式
 * @author hezhijian
 * @param <T>
 */
@ApiModel(value = "返回的数据结构", description = "返回的数据结构")
public class ResponseResult<T> {

    /**
     * 请求状态码
     */
    @ApiModelProperty(value = "请求状态码", name = "code", example = "200")
    private Integer code;

    /**
     * 请求结果信息
     */
    @ApiModelProperty(value = "请求结果提示信息", name = "message", example = "操作成功")
    private String message;

    /**
     * 请求结果数据
     */
    @ApiModelProperty(value = "请求结果数据", name = "data")
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
