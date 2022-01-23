/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Koushik 
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (null != type) {
            switch (type) {
                case FosterCare:
                    enterprise = new FosterCareEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case TrainingCenter:
                    enterprise = new TrainingCenterEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Rental:
                    enterprise = new RentalEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case FundRaiser:
                    enterprise = new FundRaiserEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
        }
        return enterprise;
    }
    
}
