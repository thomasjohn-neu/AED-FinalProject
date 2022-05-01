/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Role;

import javax.swing.JPanel;
import models.AppSystem;
import models.Person.Person;
import ui.StoreAdminRole.ManageStoreJPanel;

/**
 *
 * @author thomas
 */
public class StoreRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, Person account, AppSystem business) {
        return new ManageStoreJPanel(userProcessContainer, account, business);
    }  
}
