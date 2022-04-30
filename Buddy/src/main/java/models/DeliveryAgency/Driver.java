/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;
import java.util.Date;
import models.TaskQueue.TaskQueue;
/**
 *
 * @author naina
 */
public class Driver extends User {
    public long ssn;
    public int DriverID;
    public String DriverLicenseNumber;
    String UserName;
    String password;
    String photo;
    Date JoiningDate;
    Date SeperationDate;
    TaskQueue TaskQueue;
    String Status;

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Driver() {
    }

    public long getSsn() {
        return this.ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getDriverID() {
        return this.DriverID;
    }

    public void setDriverID(int DriverID) {
        this.DriverID = DriverID;
    }

    public String getDriverLicenseNumber() {
        return this.DriverLicenseNumber;
    }

    public void setDriverLicenseNumber(String DriverLicenseNumber) {
        this.DriverLicenseNumber = DriverLicenseNumber;
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

    public TaskQueue getWorkQueue() {
        if (this.TaskQueue == null) {
            this.TaskQueue = new TaskQueue();
        }

        return this.TaskQueue;
    }

    public void setWorkQueue(TaskQueue workQueue) {
        this.TaskQueue = workQueue;
    }

    public String toString() {
        return this.UserName;
    }
}
