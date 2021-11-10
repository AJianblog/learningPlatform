package com.hzj.learningplatform.common.exceptionhandle.exception;

/**
 * 基础的异常处理类
 * @author hezhijian
 */
public class BaseException extends RuntimeException{

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }
}
