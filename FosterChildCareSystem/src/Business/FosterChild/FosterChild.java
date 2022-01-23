/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FosterChild;

/**
 *
 * @author Koushik
 */
public class FosterChild {
    
    public String Name;
    
    public int Age;
    
    public String Address;
    
    public boolean IsAdopted;

    public boolean isIsAdopted() {
        return IsAdopted;
    }

    public void setIsAdopted(boolean IsAdopted) {
        this.IsAdopted = IsAdopted;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public FosterChild(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public int FosterChildId;
    
    public String Phone;
    
    public String Email;

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

    public int getFosterChildId() {
        return FosterChildId;
    }

    public void setFosterChildId(int FosterChildId) {
        this.FosterChildId = FosterChildId;
    }
    
}
