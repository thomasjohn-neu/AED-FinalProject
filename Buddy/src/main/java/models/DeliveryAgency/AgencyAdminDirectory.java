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
public class AgencyAdminDirectory {
    ArrayList<AgencyAdmin> deliveryagencyAdminList = new ArrayList();

    public AgencyAdminDirectory() {
    }

    public ArrayList<AgencyAdmin> getDeliveryagencyAdminList() {
        if (this.deliveryagencyAdminList == null) {
            this.deliveryagencyAdminList = new ArrayList();
        }

        return this.deliveryagencyAdminList;
    }

    public void setDeliveryagencyAdminList(ArrayList<AgencyAdmin> deliveryagencyAdminList) {
        this.deliveryagencyAdminList = deliveryagencyAdminList;
    }

    public void addAgencyAdmintoList(AgencyAdmin admin) {
        this.deliveryagencyAdminList.add(admin);
    }

    public void removeAgencyAdminfromList(AgencyAdmin admin) {
        this.deliveryagencyAdminList.remove(admin);
    }
}
