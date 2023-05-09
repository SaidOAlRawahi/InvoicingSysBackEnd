package com.example.MarketManagementSystem.Repositories;

import com.example.MarketManagementSystem.Models.Invoice;
import com.example.MarketManagementSystem.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market,Integer>  {
}
