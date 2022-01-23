/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Parent;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class ParentDirectory {
    
    public ArrayList<Parent> ParentList;

    public ParentDirectory() {
        this.ParentList = new ArrayList<Parent>();
    }

    public ArrayList<Parent> getParentList() {
        return ParentList;
    }

    public void setParentList(ArrayList<Parent> CustomerList) {
        this.ParentList = CustomerList;
    }
    
    public void add(Parent customer){
        this.ParentList.add(customer);
    }
    
    public Parent getParentByName(String name){
        for(Parent c : this.ParentList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    
    
    public Parent getParentById(int ParentId){
        for(Parent c : this.ParentList){
            if(c.getParentId()== ParentId){
                return c;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Parent parent: this.ParentList){
            if(parent.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Parent customer: this.ParentList){
            if(customer.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateParent(int id, String parentName, String parentPhone, String address ,String parentEmail ){
        for(Parent customer: this.ParentList){
            if(customer.getParentId()== id){
                customer.setName(parentName);
                customer.setPhoneNumber(parentPhone);
                customer.setAddress(address);
                customer.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteParent(int id){
        Parent toDelete = null;
        for(Parent customer: this.ParentList){
            if(customer.getParentId()== id){
                toDelete = customer;
            }
        }
        
        if(toDelete != null){
            this.ParentList.remove(toDelete);
        }
    }
    
    public void DeleteParentByName(String Name){
        Parent toDelete = null;
        for(Parent customer: this.ParentList){
            if(customer.getName().equals(Name)){
                toDelete = customer;
            }
        }
        
        if(toDelete != null){
            this.ParentList.remove(toDelete);
        }
    }
    
    public Parent createUserParent(String name, String Address, String Phone, String Email){
        Parent parent = new Parent(name,10, Address,Phone, Email);
        this.ParentList.add(parent);
        return parent;
    }
}
