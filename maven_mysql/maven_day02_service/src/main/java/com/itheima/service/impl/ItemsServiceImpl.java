package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Item;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Item findById(Integer id) {
        return itemsDao.findById(id);
    }
}
