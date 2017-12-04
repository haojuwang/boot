package com.leyue.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication()
@Configuration

public class HelloApplication {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world123！";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
//        SpringApplication application = new SpringApplication(HelloApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }
}
