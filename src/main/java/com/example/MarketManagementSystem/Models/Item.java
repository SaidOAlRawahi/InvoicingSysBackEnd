package com.example.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;


    String name;
    Float price;

    @ManyToOne
    @JoinColumn(name = "Market_id")
    Market market;
}
