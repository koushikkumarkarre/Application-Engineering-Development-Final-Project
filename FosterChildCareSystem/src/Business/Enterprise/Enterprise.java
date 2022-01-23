/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.ChildCounsellor.ChildCounsellorDirectory;
import Business.EnterpriseAdmin.EnterpriseAdmin;
import Business.FosterChild.FosterChildDirectory;
import Business.HouseLessor.HouseLessorDirectory;
import Business.Instructor.InstructorDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Parent.ParentDirectory;
import Business.SocialWorker.SocialWorkerDirectory;
import Business.Treasurer.Treasurer;
import Business.Voluteers.VolunteerDirectory;


/**
 *
 * @author Koushik 
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    public EnterpriseAdmin admin;
    public ParentDirectory parentDirectory;
    public FosterChildDirectory fosterChildDirectory;
    public SocialWorkerDirectory socialWorkerDirectory;
    public HouseLessorDirectory houseLessorDirectory;
    public InstructorDirectory instructorDirectory;
    public ChildCounsellorDirectory childCounsellorDirectory;
    public VolunteerDirectory volunteerDirectory;
    public Treasurer treasurer;

    public InstructorDirectory getInstructorDirectory() {
        return instructorDirectory;
    }

    public void setInstructorDirectory(InstructorDirectory instructorDirectory) {
        this.instructorDirectory = instructorDirectory;
    }

    public ChildCounsellorDirectory getChildCounsellorDirectory() {
        return childCounsellorDirectory;
    }

    public SocialWorkerDirectory getSocialWorkerDirectory() {
        return socialWorkerDirectory;
    }

    public void setSocialWorkerDirectory(SocialWorkerDirectory socialWorkerDirectory) {
        this.socialWorkerDirectory = socialWorkerDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public Treasurer getTreasurer() {
        return treasurer;
    }

    public void setTreasurer(Treasurer treasurer) {
        this.treasurer = treasurer;
    }

    public void setChildCounsellorDirectory(ChildCounsellorDirectory childCounsellorDirectory) {
        this.childCounsellorDirectory = childCounsellorDirectory;
    }

    public HouseLessorDirectory getHouseLessorDirectory() {
        return houseLessorDirectory;
    }

    public void setHouseLessorDirectory(HouseLessorDirectory houseLessor) {
        this.houseLessorDirectory = houseLessor;
    }

    public FosterChildDirectory getFosterChildDirectory() {
        return fosterChildDirectory;
    }

    public void setFosterChildDirectory(FosterChildDirectory fosterChildDirectory) {
        this.fosterChildDirectory = fosterChildDirectory;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ParentDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public SocialWorkerDirectory getSocialWorker() {
        return socialWorkerDirectory;
    }

    public void setSocialWorker(SocialWorkerDirectory socialWorker) {
        this.socialWorkerDirectory = socialWorker;
    }

    public EnterpriseAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(EnterpriseAdmin admin) {
        this.admin = admin;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        FosterCare("Foster Care"),
        TrainingCenter("Training Center"),
        Rental("Rental"),
        FundRaiser("FundRaiser");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
