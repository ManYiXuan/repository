package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format implements Converter<String,Date> {
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("请输入日期");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date parse=null;
        try {
             parse = df.parse(source);
             return parse;
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换错误");
        }

    }
}
