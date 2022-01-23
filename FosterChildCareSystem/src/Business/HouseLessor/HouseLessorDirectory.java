/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HouseLessor;

import Business.FosterChild.FosterChild;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class HouseLessorDirectory {
    public ArrayList<HouseLessor> HouseLessorList;

    public HouseLessorDirectory() {
        this.HouseLessorList = new ArrayList<HouseLessor>();
    }

    
    public void add(HouseLessor houselessor){
        this.HouseLessorList.add(houselessor);
    }
    
    public HouseLessor getHouseLessorById(int id){
        for(HouseLessor h : this.HouseLessorList){
            if(h.getLessorId()== id){
                return h;
            }
        }
        return null;
    }
    
    public HouseLessor getHouseLessorByName(String name){
        for(HouseLessor ho : this.HouseLessorList){
            if(ho.getName().equals(name)){
                return ho;
            }
        }
        return null;
    }
    
     public void updateHouseLessor(int id, String parentName, String parentPhone, String address ,String parentEmail  ){
        for(HouseLessor lessor: this.HouseLessorList){
            if(lessor.getLessorId()== id){
                lessor.setName(parentName);
                lessor.setPhoneNumber(parentPhone);
                lessor.setAddress(address);
                lessor.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteLessor(int id){
        HouseLessor toDelete = null;
        for(HouseLessor houseLessor: this.HouseLessorList){
            if(houseLessor.getLessorId()== id){
                toDelete = houseLessor;
            }
        }
        
        if(toDelete != null){
            this.HouseLessorList.remove(toDelete);
        }
    }
    
    public void DeleteLessorByName(String name){
        HouseLessor toDelete = null;
        for(HouseLessor houseLessor: this.HouseLessorList){
            if(houseLessor.getName().equals(name)){
                toDelete = houseLessor;
            }
        }
        
        if(toDelete != null){
            this.HouseLessorList.remove(toDelete);
        }
    }
    
    public HouseLessor createHouseLessor(String Name, String Address, String PhoneNumber, String Email){
        HouseLessor hosueLessor = new HouseLessor(Name,Address,PhoneNumber,Email);
        hosueLessor.setEmail(Email);
        hosueLessor.setPhoneNumber(PhoneNumber);
        hosueLessor.setAddress(Address);
        hosueLessor.setHouseLessorId(this.HouseLessorList.size()+1);
        this.HouseLessorList.add(hosueLessor);
        return hosueLessor;
    }
}
