package com.taskflowpro.api.service;

import com.taskflowpro.api.entity.User;
import com.taskflowpro.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;

	@Autowired
	public BCryptPasswordEncoder bCryptPasswordEncoder;

	public User saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}