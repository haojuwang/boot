package com.leyue.boot.web.controller;

import com.leyue.boot.web.pojo.User;
import com.leyue.boot.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihao on 17/12/4.
 */
@Controller
@RequestMapping("api")
public class ApiController {

    @Autowired
    UserService userService;

    Logger logger = LoggerFactory.getLogger(ApiController.class);


    @RequestMapping("detail")
    @ResponseBody
    public User detail(int id) {
        logger.error("--------detail------------"+id);
        return userService.getUserById(id);



    }

    @RequestMapping(value = "ajax")
    public String ajax() {
        logger.error("--------ajax------------");
        return "api/index";
    }
}
