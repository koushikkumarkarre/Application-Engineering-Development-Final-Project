/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FosterChild;

import Business.Parent.Parent;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class FosterChildDirectory {
    
    public ArrayList<FosterChild> FosterChildList;

    public FosterChildDirectory() {
        this.FosterChildList = new ArrayList<FosterChild>();
    }

    public ArrayList<FosterChild> getFosterChildList() {
        return FosterChildList;
    }

    public void setFosterChildList(ArrayList<FosterChild> FosterChildList) {
        this.FosterChildList = FosterChildList;
    }
    
    
    public void add(FosterChild child){
        this.FosterChildList.add(child);
    }
    
    public FosterChild getFosterChildById(int id){
        for(FosterChild c : this.FosterChildList){
            if(c.getFosterChildId()== id){
                return c;
            }
        }
        return null;
    }
    
     public void updateFosterChild(int id, String fosterChildName, int age, String phone ,String email ){
        for(FosterChild child: this.FosterChildList){
            if(child.getFosterChildId()== id){
                child.setName(fosterChildName);
                child.setAge(age);
                child.setEmail(email);
                child.setPhone(phone);
            }
        }
    }
    
    public void DeleteFosterChild(int id){
        FosterChild toDelete = null;
        for(FosterChild fosterchild: this.FosterChildList){
            if(fosterchild.getFosterChildId()== id){
                toDelete = fosterchild;
            }
        }
        
        if(toDelete != null){
            this.FosterChildList.remove(toDelete);
        }
    }
    
    public void DeleteFosterChildByName(String name){
        FosterChild toDelete = null;
        for(FosterChild fosterchild: this.FosterChildList){
            if(fosterchild.getName().equals(name)){
                toDelete = fosterchild;
            }
        }
        
        if(toDelete != null){
            this.FosterChildList.remove(toDelete);
        }
    }
    
    public FosterChild createFosterChild(String name, String Phone, String email, String Address){
        FosterChild child = new FosterChild(name,10);
        child.setEmail(email);
        child.setPhone(Phone);
        child.setAddress(Address);
        child.setFosterChildId(this.FosterChildList.size() +1);
        this.FosterChildList.add(child);
        return child;
    }

    public FosterChild getChildbyName(String name) {
        for(FosterChild c : this.FosterChildList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
