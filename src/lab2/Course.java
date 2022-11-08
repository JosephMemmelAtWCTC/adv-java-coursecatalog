package lab2;

import javax.swing.*;

public abstract interface Course {


	//GETTERS
	public String getCourseName();
	public String getCourseNumber();
	public double getCredits();

	//SETTERS
	public void setCourseName(String courseName);
	public void setCourseNumber(String courseNumber);
	public void setCredits(double credits);

}
