package com.xiaofei.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户身份
 * @author 小飞
 */
public class User implements Serializable {
    private String uname;
    private Integer age;
    private Date date;
    public User() {}

    public User(String uname, Integer age, Date date) {
        this.uname = uname;
        this.age = age;
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
