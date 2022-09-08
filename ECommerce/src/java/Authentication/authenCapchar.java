/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

import static java.lang.ProcessBuilder.Redirect.to;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;
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
 * @author vinh2
 */
public class authenCapchar {

    public void sendMail(String recipient, String capchar, String doWhat) throws MessagingException {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String acc = "vinh2312001@gmail.com";
        String pass = "MylovE2710";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(acc, pass);
            }
        });
        Message mess = prepareMessage(session, acc, recipient, capchar, doWhat);
        Transport.send(mess);
    }

    private Message prepareMessage(Session session, String acc, String recipient, String capchar, String doWhat) throws AddressException, MessagingException {
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(acc));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        if (doWhat.equalsIgnoreCase("generateCapchar")) {
            msg.setSubject("Verify code from E-shopper");
            msg.setText("There is your capchar: " + capchar + "\nPls, don't share to anyone");
        } else {
            msg.setSubject("Set new password");
            msg.setText("There is your new password: " + capchar + "\nPls, don't share to anyone, you can login and change password");
        }

        return msg;
    }

    public void sendMailDiscount(String recipient, String sendWhat) throws MessagingException {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String acc = "vinh2312001@gmail.com";
        String pass = "MylovE2710";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(acc, pass);
            }
        });
        Message mess = prepareMessageDiscount(session, acc, recipient, sendWhat);
        Transport.send(mess);
    }

    private Message prepareMessageDiscount(Session session, String acc, String recipient, String sendWhat) throws AddressException, MessagingException {
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(acc));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        msg.setSubject("Discount for you from EShopper");
        msg.setText(sendWhat);
        return msg;
    }

    public String createAnCapchar() {
        int min = 100000;
        int max = 999999;
        return (Math.random() * (max - min + 1) + min) + "";
    }

    public String generatePassword(int length) {
        //minimum length of 8
        if (length < 3) {
            length = 8;
        }

        final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        final char[] uppercase = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
        final char[] numbers = "0123456789".toCharArray();
        final char[] allAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789".toCharArray();

        //Use cryptographically secure random number generator
        Random random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length - 3; i++) {
            password.append(allAllowed[random.nextInt(allAllowed.length)]);
        }

        //Ensure password policy is met by inserting required random chars in random positions
        password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
        password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
        password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
        return password.toString();
    }
}
