/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SocialWorker;

/**
 *
 * @author Koushik
 */
public class SocialWorker {
    
    public String Name;
    
    public int SocialWorkerID;
    
    public int Age;
    
    public String Address;
    
    public String PhoneNumber;
    
    public String Email;

 

    public SocialWorker(String Name, int Age, String Address, String PhoneNumber, String Email) {
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

 

    public int getSocialWorkerID() {
        return SocialWorkerID;
    }

 

    public void setSocialWorkerID(int SocialWorkerID) {
        this.SocialWorkerID = SocialWorkerID;
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
