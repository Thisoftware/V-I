package com.xxx.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wyl on 2017-08-17.
 */
@Configuration
public class MyWebAppConfigure extends WebMvcConfigurerAdapter{

    /**
     * 配置静态资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("file:D:/images/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/login","/getLogin","/register","/findback");
        //registry.addInterceptor(new MyInterceptor02()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
