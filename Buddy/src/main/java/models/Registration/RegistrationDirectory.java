/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Registration;

import java.util.ArrayList;

/**
 *
 * @author thomas
 */
public class RegistrationDirectory {
    private ArrayList<Registration> registrationList;
    private Registration registration;
    
    //Getters and Setters

    public ArrayList<Registration> getRegistrationList() {
        return registrationList;
    }

    public void setRegistrationList(ArrayList<Registration> registrationList) {
        this.registrationList = registrationList;
    }
    

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
    
    public Registration AddRegistration( Registration registration , String name, String role, String username, String password, String email, String phone, String carrier,  String location, String imagePath, String status ){
        registration = new Registration(name, role, username, password, email, phone, carrier, location, imagePath, status);
        registrationList.add(registration);
        
        return registration;
    }
    
    //Contructors
    public RegistrationDirectory(){
        this.registrationList = new ArrayList<Registration>();
    }
    
}
