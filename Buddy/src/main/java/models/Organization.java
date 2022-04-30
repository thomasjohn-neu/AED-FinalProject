/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import models.Employee.EmployeeDirectory;
import models.Person.PersonDirectory;
import models.Role.Role;
import models.TaskQueue.TaskQueue;

/**
 *
 * @author thomas
 */
public abstract class Organization {
    private String name;
    private TaskQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private PersonDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        //Project
        Volunteer("Volunteer"),
        Contributor("Contributor"),
        Distributor("Distributor"),
        StoreAdmin("StoreAdmin"),
        StoreManager("StoreManager"),
        DeliveryAdmin("DeliveryAdmin"),
        DeliveryAgent("DeliveryAgent"),
        Receiver("Receiver");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.name = name;
        workQueue = new TaskQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new PersonDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public PersonDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public TaskQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(TaskQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
