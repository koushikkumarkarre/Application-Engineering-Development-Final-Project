/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.House.HouseDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author Koushik
 */

public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    public ArrayList<Role> roles;
    private OrganizationType type;
    
    

    public enum OrganizationType {
        ChildrenOrganization("Children Organization"),
        ParentOrganization("Parent Organization"),
        SocialWorkerOrganization("Social Worker Organization"),
        RehabilitationOrganization("Rehabilitation Organization"),
        ParentTrainingOrganization("Parent Training Organization"),
        TreasurerOrganization("Treasurer Organization"),
        NgoOrganization("Ngo Organization"),
        HouseLessorOrganization("House Lessor Organization");


        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public OrganizationType getType() {
        return type;
    }

    public void setType(OrganizationType type) {
        this.type = type;
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new ArrayList<>();
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}

