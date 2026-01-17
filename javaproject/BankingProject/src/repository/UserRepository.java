package repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import entities.User;

public class UserRepository {
	private static Set<User> users = new HashSet<>();
	
	static {
//		User user1 = new User();
//		user1.setUsername("admin");
//		user1.setUsername("password");
		User user1 = new User("admin", "admin", "admin", 0.0, 1234);
		User user2 = new User("user2", "user2", "user", 1000.0, 12345);
		User user3 = new User("user3", "user3", "user", 2000.0, 12346);
		User user4 = new User("user4", "user4", "user", 3000.0, 123467);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
	}
	public void printUsers() {
		System.out.println(users);
	}
	
	public User login(String username, String password) {
		List<User> finalUsers = users.stream()
				.filter(user-> user.getUsername().equals(username) && user.getPassword().equals(password))
		.collect(Collectors.toList());
		if(!finalUsers.isEmpty()) {
			return finalUsers.get(0);
		}else {
			return null;
		}
	}
	
}
