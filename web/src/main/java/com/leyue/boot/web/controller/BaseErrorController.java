package com.leyue.boot.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("error_1")
public class BaseErrorController implements ErrorController {

    private static final Logger logger = LoggerFactory.getLogger(BaseErrorController.class);

    @Override
    public String getErrorPath() {
        logger.error("错误信息：");
        return "comm/error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }

}
