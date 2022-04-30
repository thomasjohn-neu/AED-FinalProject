/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import models.Contribution.Contribution;
import models.Customer.CustomerDirectory;
import models.DeliveryAdmin.DeliveryAdminDirectory;
import models.DeliveryAgency.ClerkDirectory;
import models.Role.Role;
import models.Role.SystemAdminRole;
import models.Store.StoreDirectory;
import models.StoreAdmin.StoreAdminDirectory;
import models.Volunteer.VolunteerDirectory;

/**
 *
 * @author thomas
 */
public class System extends Organization{
    private static System business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    //Project
    private VolunteerDirectory volunteerDirectory;
    private ContributorDirectory contributorDirectory;
    private StoreAdminDirectory storeAdminDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private DistributorDirectory distributorDirectory;
    private ReceiverDirectory receiverDirectory;
    private DriverDirectory driverDirectory;
    private ClerkDirectory clerkDirectory;
    private Contribution contribution;
    private StoreDirectory storeDirectory;
    private WorkQueue workQueue;
    private DeliveryAdminDirectory deliveryAdminDirectory;
    private RegistrationDirectory registrationDirectory;


    //Contructor
    public System(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,
            VolunteerDirectory volunteerDirectory, ContributorDirectory contributorDirectory, StoreAdminDirectory storeAdminDirectory,
            DeliveryAgentDirectory deliveryAgentDirectory, DistributorDirectory distributorDirectory, ReceiverDirectory receiverDirectory, DriverDirectory driverDirectory, ClerkDirectory clerkDirectory,
            Contribution contribution, StoreDirectory storeDirectory, DeliveryAdminDirectory deliveryAdminDirectory, RegistrationDirectory registrationDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        //Project
        this.volunteerDirectory = volunteerDirectory;
        this.contributorDirectory = contributorDirectory;
        this.storeAdminDirectory = storeAdminDirectory;
        this.deliveryAgentDirectory = deliveryAgentDirectory;
        this.distributorDirectory = distributorDirectory;
        this.receiverDirectory = receiverDirectory;
        this.driverDirectory = driverDirectory;
        this.clerkDirectory = clerkDirectory;
        this.contribution = contribution;
        this.storeDirectory = storeDirectory;
        this.deliveryAdminDirectory = deliveryAdminDirectory;
        this.registrationDirectory = registrationDirectory;
    }

    public static System getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public static void setInstance(System business) {
        System.business = business;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        if (volunteerDirectory == null) {
            volunteerDirectory = new VolunteerDirectory();
        }
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public ContributorDirectory getContributorDirectory() {
        if (contributorDirectory == null) {
            contributorDirectory = new ContributorDirectory();
        }
        return contributorDirectory;
    }

    public void setContributorDirectory(ContributorDirectory contributorDirectory) {
        this.contributorDirectory = contributorDirectory;
    }

    public StoreAdminDirectory getStoreAdminDirectory() {
        if (storeAdminDirectory == null) {
            storeAdminDirectory = new StoreAdminDirectory();
        }
        return storeAdminDirectory;
    }

    public void setStoreAdminDirectory(StoreAdminDirectory storeAdminDirectory) {
        this.storeAdminDirectory = storeAdminDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        if (deliveryAgentDirectory == null) {
            deliveryAgentDirectory = new DeliveryAgentDirectory();
        }
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public DistributorDirectory getDistributorDirectory() {
        if (distributorDirectory == null) {
            distributorDirectory = new DistributorDirectory();
        }
        return distributorDirectory;
    }

    public void setDistributorDirectory(DistributorDirectory distributorDirectory) {
        this.distributorDirectory = distributorDirectory;
    }

    public ReceiverDirectory getReceiverDirectory() {
        if (receiverDirectory == null) {
            receiverDirectory = new ReceiverDirectory();
        }
        return receiverDirectory;
    }

    public void setReceiverDirectory(ReceiverDirectory receiverDirectory) {
        this.receiverDirectory = receiverDirectory;
    }

    public DriverDirectory getDriverDirectory() {

        if (driverDirectory == null) {
            driverDirectory = new DriverDirectory();
        }
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public ClerkDirectory getClerkDirectory() {
        if (clerkDirectory == null) {
            clerkDirectory = new ClerkDirectory();
        }
        return clerkDirectory;
    }

    public void setClerkDirectory(ClerkDirectory clerkDirectory) {
        this.clerkDirectory = clerkDirectory;
    }

    public StoreDirectory getStoreDirectory() {
        if (storeDirectory == null) {
            storeDirectory = new StoreDirectory();
        }
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public void setContribution(Contribution contribution) {
        this.contribution = contribution;
    }
    
     public DeliveryAdminDirectory getDeliveryAdminDirectory() {
        if (deliveryAdminDirectory == null) {
            deliveryAdminDirectory = new DeliveryAdminDirectory();
        }
        return deliveryAdminDirectory;
    }

    public void setDeliveryAdminDirectory(DeliveryAdminDirectory deliveryAdminDirectory) {
        this.deliveryAdminDirectory = deliveryAdminDirectory;
    }
    public RegistrationDirectory getRegistrationDirectory() {
        if(registrationDirectory == null){
            registrationDirectory = new RegistrationDirectory();
        }
        return registrationDirectory;
    }

    public void setRegistrationDirectory(RegistrationDirectory registrationDirectory) {
        this.registrationDirectory = registrationDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private System() {
        super(null);
        // networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
}
