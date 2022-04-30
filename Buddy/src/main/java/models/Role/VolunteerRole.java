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
public class VolunteerRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, Person account, System business) {
        return new VolunteerAreaJPanel(userProcessContainer, account, business);
    }
}
