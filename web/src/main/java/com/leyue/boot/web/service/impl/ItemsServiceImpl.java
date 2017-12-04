package com.leyue.boot.web.service.impl;

import com.leyue.boot.web.mapper.ItemsMapper;
import com.leyue.boot.web.pojo.Items;
import com.leyue.boot.web.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items selectByPrimaryKey(int id) {
        return itemsMapper.selectByPrimaryKey(id);
    }
}