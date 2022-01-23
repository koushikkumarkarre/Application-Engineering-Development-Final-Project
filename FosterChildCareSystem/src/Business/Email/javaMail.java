package Business.Email;

import Business.SendSMS.*;
import Business.Email.javaMailUtil;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author Koushik 
 */
public class javaMail {
    public static void main(String[] args) throws Exception {
        javaMailUtil.sendMail("deepikachudi16@gmail.com");
    }
    
}
 