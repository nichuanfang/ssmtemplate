package com.shiro.dao;

import com.shiro.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: shiro_app
 * @create: 2019-03-22 18:27
 * @version:
 **/
public interface UserMapper {
    void insert(User user);
}
