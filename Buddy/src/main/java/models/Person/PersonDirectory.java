/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Person;

/**
 *
 * @author thomas
 */

import models.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

public class PersonDirectory {
    private ArrayList<Person> userAccountList;

    public PersonDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<Person> getUserAccountList() {
        return userAccountList;
    }

    //Check if user is authentic
    public Person authenticateUser(String username, String password) {
        for (Person ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    //Create a new user account
    public Person createUserAccount(String name, String username, String password, Employee employee, Role role) {
        Person userAccount = new Person();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    //Delet an useraccount
    public void deleteUserAccount(Person user) {
        userAccountList.remove(user);
    }

    //Update an useraccount
    public void updateUserAccount(Person user, String name, String username, String password) {

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
    }

    //Check if username is unique
    public boolean checkIfUsernameIsUnique(String username) {
        for (Person ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    
    public Person searchUser(String username)
    {
        Person uaccnt=null;
        for (Person ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                uaccnt=ua;
            }
        }
        return uaccnt;
    }
    
}