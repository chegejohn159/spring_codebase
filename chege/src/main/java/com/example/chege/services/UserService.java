package com.example.chege.services;

import java.util.List;

import com.example.chege.models.User;

public interface UserService {
	User SaveUser(User user);
	User UpdateUser(User user);
	void DeleteUser(User user);
	User getUserById(int id);
	List<User> getAllUsers();
	User finduserbyemail(String email);

}
