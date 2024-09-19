package GPA;

public class Grade {
	private String subjectname;
	private int marks;
	private double gradePoint;

	public Grade(String subjectname, int marks) {
		this.subjectname = subjectname;
		this.marks = marks;
		this.gradePoint = calculategradePoint(marks);
	}

	private double calculategradePoint(int marks) {
		if (marks >= 90) {
			return 10.0;
		} 
		else if (marks >= 80) {
			return 9.0;
		} 
		else if (marks >= 70) {
			return 8.0;
		} 
		else if (marks >= 60) {
			return 6.0;
		} 
		else if (marks >= 50) {
			return 5.0;
		} 
		else if (marks >= 40) {
			return 6.0;
		} 
		else {
			return 0.0;
		}
	}

	public double getgradePoint() {
		return gradePoint;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public int getMarks() {
		return marks;
	}
}
