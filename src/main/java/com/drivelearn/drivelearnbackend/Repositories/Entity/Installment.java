package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Installment {
    @Id
    private int installmentId;
    private double amount;
    private Date date;

    @ManyToOne
    @JsonBackReference
    private Employee employee;

    public Installment() {
    }

    public Installment(int installmentId, double amount, Date date) {
        this.installmentId = installmentId;
        this.amount = amount;
        this.date = date;
    }


    public int getInstallmentId() {
        return installmentId;
    }

    public void setInstallmentId(int installmentId) {
        this.installmentId = installmentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
