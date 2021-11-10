package com.hzj.learningplatform.system.service.impl;

import com.hzj.learningplatform.common.utils.SnowFlakeIdWorker;
import com.hzj.learningplatform.system.entity.User;
import com.hzj.learningplatform.system.exceptionhandle.exception.UserException;
import com.hzj.learningplatform.system.mapper.UserMapper;
import com.hzj.learningplatform.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hezhijian
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    /**
     * 查找是否存在相同的用户名
     * @param account 用户名
     * @return true: 存在, false: 不存在
     */
    @Override
    public Boolean exitSameAccount(String account) {
        User user = userMapper.findByAccount(account);
        return user != null;
    }

    @Override
    public void register(User user) {
        if (userMapper.findByAccount(user.getAccount()) != null) {
            throw new UserException("用户名已存在");
        }
        if (userMapper.findByEmail(user.getEmail()) != null) {
            throw new UserException("邮箱已被注册");
        }
        user.setId(String.valueOf(SnowFlakeIdWorker.getInstance().nextId()));
        user.setEmailStatus(false);
        user.setFreezeStatus(false);
        userMapper.addUser(user);
    }
}
