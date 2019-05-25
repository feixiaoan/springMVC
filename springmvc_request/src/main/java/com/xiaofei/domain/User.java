package com.xiaofei.domain;

import java.io.Serializable;

/**
 * <Description>用户类 <br>
 * @author 小飞<br>
 * @version 1.0<br>
 * @createDate 2019/05/24<br>
 * @see com.xiaofei.domain <br>
 */
public class User implements Serializable {
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户年龄
     */
    private Integer age;

    public User() {
    }

    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
