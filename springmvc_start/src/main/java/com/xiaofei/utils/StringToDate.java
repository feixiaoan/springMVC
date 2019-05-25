package com.xiaofei.utils;

import java.text.DateFormat;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换成日期
 * @author 小飞
 */
public class StringToDate implements Converter<String , Date> {
    /**
     * String 传进来的日期字符串
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        //判断是否为空
        if (s == null) {
            throw new RuntimeException("请输入日期");
        }
        DateFormat dataFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            //把日期字符串转换日期
            return dataFormat.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("输入日期错误");
        }
    }
}

