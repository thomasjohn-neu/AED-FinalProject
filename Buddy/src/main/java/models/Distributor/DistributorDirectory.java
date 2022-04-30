/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Distributor;
import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class DistributorDirectory {
    private ArrayList<Distributor> distributorDirectory = new ArrayList();
    private Distributor distributor;

    public ArrayList<Distributor> getDistributorDirectory() {
        return this.distributorDirectory;
    }

    public void setDistributorDirectory(ArrayList<Distributor> distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public Distributor getDistributor() {
        return this.distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public DistributorDirectory() {
    }

    public Distributor createDistributor(String uname) {
        this.distributor = new Distributor(uname);
        this.distributorDirectory.add(this.distributor);
        return this.distributor;
    }

    public void deleteDistributor(String username) {
        for(int i = 0; i < this.distributorDirectory.size(); ++i) {
            if (((Distributor)this.distributorDirectory.get(i)).getUserName().equals(username)) {
                this.distributorDirectory.remove(i);
            }
        }

    }
}
