/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NgoVolunteerRole;
import Business.Role.Role;
import Business.Role.TreasurerRole;
import Business.Voluteers.VolunteerDirectory;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class FundRaiserEnterprise extends Enterprise{
    
    public FundRaiserEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FundRaiser);
        this.volunteerDirectory= new VolunteerDirectory();
        this.BankBalance = 0;
    }
    
    public int BankBalance;
    public int DonationsRecieved;
    public int StipendsDispensed;
    
    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new TreasurerRole());
        roles.add(new NgoVolunteerRole());
        return roles;
    }
    
}
