package com.wakanda.util;

import java.util.Properties;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class TunnelMaker {

	public static void main(String[] args) {
		makeTunnel();
	}
	
	public static void makeTunnel() {
		String URL="";
		try {
			RestTemplate template=new RestTemplate();
			JsonNode node=template.getForObject("http://localhost:4040/api/tunnels", JsonNode.class);
			 URL=node.get("tunnels").get(0).get("public_url").toString();
			System.out.println(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!URL.isEmpty()) {
		Properties prop = new Properties();
		/*
		 * prop.put("mail.smtp.auth", true); prop.put("mail.smtp.starttls.enable",
		 * "true"); prop.put("mail.smtp.host", "smtp.mailtrap.io");
		 * prop.put("mail.smtp.port", "25"); prop.put("mail.smtp.ssl.trust",
		 * "smtp.mailtrap.io");
		 */
		
	       prop.put("mail.smtp.host", "smtp.gmail.com");    
	          prop.put("mail.smtp.socketFactory.port", "465");    
	          prop.put("mail.smtp.socketFactory.class",    
	                    "javax.net.ssl.SSLSocketFactory");    
	          prop.put("mail.smtp.auth", "true");    
	          prop.put("mail.smtp.port", "465");   
		
		Session session = Session.getInstance(prop, new Authenticator() {
		    @Override
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication("wakandaboard@gmail.com", "ackeuazsxnkgkqjx");
		    }
		});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("wakandaboard@gmail.com"));
			message.setRecipients(
			  Message.RecipientType.TO, InternetAddress.parse("wakandaboard@gmail.com"));
			message.setSubject("ScoreBoard Reading");

			String msg = URL;

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);

			message.setContent(multipart);

			Transport.send(message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
