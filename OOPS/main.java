package GPA;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Usermanager ob = new Usermanager(10);
		
		while (true) {
			System.out.println("WELCOME");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int a = scanner.nextInt();
			scanner.nextLine();

			if (a == 1) {

				System.out.print("Enter username: ");
				String username = scanner.nextLine();
				System.out.print("Enter user ID: ");
				String userId = scanner.nextLine();
				System.out.print("Enter password: ");
				String password = scanner.nextLine();
				System.out.print("Re-enter password: ");
				String confirmPassword = scanner.nextLine();

				if (password.equals(confirmPassword)) {
					ob.signUp(username, userId, password);
				} else {
					System.out.println("Passwords do not match. Sign-up failed.");
				}
			} 
			else if (a == 2) {

				System.out.print("Enter user ID: ");
				String userId = scanner.nextLine();
				System.out.print("Enter password: ");
				String password = scanner.nextLine();

				ob.login(userId, password);

				if (ob.loggedinUser != null) {
					while (true) {
				
						System.out.println("1. Change Password");
						System.out.println("2. Calculate GPA");
						System.out.println("3. Logout");
						System.out.print("Enter your choice: ");
						int loginChoice = scanner.nextInt();
						scanner.nextLine();

						if (loginChoice == 1) {

							System.out.print("Enter new password: ");
							String newPassword = scanner.nextLine();
							ob.changePassword(newPassword);
						} 
						else if (loginChoice == 2) {

							System.out.print("Enter the number of subjects: ");
							int numberOfSubjects = scanner.nextInt();
							scanner.nextLine();

							Student obj = new Student(numberOfSubjects);

							for (int i = 0; i < numberOfSubjects; i++) {
								System.out.print("Enter the name of subject " + (i + 1) + ": ");
								String subjectname = scanner.nextLine();

								System.out.print("Enter the marks for " + subjectname + ": ");
								int marks = scanner.nextInt();
								scanner.nextLine();

								Grade grade = new Grade(subjectname, marks);
								obj.addGrade(i, grade);
							}

							System.out.println("Student's Grades:");
							obj.displayGrades();

							System.out.println("GPA: " + obj.calculateGPA());
						} 
						else if (loginChoice == 3) {

							ob.logout();
							break;
						} 
						else {
							System.out.println("Invalid choice. Please try again.");
						}
					}
				}
			} 
			else if (a == 3) {
				System.out.println("THANK YOU");
				break;
			} 
			else {
				System.out.println("Invalid choice. Please try again.");
			}
		}

	}
}
