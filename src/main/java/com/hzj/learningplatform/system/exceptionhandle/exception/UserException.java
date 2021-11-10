package com.hzj.learningplatform.system.exceptionhandle.exception;

/**
 * 用户触发的异常
 * @author hezhijian
 */
public class UserException extends RuntimeException {

    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}
