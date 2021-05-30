package com.drivelearn.drivelearnbackend.Repositories.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cource {
    @Id
    private int courseId;
    private Date examDate1;
    private Date examDate2;
    private Date examDate3;
    private Date trailDate;
    private Date startDate;
    private int barcodeNumber;
    private int status;

    public Cource() {
    }

    public Cource(int courseId, Date examDate1, Date examDate2, Date examDate3, Date trailDate, Date startDate, int barcodeNumber, int status) {
        this.courseId = courseId;
        this.examDate1 = examDate1;
        this.examDate2 = examDate2;
        this.examDate3 = examDate3;
        this.trailDate = trailDate;
        this.startDate = startDate;
        this.barcodeNumber = barcodeNumber;
        this.status = status;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getExamDate1() {
        return examDate1;
    }

    public void setExamDate1(Date examDate1) {
        this.examDate1 = examDate1;
    }

    public Date getExamDate2() {
        return examDate2;
    }

    public void setExamDate2(Date examDate2) {
        this.examDate2 = examDate2;
    }

    public Date getExamDate3() {
        return examDate3;
    }

    public void setExamDate3(Date examDate3) {
        this.examDate3 = examDate3;
    }

    public Date getTrailDate() {
        return trailDate;
    }

    public void setTrailDate(Date trailDate) {
        this.trailDate = trailDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getBarcodeNumber() {
        return barcodeNumber;
    }

    public void setBarcodeNumber(int barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
