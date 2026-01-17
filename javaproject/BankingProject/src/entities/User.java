package entities;

import java.util.Objects;

public class User {
	private String username;
	private String password;
	private String role;
	private double balanceAmount;
	private int contactNumber;
	
	// parameterized constructor
	
	public User(String username, String password, String role, double balanceAmount, int contactNumber) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.balanceAmount = balanceAmount;
		this.contactNumber = contactNumber;
	}
	
	// Getter and Setter
		public String getUsername() {
			return username;
		}
		
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	// toString
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + ", balanceAmount="
				+ balanceAmount + ", contactNumber=" + contactNumber + "]";
	}

	
	// equals method
	
	@Override
	public int hashCode() {
		return Objects.hash(contactNumber, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return contactNumber == other.contactNumber && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	

	
}
