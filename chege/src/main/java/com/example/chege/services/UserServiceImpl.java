package com.example.chege.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.chege.models.User;
import com.example.chege.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService { 
	
	@Autowired
	private UserRepository repo;


	@Override
	public User SaveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public void DeleteUser(User user) {
		// TODO Auto-generated method stub
		
		repo.delete(user);

	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
    @Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
    public User finduserbyemail(String email) {
    	return repo.findByEmail(email);
    }

	public UserRepository getRepo() {
		return repo;
	}

	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}

}
