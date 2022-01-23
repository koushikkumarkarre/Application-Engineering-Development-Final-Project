package Business.SendSMS;

 

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author Koushik
 */
public class sendSMS {
    
            public static final String ACCOUNT_SID = "AC97b806d25cb560f66fd310d1f6d728a7";
             public static final String AUTH_TOKEN = "07cc8c63660fba95c02c48836311aaef";
    
    public static void main (String[] args){
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

 

    Message message = Message.creator(new PhoneNumber("+12488434093"),
        new PhoneNumber("18153842226"), 
        "Welcome! You have successfully logined into FosterChild Application").create();

 

    System.out.println(message.getSid());
  }

 

        
 

 

        
        
       
  }

 