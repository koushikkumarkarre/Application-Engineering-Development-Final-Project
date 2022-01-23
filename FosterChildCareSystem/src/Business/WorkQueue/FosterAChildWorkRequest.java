/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Parent.Parent;

/**
 *
 * @author Koushik
 */
public class FosterAChildWorkRequest extends WorkRequest{
    
    public Parent parent;
    
    public FosterChild child;
    
    public String Status;
    
    public Organization organization;
    
    public Enterprise enterprise;
    
    public Network network;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public FosterChild getChild() {
        return child;
    }

    public void setChild(FosterChild child) {
        this.child = child;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    
    
}
