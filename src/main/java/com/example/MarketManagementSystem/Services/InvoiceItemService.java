package com.example.MarketManagementSystem.Services;

import com.example.MarketManagementSystem.Models.InvoiceItem;
import com.example.MarketManagementSystem.Repositories.InvoiceItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceItemService {
    @Autowired
    InvoiceItemRepository invoiceItemRepository;

    public List<InvoiceItem> getAll(){
        return invoiceItemRepository.findAll();
    }
    public InvoiceItem getById(Integer id){
        return invoiceItemRepository.findById(id).get();
    }
}
