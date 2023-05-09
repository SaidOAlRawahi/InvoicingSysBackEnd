package com.example.MarketManagementSystem.Controllers;

import com.example.MarketManagementSystem.Models.Invoice;
import com.example.MarketManagementSystem.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "invoices")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(value = "getAll")
    public List<Invoice> getAll(){
        return invoiceService.getAll();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Invoice getByID(@RequestParam Integer id){
        return invoiceService.getById(id);
    }
}
