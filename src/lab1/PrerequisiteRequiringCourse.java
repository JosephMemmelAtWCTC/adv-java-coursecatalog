package lab1;

import javax.swing.*;

public abstract class PrerequisiteRequiringCourse extends Course{

	String prerequisites;

	public PrerequisiteRequiringCourse(String courseName, String courseNumber) {
		super(courseName, courseNumber);
	}


	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		if (prerequisites == null || prerequisites.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Error: prerequisites cannot be null of empty string");
			System.exit(0);
		}
		this.prerequisites = prerequisites;
	}

}
