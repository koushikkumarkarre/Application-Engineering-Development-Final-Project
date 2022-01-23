/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.FosterChild.FosterChildDirectory;
import Business.Parent.ParentDirectory;
import Business.Role.FosterChildRole;
import Business.Role.FosterParentRole;
import Business.Role.Role;
import Business.Role.SocialWorkerRole;
import Business.SocialWorker.SocialWorkerDirectory;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class FosterCareEnterprise extends Enterprise {
   

    public FosterCareEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FosterCare);
        this.parentDirectory = new ParentDirectory();
        this.fosterChildDirectory = new FosterChildDirectory();
        this.socialWorkerDirectory = new SocialWorkerDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FosterChildRole());
        roles.add(new FosterParentRole());
        roles.add(new SocialWorkerRole());
        return roles;
    }

}
