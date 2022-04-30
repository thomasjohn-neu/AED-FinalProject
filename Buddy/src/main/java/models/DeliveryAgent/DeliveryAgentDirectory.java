/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgent;
import java.util.ArrayList;
/**
 *
 * @author naina
 */
public class DeliveryAgentDirectory {
    private ArrayList<DeliveryAgent> deliveryAgentDirectory = new ArrayList();
    private DeliveryAgent deliveryAgent;

    public ArrayList<DeliveryAgent> getDeliveryAgentDirectory() {
        return this.deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(ArrayList<DeliveryAgent> deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public DeliveryAgent getDeliveryAgent() {
        return this.deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public DeliveryAgentDirectory() {
    }

    public DeliveryAgent createDeliveryAgent(String uName) {
        this.deliveryAgent = new DeliveryAgent(uName);
        this.deliveryAgentDirectory.add(this.deliveryAgent);
        return this.deliveryAgent;
    }

    public void deleteDeliveryAgent(String username) {
        for(int i = 0; i < this.deliveryAgentDirectory.size(); ++i) {
            if (((DeliveryAgent)this.deliveryAgentDirectory.get(i)).getUserName().equals(username)) {
                this.deliveryAgentDirectory.remove(i);
            }
        }

    }
}
