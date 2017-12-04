package com.leyue.boot.web.controller;

import com.leyue.boot.web.dao.ItemsDao;
import com.leyue.boot.web.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;

/**
 * Created by lihao on 17/12/4.
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemsDaoTest {

    @Autowired
    private ItemsDao itemsDao;


    @Test
    public void insert() {

        Items entity = new Items();
        entity.setName("mac");
        entity.setPrice(3000);
        entity.setPic("http://xxx.png");
        entity.setDetail("mac 新款");
        entity.setCreatetime(new Date(System.currentTimeMillis()));

        itemsDao.save(entity);
    }

    @Test
    public void update() {
        Items entity = new Items();
        entity.setId(4);
        entity.setName("联想B460");
        entity.setCreatetime(new Date(System.currentTimeMillis()));
        itemsDao.save(entity);

        System.out.println(entity);

    }


    @Test
    public void delete() {
        itemsDao.delete(4);
    }


    @Test
    public void select() {
        Items entity = itemsDao.findOne(1);
        System.out.println(entity);
    }

    @Test
    public void select1() {
        List<Items> entity = itemsDao.findByName("背包");
        System.out.println(entity);
    }


    @Test
    //分页
    public void queryForPage() {
        Pageable pageable = new PageRequest(0,2,new Sort(new Sort.Order(Sort.Direction.DESC,"id")));
        List<Items> reult = itemsDao.findByName("笔记本", pageable);
        System.out.println(reult);
    }
}
