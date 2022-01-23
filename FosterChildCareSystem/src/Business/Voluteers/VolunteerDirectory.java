/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluteers;

import Business.ChildCounsellor.ChildCounsellor;
import Business.SocialWorker.SocialWorker;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class VolunteerDirectory {
        public ArrayList<Volunteer> VolunteerList;

    public VolunteerDirectory() {
        this.VolunteerList = new ArrayList<Volunteer>();
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return VolunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> VolunteerList) {
        this.VolunteerList = VolunteerList;
    }

    public void add(Volunteer socialWorker){
        this.VolunteerList.add(socialWorker);
    }
    
    public Volunteer getVolunteerById(int WorkerId){
        for(Volunteer s : this.VolunteerList){
            if(s.getVolunteerId()== WorkerId){
                return s;
            }
        }
        return null;
    }
    
    public Volunteer getVolunteerByName(String name){
        for(Volunteer s : this.VolunteerList){
            if(s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Volunteer volunteer: this.VolunteerList){
            if(volunteer.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Volunteer volunteer: this.VolunteerList){
            if(volunteer.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateVolunteer(int id, String Name, String Phone, String address ,String parentEmail ){
        for(Volunteer volunteer: this.VolunteerList){
            if(volunteer.getVolunteerId()== id){
                volunteer.setName(Name);
                volunteer.setPhoneNumber(Phone);
                volunteer.setAddress(address);
                volunteer.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteVolunteer(int id){
        Volunteer toDelete = null;
        for(Volunteer volunteer: this.VolunteerList){
            if(volunteer.getVolunteerId()== id){
                toDelete = volunteer;
            }
        }
        
        if(toDelete != null){
            this.VolunteerList.remove(toDelete);
        }
    }
    
    public void DeleteVolunteerByName(String name){
        Volunteer toDelete = null;
        for(Volunteer volunteer: this.VolunteerList){
            if(volunteer.getName().equals(name)){
                toDelete = volunteer;
            }
        }
        
        if(toDelete != null){
            this.VolunteerList.remove(toDelete);
        }
    }
    
    public Volunteer createVolunteer(String Name, String Address, String PhoneNumber, String Email){
        Volunteer volunteer = new Volunteer(Name,Address,PhoneNumber,Email);
        
        volunteer.setVolunteerId(this.VolunteerList.size()+1);
        
        this.VolunteerList.add(volunteer);
        return volunteer;
    }
}
