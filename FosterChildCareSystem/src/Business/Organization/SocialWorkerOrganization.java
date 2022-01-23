/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FosterParentRole;
import Business.Role.Role;
import Business.Role.SocialWorkerRole;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class SocialWorkerOrganization extends Organization{
    public SocialWorkerOrganization(String name){
        super(name);
    }
    @Override
    
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SocialWorkerRole());
        return roles;
    }
       @Override
    public OrganizationType getType() {
        return Organization.OrganizationType.SocialWorkerOrganization;
    }  
}
