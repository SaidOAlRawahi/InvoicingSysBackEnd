package com.example.MarketManagementSystem.Services;

import com.example.MarketManagementSystem.Models.Market;
import com.example.MarketManagementSystem.Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAll(){
        return marketRepository.findAll();
    }
    public Market getById(Integer id){
        return marketRepository.findById(id).get();
    }
}
