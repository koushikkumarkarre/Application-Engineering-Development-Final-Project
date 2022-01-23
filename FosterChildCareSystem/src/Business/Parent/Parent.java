/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Parent;

import java.awt.Image;

/**
 *
 * @author Koushik
 */
public class Parent {
    
    public String Name;
    
    public int Age;
    
    public String Address;
    
    public int ParentId;
    
    public String PhoneNumber;
    
    public String Email;
    
    public int Amount;
     private Image picture;


    public Parent(String Name, int Age, String Address, String PhoneNumber, String Email) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int ParentId) {
        this.ParentId = ParentId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
    
    
}
