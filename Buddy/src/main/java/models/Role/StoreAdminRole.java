/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Role;

/**
 *
 * @author thomas
 */
public class StoreAdminRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new StoreAdminAreaJPanel(userProcessContainer, account, business);
    }
}
