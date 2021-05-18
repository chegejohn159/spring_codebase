package com.example.chege.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {
	@Autowired
	private JavaMailSender sender;
	@Override
	public void sendEmail(String toadd, String subject, String body) {
		// TODO Auto-generated method stub
		MimeMessage meso=sender.createMimeMessage();
		MimeMessageHelper help= new MimeMessageHelper(meso);
		try {
			help.setTo(toadd);
			help.setSubject(subject);
			help.setText(body);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sender.send(meso);
		

	}

}
