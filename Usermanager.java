package GPA;

public class Usermanager {
	private User[] users;//
	private int usercount;
	User loggedinUser;

	public Usermanager(int a) {
		users = new User[a];//0
		usercount = 0;
		loggedinUser = null;
	}

	public void signUp(String username, String userId, String password) {
		if (usercount < users.length) {
			users[usercount] = new User(username, userId, password);
			usercount++;//2
			System.out.println("Sign-up successfully!");
		}
		else {
			System.out.println("Can't sign up more users.");
		}
	}

	public void login(String userId, String password) {
		for (int i = 0; i < usercount; i++) {
			//System.out.println(users[i].getUserId()+" "+userId);
			//System.out.println();
			if (users[i].getUserId().equals(userId) && users[i].checkPassword(password))
			{
				System.out.println("Login successful!");
				loggedinUser = users[i];//
			//return;

			} 
			else {
				System.out.println("Login failed. Incorrect user ID or password.");
			}
		}
	}

	public void changePassword(String newPassword) {
		if (loggedinUser != null) {
			loggedinUser.setPassword(newPassword);
			System.out.println("Password changed successfully!");
		} 
		else {
			System.out.println("No details found");
		}
	}

	public void logout() {

		System.out.println("Logged out successfully!");
	}
}
