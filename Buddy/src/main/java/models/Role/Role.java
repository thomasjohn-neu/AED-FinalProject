/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Role;

import javax.swing.JPanel;
import models.Person.Person;

/**
 *
 * @author thomas
 */
public abstract class Role {
    public enum RoleType{
        DeliveryAgencyAdmin("DeliveryAgencyAdmin"),
        FleetManager("FleetManager"),
        Driver("Driver"),
        InspectionManager("InspectionManager"),
        Clerk("Clerk"),
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
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value; 
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, Person account, System business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }   
}
