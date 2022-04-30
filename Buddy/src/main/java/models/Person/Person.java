/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Person;

import models.DeliveryAgency.ClerkDirectory;
import models.DeliveryAgency.DriverDirectory;
import models.Employee.Employee;
import models.Role.Role;
import models.Store.StoreDirectory;
import models.TaskQueue.TaskQueue;

/**
 *
 * @author thomas
 */
public class Person {
    private String name;
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private TaskQueue workQueue;
    private DriverDirectory driverList;
    private ClerkDirectory clerkList;
    private StoreDirectory storeDirectory;
    private String email;
    private String carrier;
    private String phone;
    private String photo;
    private String location;
    
    public Person() {
        workQueue = new TaskQueue();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public TaskQueue getWorkQueue() {
        if(workQueue==null)
        {
            workQueue=new TaskQueue();
        }
        return workQueue;
    }
    
    
    public void setWorkQueue(TaskQueue workQueue) {
        this.workQueue = workQueue;
    }

    public DriverDirectory getDriverList() {
        if(driverList==null)
        {
            driverList=new DriverDirectory();
        }
        return driverList;
    }

    public void setDriverList(DriverDirectory driverList) {
        this.driverList = driverList;
    }


    public ClerkDirectory getClerkList() {
        if(clerkList==null)
        {
            clerkList=new ClerkDirectory();
        }
        return clerkList;
    }

    public void setClerkList(ClerkDirectory clerkList) {
        this.clerkList = clerkList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StoreDirectory getStoreDirectory() {
        if(storeDirectory==null)
        {
            storeDirectory=new StoreDirectory();
        }
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }
    
    
    @Override
    public String toString() {
        return username;
    }
    
}
