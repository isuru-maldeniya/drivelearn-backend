package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @Id
    private int stuId;
    private Date registereddate;
    private String idnum;
    private String address;
    private Date Dob;
    private String username;
    private String password;
    private String contact;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Feedback> feedbacks=new ArrayList<>();

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "brnch_id",referencedColumnName = "branchid")
    private Branch branch;

    public Student() {
    }

    public Student(int stuId, Date registereddate, String idnum, String address, Date dob, String username, String password, String contact) {
        this.stuId = stuId;
        this.registereddate = registereddate;
        this.idnum = idnum;
        this.address = address;
        Dob = dob;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Date getRegistereddate() {
        return registereddate;
    }

    public void setRegistereddate(Date registereddate) {
        this.registereddate = registereddate;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
