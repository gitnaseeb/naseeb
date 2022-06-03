package project;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

    public static void main(String[] args) {

        // Recipient's email ID 
        String to = "kisebhejna@gmail.com";

        // Sender's email ID
        String from = "bhejnewala@gmail.com";

       
        String host = "smtp.gmail.com";

        
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("@gmail.com", "Sender");

            }

        });

        
        session.setDebug(true);

        try {
            
            MimeMessage message = new MimeMessage(session);

            
            message.setFrom(new InternetAddress(from));

            
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            
            message.setSubject("");

            
            message.setText("Tera Message !");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}