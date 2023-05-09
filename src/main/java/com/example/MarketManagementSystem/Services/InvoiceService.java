package com.example.MarketManagementSystem.Services;

import com.example.MarketManagementSystem.Models.Invoice;
import com.example.MarketManagementSystem.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAll(){
        return invoiceRepository.findAll();
    }

    public Invoice getById(Integer id){
        return invoiceRepository.findById(id).get();
    }

}
