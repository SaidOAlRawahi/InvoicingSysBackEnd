package com.example.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Data
@Entity
public class Invoice extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    @Column(name = "invoice_pub_date")
    String date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @Column(name = "invoice_paid_amount")
    Float paidAmount;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    List<InvoiceItem> invoiceItems;

    @ManyToOne
    @JoinColumn(name = "market_id")
    Market market;
}
