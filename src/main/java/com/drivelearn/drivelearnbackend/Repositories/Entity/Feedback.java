package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Feedback{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int feedbackid;
    private Date date;
    private String start;
    private String end;
    private String reverse;
    private String searingBalance;
    private String cluchBalance;
    private String gear;

    public Feedback(int feedbackid, Date date, String start, String end, String reverse, String searingBalance, String cluchBalance, String gear) {
        this.feedbackid = feedbackid;
        this.date = date;
        this.start = start;
        this.end = end;
        this.reverse = reverse;
        this.searingBalance = searingBalance;
        this.cluchBalance = cluchBalance;
        this.gear = gear;
    }

    public Feedback() {
    }

    public int getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(int feedbackid) {
        this.feedbackid = feedbackid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    public String getSearingBalance() {
        return searingBalance;
    }

    public void setSearingBalance(String searingBalance) {
        this.searingBalance = searingBalance;
    }

    public String getCluchBalance() {
        return cluchBalance;
    }

    public void setCluchBalance(String cluchBalance) {
        this.cluchBalance = cluchBalance;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
}
