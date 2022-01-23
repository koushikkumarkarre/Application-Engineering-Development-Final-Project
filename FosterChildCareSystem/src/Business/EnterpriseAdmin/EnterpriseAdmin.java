/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseAdmin;

import Business.Enterprise.Enterprise;
import Business.Network.Network;

/**
 *
 * @author Koushik
 */
public class EnterpriseAdmin {
    
    public String Name;
    
    public String Phone;
    
    public String Email;
    
    public Network network;
    
    public Enterprise Enterprise;

    public EnterpriseAdmin(String Name, String Phone, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(Enterprise Enterprise) {
        this.Enterprise = Enterprise;
    }
    
    
}
