package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

    @Id
    private int branchid;
    private String branchName;

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
