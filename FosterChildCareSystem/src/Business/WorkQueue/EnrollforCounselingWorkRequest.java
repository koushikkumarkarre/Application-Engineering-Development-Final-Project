/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ChildCounsellor.ChildCounsellor;
import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Network.Network;
import Business.Organization.Organization;

/**
 *
 * @author Koushik
 */
public class EnrollforCounselingWorkRequest extends WorkRequest{
    
    public ChildCounsellor childCounselor;
    
    public FosterChild fosterChild;
            
    public String Status;
    
    public Organization organization;
    
    public Enterprise enterprise;
    
    public Network network;

    public ChildCounsellor getChildCounselor() {
        return childCounselor;
    }

    public void setChildCounselor(ChildCounsellor childCounselor) {
        this.childCounselor = childCounselor;
    }

    public FosterChild getFosterChild() {
        return fosterChild;
    }

    public void setFosterChild(FosterChild fosterChild) {
        this.fosterChild = fosterChild;
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
