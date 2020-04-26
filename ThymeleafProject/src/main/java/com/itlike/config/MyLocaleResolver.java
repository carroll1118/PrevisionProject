package com.itlike.config;

import com.mysql.cj.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //接受语言的参数
        String lan = request.getParameter("lan");
        Locale locale = Locale.getDefault();
        if (!org.springframework.util.StringUtils.isEmpty(lan)){//zh_CN
            String[] split = lan.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }


    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
