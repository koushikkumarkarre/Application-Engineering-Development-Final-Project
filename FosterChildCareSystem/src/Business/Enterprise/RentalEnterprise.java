/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.HouseLessor.HouseLessorDirectory;
import Business.Role.HouseLessorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class RentalEnterprise extends Enterprise{
    
    public RentalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Rental);
        this.houseLessorDirectory = new HouseLessorDirectory();
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new HouseLessorRole());
        return roles;
    }
    
}
