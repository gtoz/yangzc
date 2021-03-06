package com.cskfz.student.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: yangzc
 * @Description: 资源映射路径
 * @Date: Created on 12:54 2019/11/19
 * @Modified By:
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:/upload/");
        registry.addResourceHandler("swagger-ui.html").
                addResourceLocations("classpath:/META-INF/resources/");//swagger的html文件
        registry.addResourceHandler("/webjars/**").
                addResourceLocations("classpath:/META-INF/resources/webjars/");//swagger的js和css文件
    }
}

