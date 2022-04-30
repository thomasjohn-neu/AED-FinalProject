/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.StoreAdmin;

import models.Contribution.Contribution;
import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class StoreAdmin {
    int id = 301;
    private String Name;
    private String UserName;
    private String storeName;
    private ArrayList<Contribution> Contribution;

    public StoreAdmin(String userName) {
        this.UserName = userName;
        this.Contribution = new ArrayList();
    }

    public ArrayList<Contribution> getContribution() {
        return this.Contribution;
    }

    public void setContribution(ArrayList<Contribution> Contribution) {
        this.Contribution = Contribution;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void addContribution(Contribution contribution) {
        if (this.Contribution == null) {
            this.Contribution = new ArrayList();
            this.Contribution.add(contribution);
        } else {
            this.Contribution.add(contribution);
        }

    }
}

