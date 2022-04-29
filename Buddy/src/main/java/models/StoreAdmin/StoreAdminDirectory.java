/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.StoreAdmin;

import models.Contribution.Contribution;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author naina
 */
public class StoreAdminDirectory {
    private ArrayList<StoreAdmin> storeAdminDirectory = new ArrayList();
    private StoreAdmin storeAdmin;
    private Contribution contribution;

    public ArrayList<StoreAdmin> getStoreAdminDirectory() {
        return this.storeAdminDirectory;
    }

    public void setStoreAdminDirectory(ArrayList<StoreAdmin> storeAdminDirectory) {
        this.storeAdminDirectory = storeAdminDirectory;
    }

    public StoreAdmin getStoreAdmin() {
        return this.storeAdmin;
    }

    public void setStoreAdmin(StoreAdmin storeAdmin) {
        this.storeAdmin = storeAdmin;
    }

    public Contribution AddContribution(StoreAdmin storeAdmin, String storeName, String item, String qty, String date, String status) {
        this.contribution = new Contribution(storeName, item, qty, date, status);
        storeAdmin.addContribution(this.contribution);
        JOptionPane.showMessageDialog((Component)null, "inside store admin direcotry");
        return this.contribution;
    }

    public StoreAdminDirectory() {
    }

    public StoreAdmin createStoreAdmin(String uName) {
        this.storeAdmin = new StoreAdmin(uName);
        this.storeAdminDirectory.add(this.storeAdmin);
        return this.storeAdmin;
    }

    public void deleteVolunteer(String username) {
        for(int i = 0; i < this.storeAdminDirectory.size(); ++i) {
            if (((StoreAdmin)this.storeAdminDirectory.get(i)).getUserName().equals(username)) {
                this.storeAdminDirectory.remove(i);
            }
        }

    }
}

