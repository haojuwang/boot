package com.leyue.boot.web.controller;


import com.leyue.boot.web.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@RestController
@RequestMapping("index")
public class IndexController {


    @Value("${leyue.secret}")
    private String secred;

    @Value("${leyue.uuid}")
    private String uuid;

    @RequestMapping
    public String get() {
        return "hello world";
    }


    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("get")
    public Map<String,Object> get(@RequestParam String name,int id) {
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("value","leyue100");
        map.put("id",id+"");
        map.put("secred",secred);
        map.put("uuid",uuid);
        map.put("date",new Date());


        logger.info("---------info----------");
        logger.error("---------error----------");
        logger.trace("---------trace----------");
        logger.debug("---------debug----------");
        return map;

    }




    @RequestMapping("find/{id}/{name}")
    public List<User> getUser(@PathVariable int id,@PathVariable String name) {

     List<User>  list = new ArrayList<>();
        User user = new User();
        user.setId(id);
        user.setUsername(name);

        user.setAddress("北京");

        User user2 = new User();
        user2.setId(id);
        user2.setUsername(name);

        user2.setAddress("砀山");

        list.add(user);
        list.add(user2);


     return list;
    }
}
