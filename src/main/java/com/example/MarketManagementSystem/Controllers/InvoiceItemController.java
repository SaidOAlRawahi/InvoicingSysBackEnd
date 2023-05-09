package com.example.MarketManagementSystem.Controllers;

import com.example.MarketManagementSystem.Models.Customer;
import com.example.MarketManagementSystem.Models.InvoiceItem;
import com.example.MarketManagementSystem.Repositories.InvoiceItemRepository;
import com.example.MarketManagementSystem.Services.InvoiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "invoiceItems")
public class InvoiceItemController {
    @Autowired
    InvoiceItemService invoiceItemService;

    @RequestMapping(value = "getAll")
    public List<InvoiceItem> getAll(){
        return invoiceItemService.getAll();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public InvoiceItem getById(@RequestParam Integer id){
        return invoiceItemService.getById(id);
    }

}
