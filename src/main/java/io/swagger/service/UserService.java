package io.swagger.service;

public interface UserService {
	public String loginUser(String username, String password);
	public Void logoutUser();
}
