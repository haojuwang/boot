package com.leyue.boot.web.mapper;

import com.leyue.boot.web.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(int id);
}
