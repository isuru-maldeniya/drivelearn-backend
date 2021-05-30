package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Branch {

    @Id
    private int branchid;
    private String branchName;

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference
    List<Employee> employeeList=new ArrayList<>();

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference
    List<Vehicle> vehicleList=new ArrayList<>();

    @OneToMany(mappedBy = "branch")
    @JsonManagedReference
    List<Student> studentList=new ArrayList<>();
    public Branch(int branchid, String branchName) {
        this.branchid = branchid;
        this.branchName = branchName;
    }

    public Branch() {
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
