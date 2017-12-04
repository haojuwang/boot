package com.leyue.boot.web.service.impl;

import com.leyue.boot.web.mapper.UserMapper;
import com.leyue.boot.web.pojo.User;
import com.leyue.boot.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
   private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
//        return null;
    }
}
