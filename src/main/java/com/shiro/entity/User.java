package com.shiro.entity;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: shiro_app
 * @create: 2019-03-22 18:31
 * @version:
 **/
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
}
