package service;

import entities.User;
import repository.UserRepository;

public class UserService {
	UserRepository userRepository = new UserRepository();
	public void printUsers() {
		userRepository.printUsers();
	}
	
	public User login(String username, String password) {
		return userRepository.login(username, password);
	}
}
