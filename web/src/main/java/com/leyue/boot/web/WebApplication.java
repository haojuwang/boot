package com.leyue.boot.web;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ServletComponentScan
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.leyue.boot.web")
@MapperScan(basePackages = "com.leyue.boot.web.mapper",annotationClass = Mapper.class)
public class WebApplication {



}
