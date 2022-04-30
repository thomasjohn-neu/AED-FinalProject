/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.DeliveryAgency;
import models.TaskQueue.Task;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author naina
 */
public class DriverDirectory {
    ArrayList<Driver> driverList = new ArrayList();
    int count = 0;

    public DriverDirectory() {
        ++this.count;
    }

    public ArrayList<Driver> getDriverList() {
        return this.driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }

    public void addDrivertoList(Driver driver) {
        driver.setDriverID(this.count);
        this.driverList.add(driver);
        ++this.count;
    }

    public void removeDriverfromList(Driver driver) {
        this.driverList.remove(driver);
    }

    public Driver createDriver(String name, String uname, String password) {
        Driver driver = new Driver();
        driver.setUserName(uname);
        driver.setFirstName(name);
        driver.setPassword(password);
        this.driverList.add(driver);
        return driver;
    }

    public void deleteDriver(String username) {
        for(int i = 0; i < this.driverList.size(); ++i) {
            if (((Driver)this.driverList.get(i)).getUserName().equals(username)) {
                this.driverList.remove(i);
            }
        }

    }

    public boolean checkifUserNameExists(String username) {
        Iterator var2 = this.driverList.iterator();

        Driver driver;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            driver = (Driver)var2.next();
        } while(!driver.getUserName().equals(username));

        return true;
    }

    public Driver ReturnexistingDriver(String username) {
        Iterator var2 = this.driverList.iterator();

        Driver driver;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            driver = (Driver)var2.next();
        } while(!driver.getUserName().equals(username));

        return driver;
    }

    public void updateDriverAccount(String oldusername, String name, String username, String password) {
        Driver driver = null;
        Iterator var6 = this.driverList.iterator();

        while(var6.hasNext()) {
            Driver dri = (Driver)var6.next();
            if (dri.getUserName().equals(oldusername)) {
                driver = dri;
            }
        }

        driver.setFirstName(name);
        driver.setUserName(username);
        driver.setPassword(password);
    }

    public void addWorkRequesttoDriver(Driver driver, Task workreq) {
        for(int i = 0; i < this.driverList.size(); ++i) {
            if (((Driver)this.driverList.get(i)).getUserName().equals(driver.getUserName())) {
                ((Driver)this.driverList.get(i)).getWorkQueue().addWorkRequesttoQueue(workreq);
            }
        }

    }
}
