package GPA;

public class User {
	private String username;
	private String userId;
	private String password;

	public User(String username, String userId, String password) {
		this.username = username;
		this.userId = userId;//123,456,987=987
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getUserId() {
		return userId;
	}

	public boolean checkPassword(String password) {
		//System.out.println(this.password+" "+password);//987
		return this.password.equals(password);//987==987
	}

	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
}
