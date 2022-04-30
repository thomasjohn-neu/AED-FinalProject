/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Contributor;

import java.util.ArrayList;
import models.Contribution.Contribution;

/**
 *
 * @author thomas
 */
public class Contributor {
    int id = 101;
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
    
    private ArrayList<Contribution> Contribution;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Contribution> getContribution() {
        return Contribution;
    }

    public void setContribution(ArrayList<Contribution> Contribution) {
        this.Contribution = Contribution;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contributor(String name, String role, String userName, String password, String email,String phone,String carrier,String location,String imgPath) {
        this.UserName = userName;
        this.Name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.carrier = carrier;
        this.location = location;
        this.photo = imgPath;
        
        Contribution = new ArrayList<>();
    }
    public void addContribution(Contribution contribution){
        if (Contribution == null ){
             this.Contribution=new ArrayList<>();
            this.Contribution.add(contribution);
            
        }else{
            Contribution.add(contribution);
        }
        
    }
}
