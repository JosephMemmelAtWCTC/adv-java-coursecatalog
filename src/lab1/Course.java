package lab1;

import javax.swing.*;

public abstract class Course {
	String courseName;
	String courseNumber;

	double credits;

	public Course(String courseName, String courseNumber){
		setCourseName(courseName);
		setCourseNumber(courseNumber);
	}

//GETTERS
	public final String getCourseName(){ return courseName; }
	public final String getCourseNumber(){ return courseNumber; }
	public final double getCredits() {
		return credits;
	}


	//SETTERS
	public final void setCourseName(String courseName) {
		if (courseName == null || courseName.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Error: courseName cannot be null of empty string");
			System.exit(0);
		}
		this.courseName = courseName;
	}

	public final void setCourseNumber(String courseNumber) {
		if (courseNumber == null || courseNumber.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Error: courseNumber cannot be null of empty string");
			System.exit(0);
		}
		this.courseNumber = courseNumber;
	}

	public final void setCredits(double credits) {
		if (credits < 0.5 || credits > 4.0) {
			JOptionPane.showMessageDialog(null,
					"Error: credits must be in the range 0.5 to 4.0");
			System.exit(0);
		}
		this.credits = credits;
	}

}
