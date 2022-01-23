/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.ChildCounsellor.ChildCounsellorDirectory;
import Business.Instructor.InstructorDirectory;
import Business.Role.CounsellorRole;
import Business.Role.InstructorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Koushik
 */
public class TrainingCenterEnterprise extends Enterprise {
    
    public TrainingCenterEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.TrainingCenter);
        this.childCounsellorDirectory = new ChildCounsellorDirectory();
        this.instructorDirectory = new InstructorDirectory();
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new CounsellorRole());
        roles.add(new InstructorRole());
        return roles;
    }
}
