/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;

import models.Employee.EmployeeDirectory;
import models.Person.Person;
import models.TaskQueue.TaskQueue;
/**
 *
 * @author naina
 */
public class AgencyAdmin extends Person {
    String UserName;
    String password;
    EmployeeDirectory employeeList = new EmployeeDirectory();
    DriverDirectory driverList = new DriverDirectory();
    ClerkDirectory clerkList = new ClerkDirectory();
    TaskQueue workQueue = new TaskQueue();
    int workRequestCount = 0;

    public AgencyAdmin() {
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

    public EmployeeDirectory getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

    public DriverDirectory getDriverList() {
        return this.driverList;
    }

    public void setDriverList(DriverDirectory driverList) {
        this.driverList = driverList;
    }

    public ClerkDirectory getClerkList() {
        return this.clerkList;
    }

    public void setClerkList(ClerkDirectory clerkList) {
        this.clerkList = clerkList;
    }

    public TaskQueue getWorkQueue() {
        return this.workQueue;
    }

    public void setWorkQueue(TaskQueue workQueue) {
        this.workQueue = workQueue;
    }
}
