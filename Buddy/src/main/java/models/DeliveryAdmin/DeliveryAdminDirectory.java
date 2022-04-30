/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAdmin;
import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class DeliveryAdminDirectory {
    private ArrayList<DeliveryAdmin> deliveryAdminDirectory = new ArrayList();
    private DeliveryAdmin deliveryAdmin;

    public ArrayList<DeliveryAdmin> getDeliverAdmin() {
        return this.deliveryAdminDirectory;
    }

    public void setDeliverAdmin(ArrayList<DeliveryAdmin> deliveryAdminDirectory) {
        this.deliveryAdminDirectory = deliveryAdminDirectory;
    }

    public DeliveryAdmin getDeliveryAdmin() {
        return this.deliveryAdmin;
    }

    public void setDeliveryAdmin(DeliveryAdmin deliveryAdmin) {
        this.deliveryAdmin = deliveryAdmin;
    }

    public DeliveryAdminDirectory() {
    }

    public DeliveryAdmin createDeliveryAdmin(String name, String role, String userName, String password) {
        this.deliveryAdmin = new DeliveryAdmin(name, role, userName, password);
        this.deliveryAdminDirectory.add(this.deliveryAdmin);
        return this.deliveryAdmin;
    }

    public void deleteDeliveryAdmin(String username) {
        for(int i = 0; i < this.deliveryAdminDirectory.size(); ++i) {
            if (((DeliveryAdmin)this.deliveryAdminDirectory.get(i)).getUserName().equals(username)) {
                this.deliveryAdminDirectory.remove(i);
            }
        }

    }
}
