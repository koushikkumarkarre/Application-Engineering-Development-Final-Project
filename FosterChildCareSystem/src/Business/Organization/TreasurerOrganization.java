/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SocialWorkerRole;
import Business.Role.TreasurerRole;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class TreasurerOrganization extends Organization{
    public TreasurerOrganization(String name){
        super(name);
    }
    @Override
    
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TreasurerRole());
        return roles;
    }
       @Override
    public OrganizationType getType() {
        return Organization.OrganizationType.TreasurerOrganization;
    }  
}