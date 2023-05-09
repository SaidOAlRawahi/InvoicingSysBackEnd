package com.example.MarketManagementSystem.Controllers;

import com.example.MarketManagementSystem.Models.Item;
import com.example.MarketManagementSystem.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping(value = "getAll")
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Item getById(@RequestParam Integer id){
        return itemService.getById(id);
    }
}
