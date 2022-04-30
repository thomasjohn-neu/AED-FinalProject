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
public class ClerkDirectory  {
    ArrayList<Clerk> clerkList = new ArrayList();
    int count = 0;

    public ClerkDirectory() {
        ++this.count;
    }

    public ArrayList<Clerk> getClerkList() {
        return this.clerkList;
    }

    public void setClerkList(ArrayList<Clerk> clerkList) {
        this.clerkList = clerkList;
    }

    public void addClerktoList(Clerk clerk) {
        clerk.setClerkID(this.count);
        this.clerkList.add(clerk);
        ++this.count;
    }

    public void removeclerkfromList(Clerk clerk) {
        this.clerkList.remove(clerk);
    }

    public Clerk createClerk(String uname) {
        Clerk clerk = new Clerk();
        clerk.setFirstName(uname);
        return clerk;
    }

    public void deleteClerk(String username) {
        for(int i = 0; i < this.clerkList.size(); ++i) {
            if (((Clerk)this.clerkList.get(i)).getUserName().equals(username)) {
                this.clerkList.remove(i);
            }
        }

    }

    public Clerk createClerk(String name, String uname, String password) {
        Clerk clerk = new Clerk();
        clerk.setUserName(uname);
        clerk.setFirstName(name);
        clerk.setPassword(password);
        this.clerkList.add(clerk);
        return clerk;
    }

    public boolean checkifUserNameExists(String username) {
        Iterator var2 = this.clerkList.iterator();

        Clerk clerk;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            clerk = (Clerk)var2.next();
        } while(!clerk.getUserName().equals(username));

        return true;
    }

    public void updateClerkAccount(String oldusername, String name, String username, String password) {
        Clerk clerk = null;
        Iterator var6 = this.clerkList.iterator();

        while(var6.hasNext()) {
            Clerk cle = (Clerk)var6.next();
            if (cle.getUserName().equals(oldusername)) {
                clerk = cle;
            }
        }

        clerk.setFirstName(name);
        clerk.setUserName(username);
        clerk.setPassword(password);
    }

    public void addWorkRequesttoClerk(Clerk clerk, Task workreq) {
        for(int i = 0; i < this.clerkList.size(); ++i) {
            if (((Clerk)this.clerkList.get(i)).getUserName().equals(clerk.getUserName())) {
                ((Clerk)this.clerkList.get(i)).getWorkQueue().addWorkRequesttoQueue(workreq);
            }
        }

    }
}
