package com.test.inovasi_daya_solusi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions", schema = "public")
public class Transactions {

    @Id
    private Integer id;
    @Column(name = "product_id")
    private String productID;
    @Column(name = "product_name")
    private String productName;
    private String amount;
    @Column(name = "customer_name")
    private String customerName;
    private Integer status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;
    @Column(name = "create_by")
    private String createBy;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_on")
    private LocalDateTime createOn;

    public Integer getId() {
        return id;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getStatus() {
        return status;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public LocalDateTime getCreateOn() {
        return createOn;
    }

}
