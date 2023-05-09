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
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;


    String name;
    String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<Invoice> invoices;
}
