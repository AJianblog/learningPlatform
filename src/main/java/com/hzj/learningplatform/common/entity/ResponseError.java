package com.hzj.learningplatform.common.entity;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * 错误信息返回格式
 * @author hezhijian
 */
public class ResponseError {
    /**
     * 错误信息
     */
    private String message;

    /**
     * 错误类型
     */
    private String errorTypeName;

    /**
     * 请求api地址
     */
    private String path;

    /**
     * 请求时间
     */
    private Instant timestamp;

    public ResponseError() {
    }

    public ResponseError(String message, String errorTypeName, String path) {
        this.message = message;
        this.errorTypeName = errorTypeName;
        this.path = path;
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
    }

    public ResponseError(String message, String errorTypeName, String path, Instant timestamp) {
        this.message = message;
        this.errorTypeName = errorTypeName;
        this.path = path;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorTypeName() {
        return errorTypeName;
    }

    public void setErrorTypeName(String errorTypeName) {
        this.errorTypeName = errorTypeName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ResponseError{" +
                "message='" + message + '\'' +
                ", errorTypeName='" + errorTypeName + '\'' +
                ", path='" + path + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
