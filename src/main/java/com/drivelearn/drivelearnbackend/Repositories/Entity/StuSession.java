package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class StuSession {
    @Id
    private int stuSessionId;
    private Date date;
    private int status;

    public StuSession() {
    }

    public StuSession(int stuSessionId, Date date, int status) {
        this.stuSessionId = stuSessionId;
        this.date = date;
        this.status = status;
    }

    public int getStuSessionId() {
        return stuSessionId;
    }

    public void setStuSessionId(int stuSessionId) {
        this.stuSessionId = stuSessionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
