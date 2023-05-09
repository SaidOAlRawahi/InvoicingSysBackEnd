package com.example.MarketManagementSystem.Controllers;

import com.example.MarketManagementSystem.Models.Market;
import com.example.MarketManagementSystem.Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "markets")
public class MarketController {
    @Autowired
    MarketService marketService;

    @RequestMapping(value = "getAll")
    public List<Market> getAll(){
        return marketService.getAll();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Market getById(@RequestParam Integer id){
        return marketService.getById(id);
    }
}
