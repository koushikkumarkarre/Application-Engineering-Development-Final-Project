package Business.Email;

import Business.SendSMS.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 

/**
 *
 * @author Koushik
 */
public class javaMailUtil {
    
    public static void sendMail(String recipient) throws Exception{
                        System.out.println("Preparing to send email");

 

        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.port", "587");
                
                String myAccountEmail = "don1otreply@gmail.com";
                String password = "donotreply@1";
                
                Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
                   
                    
                });
                
                Message message = prepareMessage(session, myAccountEmail, recipient);
                Transport.send(message);
                System.out.println("Email Sent Successfully");
        
        
        
    }

 

    private static Message prepareMessage(Session session, String myAccountEmail, String recipient) {

 

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Your Appointment Status");
            message.setText("Your appointment has been confirmed ");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(javaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}