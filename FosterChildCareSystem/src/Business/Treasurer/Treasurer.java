/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treasurer;

/**
 *
 * @author Koushik
 */
public class Treasurer {
    
    public String Name;
    
    public String PhoneNumber;
    
    public String Address;
    
    public String Email;

    public Treasurer(String Name, String PhoneNumber, String Address, String Email) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
