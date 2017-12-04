package com.leyue.boot.web.controller;


import com.leyue.boot.web.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
@RequestMapping("web")
public class WebController {

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("title","index");
        return "index";
    }


    @RequestMapping("thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("title","thymeleaf");
        return "thymeleaf";
    }

    @RequestMapping("error")
    public String error() {
        throw new RuntimeException("测试错误");
    }

}
