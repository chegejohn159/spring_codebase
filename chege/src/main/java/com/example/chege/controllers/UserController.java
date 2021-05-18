package com.example.chege.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.chege.models.User;
import com.example.chege.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService ser;
	
	@RequestMapping("/")
	public String createuser() {
		return "CreateUser";
		}
	
	@RequestMapping(value="/suser", method=RequestMethod.POST)
	public String saveuser(@ModelAttribute("user") User user, ModelMap umap) {
	
			User usersaved = ser.SaveUser(user);
			String meso="User Saved with ID:" + usersaved.getId();
			umap.addAttribute("meso", meso);
		
		return "login";
		}
	@RequestMapping("/luser")
	public String showusers(ModelMap umap) {
	List<User> allusers = ser.getAllUsers();
	umap.addAttribute("allusers", allusers); 
		
		return "showusers";
	}
	@RequestMapping("/duser")
	public String deleteuser(@RequestParam("id") int id,ModelMap umap ) {
		User user=new User();
		user.setId(id);
		ser.DeleteUser(user);
		List<User> allusers = ser.getAllUsers();
		umap.addAttribute("allusers", allusers); 
		return "showusers";
		}
	@RequestMapping("/suuser")
	public String showupdateuser(@RequestParam("id") int id,ModelMap umap ) {
		User user = ser.getUserById(id);
		umap.addAttribute("user",user);
		
		
		return "edituser";
	}
	@RequestMapping("/uuser")
	public String updateuser(@ModelAttribute("location") User user,ModelMap umap) {
		ser.UpdateUser(user); 
		List<User> allusers = ser.getAllUsers();
		umap.addAttribute("allusers", allusers); 
		
		return "showusers";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginuser(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap umap) {
		
		User user = ser.finduserbyemail(email);
		if (user.getPassword().equals(password)) {
			List<User> allusers = ser.getAllUsers();
			
			umap.addAttribute("allusers", allusers); 
			return "showusers";
		}
		else {
			umap.addAttribute("msg", "wrong credential");
		}
		
		return "login";
		}

}
