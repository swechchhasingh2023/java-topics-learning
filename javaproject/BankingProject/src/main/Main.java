package main;

import java.util.Scanner;

import entities.User;
import service.UserService;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		System.out.print("Please enter username : ");
		String username = scanner.next();
		
		System.out.print("Please enter password : ");
		String password = scanner.next();
		
//		System.out.println(username + " " + password);
		
//		userService.printUsers();
		
		User users= userService.login(username, password);
		if(users !=null) {
			System.out.println("Logged in Successfully");		
		}else{
			System.out.println("Login in failed"); 
			
			
		}
		
		
	}


}
