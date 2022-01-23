/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

import Business.HouseLessor.HouseLessor;

/**
 *
 * @author Koushik
 */
public class House {
    
   public int Id;
   
   public String HouseName;
   
   public String Address;
   
   public String City;
   
   public HouseLessor houseLessor;
   
   public boolean IsBooked;

    public HouseLessor getHouseLessor() {
        return houseLessor;
    }

    public void setHouseLessor(HouseLessor houseLessor) {
        this.houseLessor = houseLessor;
    }

    public House(String HouseName, String Address, String City) {
        this.HouseName = HouseName;
        this.Address = Address;
        this.City = City;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
   
   
}
