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

    public Branch() {
    }

    public Branch(int branchid, String branchName, List<Employee> employeeList, List<Vehicle> vehicleList, List<Student> studentList) {
        this.branchid = branchid;
        this.branchName = branchName;
        this.employeeList = employeeList;
        this.vehicleList = vehicleList;
        this.studentList = studentList;
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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
