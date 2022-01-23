/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluteers;

/**
 *
 * @author Koushik
 */
public class Volunteer {
    
    public String Name;
    
    public int VolunteerId;
    
    public String Address;
    
    public String PhoneNumber;
    
    public String Email;

 

    public Volunteer(String Name, String Address, String PhoneNumber, String Email) {
        this.Name = Name;
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

 

    public int getVolunteerId() {
        return VolunteerId;
    }

 

    public void setVolunteerId(int VolunteerId) {
        this.VolunteerId = VolunteerId;
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
