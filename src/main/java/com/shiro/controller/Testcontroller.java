package com.shiro.controller;

import com.shiro.entity.Users;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: shiro_app
 * @create: 2019-03-25 01:36
 * @version:
 **/
@Controller
public class Testcontroller {
    @RequestMapping("/login")
    String test(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        token.setRememberMe(true);
        try {
            subject.login(token);
            Users user = new Users();
            user.setUsername(username);
            user.setPassword(password);
            user.setLocked(0);
            user.setSalt("salt");
            subject.getSession().setAttribute("user",user);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "refuse";
        }
        return "success";
    }
}
