/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;

import models.WorkQueue.WorkQueue;
import java.util.Date;
/**
 *
 * @author naina
 */
public class Clerk extends Person {
    public long ssn;
    public int ClerkID;
    public String InspectionLicenseNumber;
    String UserName;
    String password;
    String photo;
    Date JoiningDate;
    Date SeperationDate;
    WorkQueue workQueue;
    String Status = "Available";

    public Clerk() {
    }

    public long getSsn() {
        return this.ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getClerkID() {
        return this.ClerkID;
    }

    public void setClerkID(int ClerkID) {
        this.ClerkID = ClerkID;
    }

    public String getInspectionLicenseNumber() {
        return this.InspectionLicenseNumber;
    }

    public void setDriverLicenseNumber(String InspectionLicenseNumber) {
        this.InspectionLicenseNumber = InspectionLicenseNumber;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getJoiningDate() {
        return this.JoiningDate;
    }

    public void setJoiningDate(Date JoiningDate) {
        this.JoiningDate = JoiningDate;
    }

    public Date getSeperationDate() {
        return this.SeperationDate;
    }

    public void setSeperationDate(Date SeperationDate) {
        this.SeperationDate = SeperationDate;
    }

    public WorkQueue getWorkQueue() {
        if (this.workQueue == null) {
            this.workQueue = new WorkQueue();
        }

        return this.workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String toString() {
        return this.UserName;
    }
}
