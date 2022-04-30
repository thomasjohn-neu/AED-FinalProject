/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;

import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class EmployeeDirectory {
    ArrayList<User> employeeList = new ArrayList();

    public EmployeeDirectory() {
    }

    public ArrayList<User> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(ArrayList<User> employeeList) {
        this.employeeList = employeeList;
    }

    public void addPersontoEmployeeList(User person) {
        this.employeeList.add(person);
    }

    public void removePersonfromEmployeeList(User person) {
        this.employeeList.remove(person);
    }

    public User createPerson(String uname) {
        User person = new User();
        person.setFirstName(uname);
        return person;
    }

    public void deletePerson(String username) {
        for(int i = 0; i < this.employeeList.size(); ++i) {
            if (((User)this.employeeList.get(i)).getUserName().equals(username)) {
                this.employeeList.remove(i);
            }
        }

    }
}

