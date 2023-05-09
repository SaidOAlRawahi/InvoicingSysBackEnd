package com.example.MarketManagementSystem.Repositories;

import com.example.MarketManagementSystem.Models.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem,Integer> {
}
