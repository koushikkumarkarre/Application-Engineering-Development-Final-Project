/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Voluteers.Volunteer;

/**
 *
 * @author Koushik
 */
public class NGOContributeWorkRequest extends WorkRequest {
    
    public Volunteer volunteer;
    
    public Network network;
    
    public Organization organization;
    
    public Enterprise enterprise;
    
    public int ContributionAmount;
    
    public String Status;

    public NGOContributeWorkRequest(Volunteer volunteer, Network network, Organization organization, Enterprise enterprise, int ContributionAmount) {
        this.volunteer = volunteer;
        this.network = network;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ContributionAmount = ContributionAmount;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
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

    public int getContributionAmount() {
        return ContributionAmount;
    }

    public void setContributionAmount(int ContributionAmount) {
        this.ContributionAmount = ContributionAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
