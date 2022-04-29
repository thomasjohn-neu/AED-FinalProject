/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Volunteer;

/**
 *
 * @author naina
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerList = new ArrayList();
    private Volunteer volunteer;

    public ArrayList<Volunteer> getVolunteerList() {
        return this.volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public Volunteer getVolunteer() {
        return this.volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public VolunteerDirectory() {
    }

    public Volunteer createVolunteer(String name, String role, String userName, String password, String email, String phone, String carrier, String location, String imgPath) {
        this.volunteer = new Volunteer(name, role, userName, password, email, phone, carrier, location, imgPath);
        this.volunteerList.add(this.volunteer);
        return this.volunteer;
    }

    public void deleteVolunteer(String username) {
        for(int i = 0; i < this.volunteerList.size(); ++i) {
            if (((Volunteer)this.volunteerList.get(i)).getUserName().equals(username)) {
                this.volunteerList.remove(i);
            }
        }

    }
}
