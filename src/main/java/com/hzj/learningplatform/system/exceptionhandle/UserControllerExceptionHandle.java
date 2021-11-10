package com.hzj.learningplatform.system.exceptionhandle;

import com.hzj.learningplatform.common.entity.ResponseError;
import com.hzj.learningplatform.system.controller.UserController;
import com.hzj.learningplatform.system.exceptionhandle.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * UserController类异常处理
 *
 * @author hezhijian
 */
@RestControllerAdvice(assignableTypes = {UserController.class})
public class UserControllerExceptionHandle {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ResponseError> userException(UserException userException, HttpServletRequest httpServletRequest) {
        ResponseError responseError = new ResponseError(userException.getMessage(), userException.getClass().getName(), httpServletRequest.getRequestURI());
        userException.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseError);
    }

}
