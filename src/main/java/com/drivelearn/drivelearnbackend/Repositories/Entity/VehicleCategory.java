package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleCategory {
    @Id
    private int categoryId;
    private String CategoryName;
    private String priorRequirement;

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
