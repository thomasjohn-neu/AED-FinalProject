/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAdmin;
import models.Contribution.Contribution;
import models.Products.Product;
import models.Products.ProductList;
import models.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author naina
 */
public class DeliveryAdmin {
    private String Name;
    private String UserName;
    private String password;
    private String email;
    private String carrier;
    private String phone;
    private String photo;
    private String role;
    private String location;
    private String status;
    private String pickupTime;
    private String pickupLocation;
    private ArrayList<Contribution> contributionList;
    private ArrayList<WorkRequest> workRequestList;

    public DeliveryAdmin(String name, String role, String userName, String password) {
        this.UserName = userName;
        this.Name = name;
        this.password = password;
    }

    public void addWorkRequest(String storeName, String item, Date expDate, Date pickupTime, String pickupLocation) {
        WorkRequest workRequest = new WorkRequest();
        Product product = new Product();
        ProductList productList = new ProductList();
        product.setProductName(item);
        product.setExpiryDate(expDate.toString());
        productList.addProducttoList(product);
        workRequest.setPickUptime(pickupTime);
        workRequest.setPickUpLocation(pickupLocation);
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Contribution> getContributionList() {
        return this.contributionList;
    }

    public void setContributionList(ArrayList<Contribution> contributionList) {
        this.contributionList = contributionList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return this.workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public String getPickupTime() {
        return this.pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupLocation() {
        return this.pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void addContribution(String storeName, String item, String qty, String expDate, String status) {
        Contribution contribution = new Contribution(storeName, item, qty, expDate, status);
        contribution.setStoreName(storeName);
        contribution.setItem(item);
        contribution.setQuantity(qty);
        contribution.setExpiryDate(expDate);
        contribution.setStatus(status);
        this.contributionList.add(contribution);
    }
}
