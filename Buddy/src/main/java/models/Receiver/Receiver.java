/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Receiver;

import models.TaskQueue.TaskQueue;

/**
 *
 * @author thomas
 */
public class Receiver {
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


    public TaskQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(TaskQueue workqueue) {
        this.workqueue = workqueue;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Constructor
    public Receiver(String name, String role, String userName, String password, String email, String phone, String carrier, String location, String imgPath) {
        this.UserName = userName;
        this.Name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.carrier = carrier;
        this.location = location;
        this.photo = imgPath;
    }

}
