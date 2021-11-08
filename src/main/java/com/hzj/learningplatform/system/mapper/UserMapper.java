package com.hzj.learningplatform.system.mapper;

import com.hzj.learningplatform.system.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author hezhijian
 */
@Component
public interface UserMapper {
    @Select("select id, account, email FROM user WHERE id = #{id}")
    User findById(@Param("id") String id);

    @Select("select id, account, email FROM user WHERE account = #{account}")
    User findByAccount(@Param("account") String account);
}
