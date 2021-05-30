package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VechileType {
    @Id
    private int typeId;
    private int minimumTrainingTime;
    private String typeName;
    private String priorRequirement;

    public VechileType() {
    }

    public VechileType(int typeId, int minimumTrainingTime, String typeName, String priorRequirement) {
        this.typeId = typeId;
        this.minimumTrainingTime = minimumTrainingTime;
        this.typeName = typeName;
        this.priorRequirement = priorRequirement;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getMinimumTrainingTime() {
        return minimumTrainingTime;
    }

    public void setMinimumTrainingTime(int minimumTrainingTime) {
        this.minimumTrainingTime = minimumTrainingTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPriorRequirement() {
        return priorRequirement;
    }

    public void setPriorRequirement(String priorRequirement) {
        this.priorRequirement = priorRequirement;
    }
}
