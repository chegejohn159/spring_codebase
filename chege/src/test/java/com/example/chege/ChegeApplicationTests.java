package com.example.chege;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.chege.models.User;
import com.example.chege.repos.UserRepository;
import com.example.chege.utils.EmailUtil;

@SpringBootTest
class ChegeApplicationTests {

	@Autowired
	private UserRepository userrepository;
	@Autowired
	private EmailUtil eutil;

	@Test
	public void testcreateuser(){
		User user=new User();
		user.setName("Leah");
		user.setEmail("leah@gmail.com");
		userrepository.save(user);


	}
	@Test
	public void testcreateuser2(){
		User user=new User();
		user.setName("Lily");
		user.setEmail("lilian@gmail.com");
		user.setPassword("20202020");
		userrepository.save(user);


	}
	@Test
	public void testemailsending() {
		eutil.sendEmail("ngugigeorge697@gmail.com", "Sasa George", "This message was sent from a spring application by chege hahahahaha");
	}

}
