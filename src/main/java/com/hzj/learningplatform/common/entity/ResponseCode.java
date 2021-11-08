package com.hzj.learningplatform.common.entity;

import org.springframework.http.HttpStatus;

public enum ResponseCode {

    SUCCESS_OK(200, HttpStatus.OK, "操作成功");

    private final Integer code;

    private final HttpStatus status;

    private final String message;

    ResponseCode(Integer code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
