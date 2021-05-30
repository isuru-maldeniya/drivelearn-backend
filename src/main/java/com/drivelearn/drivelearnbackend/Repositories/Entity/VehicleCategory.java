package com.drivelearn.drivelearnbackend.Repositories.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class VehicleCategory {
    @Id
    private int categoryId;
    private String CategoryName;
    private String priorRequirement;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private List<VechileType> vechileTypes=new ArrayList<>();


    public VehicleCategory() {
    }

    public VehicleCategory(int categoryId, String categoryName, String priorRequirement) {
        this.categoryId = categoryId;
        CategoryName = categoryName;
        this.priorRequirement = priorRequirement;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getPriorRequirement() {
        return priorRequirement;
    }

    public void setPriorRequirement(String priorRequirement) {
        this.priorRequirement = priorRequirement;
    }
}
