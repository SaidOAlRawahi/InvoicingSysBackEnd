package com.example.MarketManagementSystem.Controllers;

import com.example.MarketManagementSystem.Models.Customer;
import com.example.MarketManagementSystem.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "getAll")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Customer getById(@RequestParam Integer id){
        return customerService.getById(id);
    }

}
