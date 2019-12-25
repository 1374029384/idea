package com.blb.config;

import com.blb.interceptor.Loginlnterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class McvConfig implements WebMvcConfigurer {

    public Loginlnterceptor getLoginlnterceptor(){
       //产生对象
        return  new Loginlnterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(getLoginlnterceptor()).addPathPatterns("/*");
    }
}
