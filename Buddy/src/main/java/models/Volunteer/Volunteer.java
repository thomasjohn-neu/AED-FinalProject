/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Volunteer;

import models.TaskQueue.TaskQueue;

/**
 *
 * @author naina
 */
public class Volunteer {
    
    int id = 201;
    private TaskQueue workqueue;
    private String Name;
    private String UserName;
    private String password;
    private String email;
    private String carrier;
    private String phone;
    private String photo;
    private String role;
    private String location;
    private String status;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public Volunteer(String name, String role, String userName, String password, String email, String phone, String carrier, String location, String imgPath) {
        this.UserName = userName;
        this.Name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.carrier = carrier;
        this.location = location;
        this.photo = imgPath;
    }

    public TaskQueue getWorkqueue() {
        if (this.workqueue == null) {
            this.workqueue = new TaskQueue();
        }

        return this.workqueue;
    }
    
}
