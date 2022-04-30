/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import models.Employee.Employee;
import models.Person.Person;
import models.Role.SystemAdminRole;

/**
 *
 * @author thomas
 */
public class SystemConfig {
    public static AppSystem configure(){
        
        AppSystem system = AppSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        Person ua = system.getUserAccountDirectory().createUserAccount("Admin","sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
