/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HouseLessor;

import Business.House.HouseDirectory;

/**
 *
 * @author Koushik
 */
public class HouseLessor {
    
    public String Name;
    
    public int LessorId;
    
    public String Address;
    
    public String PhoneNumber;
    
    public String Email;
    
    public HouseDirectory Houses;
    
    public int houseLessorId;

    public int getHouseLessorId() {
        return houseLessorId;
    }

    public void setHouseLessorId(int houseLessorId) {
        this.houseLessorId = houseLessorId;
    }

    public HouseDirectory getHouses() {
        return Houses;
    }

    public void setHouses(HouseDirectory Houses) {
        this.Houses = Houses;
    }

    public HouseLessor(String Name, String Address, String PhoneNumber, String Email) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Houses = new HouseDirectory();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getLessorId() {
        return LessorId;
    }

    public void setLessorId(int LessorId) {
        this.LessorId = LessorId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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
    
    
}
