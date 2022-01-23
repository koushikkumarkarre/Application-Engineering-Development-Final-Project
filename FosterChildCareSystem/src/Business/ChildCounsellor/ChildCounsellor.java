/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChildCounsellor;

/**
 *
 * @author Koushik
 */
public class ChildCounsellor {
    
    public String Name;
    
    public int ChildCounsellorId;
    
    public String PhoneNumber;
    
    public String Email;
    
    public String Address;

    public ChildCounsellor(String Name, String PhoneNumber, String Email, String Address) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getChildCounsellorId() {
        return ChildCounsellorId;
    }

    public void setChildCounsellorId(int ChildCounsellorId) {
        this.ChildCounsellorId = ChildCounsellorId;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
