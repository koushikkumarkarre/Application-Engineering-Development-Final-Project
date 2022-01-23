/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HouseLessorRole;
import Business.Role.NgoVolunteerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class HouseLessorOrganization extends Organization{
    public HouseLessorOrganization (String name){
        super(name);
    }
    @Override
    
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HouseLessorRole());
        return roles;
    }
       @Override
    public Organization.OrganizationType getType() {
        return Organization.OrganizationType.HouseLessorOrganization;
    }  
}
