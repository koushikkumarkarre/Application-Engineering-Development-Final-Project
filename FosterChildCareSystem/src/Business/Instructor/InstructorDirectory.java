/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Instructor;

import Business.ChildCounsellor.ChildCounsellor;
import Business.FosterChild.FosterChild;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class InstructorDirectory {
     public ArrayList<Instructor> InstructorList;

    public InstructorDirectory() {
        this.InstructorList = new ArrayList<Instructor>();
    }

    public ArrayList<Instructor> getInstructorList() {
        return InstructorList;
    }

    public void setInstructorList(ArrayList<Instructor> InstructorList) {
        this.InstructorList = InstructorList;
    }

    public void add(Instructor instructor){
        this.InstructorList.add(instructor);
    }
    
    public Instructor getInstructorById(int instructorId){
        for(Instructor i : this.InstructorList){
            if(i.getInstructorId()== instructorId){
                return i;
            }
        }
        return null;
    }
    
    public Instructor getInstructorByName(String name){
        for(Instructor i : this.InstructorList){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Instructor i: this.InstructorList){
            if(i.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Instructor i: this.InstructorList){
            if(i.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateInstrucor(int id, String parentName, String parentPhone, String address ,String parentEmail ){
        for(Instructor i: this.InstructorList){
            if(i.getInstructorId()== id){
                i.setName(parentName);
                i.setPhoneNumber(parentPhone);
                i.setAddress(address);
                i.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteInstructor(int id){
        Instructor toDelete = null;
        for(Instructor instructor: this.InstructorList){
            if(instructor.getInstructorId()== id){
                toDelete = instructor;
            }
        }
        
        if(toDelete != null){
            this.InstructorList.remove(toDelete);
        }
    }
    
    public void DeleteInstructorByName(String name){
        Instructor toDelete = null;
        for(Instructor instructor: this.InstructorList){
            if(instructor.getName().equals(name)){
                toDelete = instructor;
            }
        }
        
        if(toDelete != null){
            this.InstructorList.remove(toDelete);
        }
    }
    
    public Instructor createInstructor(String name, String Phone, String email, String Address){
        Instructor instructor = new Instructor(name,Phone, email, Address);
        instructor.setEmail(email);
        instructor.setPhoneNumber(Phone);
        instructor.setAddress(Address);
        instructor.setInstructorId(this.InstructorList.size() +1);
        this.InstructorList.add(instructor);
        return instructor;
    }
}
