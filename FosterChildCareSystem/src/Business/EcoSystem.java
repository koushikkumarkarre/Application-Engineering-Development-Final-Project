/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Enterprise.Enterprise;
import Business.House.HouseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Koushik
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public HouseDirectory houseDirectory;

    public HouseDirectory getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(HouseDirectory houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
     public boolean checkIfPhoneIsUnique(String phone, String username) {
        for (Network n : this.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getPhone() != null) {
                            if (u.getPhone().equals(phone) && !u.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
     public boolean checkIfNetworkIsUnique(String networkName) {
        for (Network n : this.getNetworkList()) {
            if (n.getName().toLowerCase().equals(networkName.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
     
      public boolean checkIfEnterpriseIsUnique(String entName) {
        for (Network n : this.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().toLowerCase().equals(entName.toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Boolean checkValidPhoneFormat(String phoneNo) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(phoneNo);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid format of phone! Ex: 9876543210", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     public Boolean checkValidPasswordFormat(String password) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher m1 = p1.matcher(password);
        boolean b1 = m1.matches();
        if (!b1) {
            JOptionPane.showMessageDialog(null, "Please enter valid password  format!\nPassword must contain at least one digit [0-9].\n"
                    + "Password must contain at least one lowercase Latin character [a-z].\n"
                    + "Password must contain at least one uppercase Latin character [A-Z].\n"
                    + "Password must contain at least one special character like ! @ # & ( ).\n"
                    + "Password must contain a length of at least 8 characters and a maximum of 20 characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    
    public boolean checkIfUserIsUnique(String userName){
        boolean flag = true;
        for (Network n : this.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount u : e.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) {
                        flag = false;
                    }
                }
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getUsername().toLowerCase().equals(userName.toLowerCase())) {
                            flag = false;
                        }
                    }
                }
            }
        }
        if ("admin".equals(userName.toLowerCase())) {
            flag = false;
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Sorry! " + userName + " already exists in the system!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public void removeNetwork(Network network)
    {
        networkList.remove(network);
    }
   
}

