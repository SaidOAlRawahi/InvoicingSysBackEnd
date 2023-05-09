package com.example.MarketManagementSystem.Services;

import com.example.MarketManagementSystem.Models.Customer;
import com.example.MarketManagementSystem.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepositories;

    public List<Customer> getAll(){
        return customerRepositories.findAll();
    }

    public Customer getById(Integer id){
        return customerRepositories.findById(id).get();
    }
}
