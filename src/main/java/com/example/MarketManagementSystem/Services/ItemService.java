package com.example.MarketManagementSystem.Services;

import com.example.MarketManagementSystem.Models.Item;
import com.example.MarketManagementSystem.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAll(){
        return itemRepository.findAll();
    }

    public Item getById(Integer id){
        return itemRepository.findById(id).get();
    }
}
