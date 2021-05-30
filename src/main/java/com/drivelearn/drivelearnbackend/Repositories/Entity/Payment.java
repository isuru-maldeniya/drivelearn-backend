package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Payment {
    @Id
    private int paymentId;
    private double amount;
    private Date date;

    public Payment() {
    }

    public Payment(int paymentId, double amount, Date date) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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
