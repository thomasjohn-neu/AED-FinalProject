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
public class VehicleDirectory {
    ArrayList<Vehicle> vehicleList = new ArrayList();
    int count = 0;

    public VehicleDirectory() {
        ++this.count;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return this.vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicletoList(Vehicle vehicle) {
        vehicle.setVehicleID(this.count);
        this.vehicleList.add(vehicle);
        ++this.count;
    }

    public void removeVehiclefromList(Vehicle vehicle) {
        this.vehicleList.remove(vehicle);
    }
}