package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private int userId;
    private int externalId;
    private int userType;

    public User() {
    }

    public User(int userId, int externalId, int userType) {
        this.userId = userId;
        this.externalId = externalId;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExternalId() {
        return externalId;
    }

    public void setExternalId(int externalId) {
        this.externalId = externalId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
