package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "ious")
public class IOU {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id; // Ensure Id is from the JPA package
    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;

    public IOU() {
        this(null,null,BigDecimal.ZERO, Instant.now());
    }

    public IOU(String borrower, String lender, BigDecimal amount, Instant dateTime) {
        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    public UUID getId(){
        return id;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getLender() {
        return lender;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    

}