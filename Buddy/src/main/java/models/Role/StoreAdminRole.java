/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Role;

import javax.swing.JPanel;
import models.AppSystem;
import models.Person.Person;
import ui.StoreAdminRole.StoreAdminAreaJPanel;

/**
 *
 * @author thomas
 */
public class StoreAdminRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, Person account, AppSystem business) {
        return new StoreAdminAreaJPanel(userProcessContainer, account, business);
    }
}
