/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import userinterface.SysAdminRole.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SocialWorker.SocialWorkerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,account,organization, enterprise, network, business);//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public RoleType getRoleType(){
        return RoleType.SysAdmin;
    }
    
}
