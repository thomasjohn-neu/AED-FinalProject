/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Store;

import models.Contribution.Contribution;
import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class StoreDirectory {
    private ArrayList<Store> storeDirectory = new ArrayList();
    private Store store;
    private Contribution contribution;

    public ArrayList<Store> getStoreDirectory() {
        return this.storeDirectory;
    }

    public void setStoreAdminDirectory(ArrayList<Store> storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Contribution AddContribution(Store store, String storeName, String item, String qty, String date, String status) {
        this.contribution = new Contribution(storeName, item, qty, date, status);
        store.addContribution(this.contribution);
        return this.contribution;
    }

    public StoreDirectory() {
    }

    public Store createStore(String storeName, String uname, String password, String location) {
        this.store = new Store(storeName, uname, password, location);
        this.storeDirectory.add(this.store);
        return this.store;
    }

    public void deleteVolunteer(String username) {
        for(int i = 0; i < this.storeDirectory.size(); ++i) {
            if (((Store)this.storeDirectory.get(i)).getUserName().equals(username)) {
                this.storeDirectory.remove(i);
            }
        }

    }
}

