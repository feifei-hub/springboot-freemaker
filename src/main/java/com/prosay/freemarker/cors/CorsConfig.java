package com.prosay.freemarker.cors;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.addAllowedMethod("*");//允许所有请求方法访问该跨域资源服务器，如：POST、GET、PUT、DELETE等。
        corsConfig.addAllowedOrigin("*");//允许所有请求域名访问我们的跨域资源，可以单条或多条，如："http://www.baidu.com"，只有百度可以访问我们的跨域资源。
        corsConfig.addAllowedHeader("*");//允许所有请求header访问，可以自定义设置任意请求头信息，如："X-YAUTH-TOKEN"
        return corsConfig;
    }
   //@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }
}
