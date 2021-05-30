package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vechicleId;
    private String regiNumner;
    private String ChacieNumber;
    private int currentLicenId;
    private int currentInsuranceId;
    private int startingMilage;
    private int status;
    private Date addedDate;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "branch_id",referencedColumnName = "branchid")
    private Branch branch;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "type_id",referencedColumnName = "typeId")
    private VechileType vechileType;

    public Vehicle() {
    }

    public Vehicle(int vechicleId, String regiNumner, String chacieNumber, int currentLicenId, int currentInsuranceId, int startingMilage, int status, Date addedDate) {
        this.vechicleId = vechicleId;
        this.regiNumner = regiNumner;
        ChacieNumber = chacieNumber;
        this.currentLicenId = currentLicenId;
        this.currentInsuranceId = currentInsuranceId;
        this.startingMilage = startingMilage;
        this.status = status;
        this.addedDate = addedDate;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public String getRegiNumner() {
        return regiNumner;
    }

    public void setRegiNumner(String regiNumner) {
        this.regiNumner = regiNumner;
    }

    public String getChacieNumber() {
        return ChacieNumber;
    }

    public void setChacieNumber(String chacieNumber) {
        ChacieNumber = chacieNumber;
    }

    public int getCurrentLicenId() {
        return currentLicenId;
    }

    public void setCurrentLicenId(int currentLicenId) {
        this.currentLicenId = currentLicenId;
    }

    public int getCurrentInsuranceId() {
        return currentInsuranceId;
    }

    public void setCurrentInsuranceId(int currentInsuranceId) {
        this.currentInsuranceId = currentInsuranceId;
    }

    public int getStartingMilage() {
        return startingMilage;
    }

    public void setStartingMilage(int startingMilage) {
        this.startingMilage = startingMilage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
