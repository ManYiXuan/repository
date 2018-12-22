package com.itheima.web.controller;


import com.itheima.service.ItemsService;

import  com.itheima.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findById")
    public String findById(Model model){
        Item items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
