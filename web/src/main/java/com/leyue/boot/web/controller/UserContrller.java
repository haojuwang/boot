package com.leyue.boot.web.controller;


import com.leyue.boot.web.service.ItemsService;
import com.leyue.boot.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserContrller {


    @Autowired
    ItemsService itemsService;

    @Autowired
    UserService userService;



    @RequestMapping("detail")
    @ResponseBody
    public String detail(int id) {
        return itemsService.selectByPrimaryKey(id).toString();
    }


    @RequestMapping("get")
    @ResponseBody
    public String get(int id) {
        return userService.getUserById(id).toString();
    }
}
