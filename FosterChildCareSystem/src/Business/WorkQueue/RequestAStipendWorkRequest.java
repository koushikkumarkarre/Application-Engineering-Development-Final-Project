/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Parent.Parent;

/**
 *
 * @author Koushik
 */
public class RequestAStipendWorkRequest extends WorkRequest{
    
    public Parent parent;
    public Enterprise enterprise;
    public Organization organization;
    public Network network;
    public String status;
    
    int RequestedAmount;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRequestedAmount() {
        return RequestedAmount;
    }

    public void setRequestedAmount(int RequestedAmount) {
        this.RequestedAmount = RequestedAmount;
    }
    
    
}


