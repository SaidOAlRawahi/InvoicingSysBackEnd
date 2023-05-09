package com.example.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@Data
@Entity
public class Market extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    @Column(name = "market_name")
    String name;

    @Column(name = "market_location")
    String location;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL)
    List<Invoice> invoices;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL)
    List<Item> items;
}
