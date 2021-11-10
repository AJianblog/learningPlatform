package com.hzj.learningplatform.system.controller;

import com.hzj.learningplatform.common.entity.ResponseCode;
import com.hzj.learningplatform.common.entity.ResponseResult;
import com.hzj.learningplatform.system.entity.User;
import com.hzj.learningplatform.system.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hezhijian
 */
@Api(value = "用户管理", tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ResponseResult<Void> register(@RequestBody User user) {
        userService.register(user);
        return new ResponseResult<>(ResponseCode.SUCCESS_OK, null);
    }

    @ApiOperation(value = "通过ID查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", dataTypeClass = String.class, dataType = "String", required = true)
    @GetMapping("/findById/{id}")
    public ResponseResult<User> findById(@PathVariable("id") String id) {
        User user = userService.findById(id);
        return new ResponseResult<>(ResponseCode.SUCCESS_OK, user);
    }

    /**
     * 查找是否存在相同的用户名
     * @param account 用户名
     * @return true: 存在, false: 不存在
     */
    @ApiOperation(value = "查找是否存在相同的用户名")
    @ApiImplicitParam(name = "account", value = "用户名", dataType = "String", dataTypeClass = String.class)
    @GetMapping("/exitSameAccount")
    public ResponseResult<Boolean> exitSameAccount(@RequestParam("account") String account) {
        Boolean result = userService.exitSameAccount(account);
        return new ResponseResult<>(ResponseCode.SUCCESS_OK, result);
    }
}

