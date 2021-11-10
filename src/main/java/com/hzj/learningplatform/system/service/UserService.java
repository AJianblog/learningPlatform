package com.hzj.learningplatform.system.service;

import com.hzj.learningplatform.system.entity.User;

/**
 * @author hezhijian
 */
public interface UserService {
    User findById(String id);

    /**
     * 查找是否存在相同的用户名
     * @param account 用户名
     * @return true: 存在, false: 不存在
     */
    Boolean exitSameAccount(String account);

    void register(User user);
}
