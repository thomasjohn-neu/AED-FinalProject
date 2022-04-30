/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;
import java.util.Date;
/**
 *
 * @author naina
 */
public class Vehicle {
    public int VehicleID;
    public String VehicleNumber;
    public String ModelNumber;
    public String VehicleName;
    public String Manufacturer;
    public String InsuranceNumber;
    public Date LastMaintenanceDate;

    public Vehicle() {
    }

    public int getVehicleID() {
        return this.VehicleID;
    }

    public void setVehicleID(int VehicleID) {
        this.VehicleID = VehicleID;
    }

    public String getVehicleNumber() {
        return this.VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public String getModelNumber() {
        return this.ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getVehicleName() {
        return this.VehicleName;
    }

    public void setVehicleName(String VehicleName) {
        this.VehicleName = VehicleName;
    }

    public String getManufacturer() {
        return this.Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getInsuranceNumber() {
        return this.InsuranceNumber;
    }

    public void setInsuranceNumber(String InsuranceNumber) {
        this.InsuranceNumber = InsuranceNumber;
    }

    public Date getLastMaintenanceDate() {
        return this.LastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date LastMaintenanceDate) {
        this.LastMaintenanceDate = LastMaintenanceDate;
    }
}
