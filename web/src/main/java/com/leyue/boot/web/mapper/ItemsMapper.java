package com.leyue.boot.web.mapper;


import com.leyue.boot.web.pojo.Items;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemsMapper {

    @Select(value = "select * from items where id=#{id,jdbcType=INTEGER}")
    @Result(javaType = Items.class)
    Items selectByPrimaryKey(int id);
}
