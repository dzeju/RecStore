package io.swagger.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Override
	public String loginUser(String username, String password) {
		if (username.equals("admin") && password.equals("admin"))
			return "bueno";
		else return "no bueno";
	}

	@Override
	public Void logoutUser() {
		return null;
	}

}
