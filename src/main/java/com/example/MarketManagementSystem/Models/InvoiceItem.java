package com.example.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
public class InvoiceItem extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    Item item;

    Float quantity;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    Invoice invoice;
}
