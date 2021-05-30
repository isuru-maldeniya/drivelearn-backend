package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int licenseId;
    private double amount;
    private Date payedDate;
    private Date expireDate;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "vehicleId",referencedColumnName = "vechicleId")
    private Vehicle vehicle;

}
