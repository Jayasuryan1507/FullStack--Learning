package GPA;

public class Student {
	private Grade [] grades;
	private int numberofsubjects;

	public Student(int subjects) {
		this.numberofsubjects = subjects;
		this.grades = new Grade[subjects];
	}

	public void addGrade(int b, Grade grade) {
		grades[b] = grade;
	}

	public double calculateGPA() {
		double totalgradePoints = 0;
		for (int i = 0; i < numberofsubjects; i++) {
			totalgradePoints += grades[i].getgradePoint();
		}
		return totalgradePoints / numberofsubjects;
	}

	public void displayGrades() {
		for (int i = 0; i < numberofsubjects; i++) {
			Grade grade = grades[i];
			System.out.println("Subject: " + grade.getSubjectname() + "\n" + "Marks: " + grade.getMarks() + "\n"
					+ "Grade Point: " + grade.getgradePoint());
		}
	}
}
