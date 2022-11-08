
package lab2;

import lab1.AdvancedJavaCourse;
import lab1.Course;
import lab1.IntroJavaCourse;
import lab1.IntroToProgrammingCourse;
import lab1.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */

public class Driver {

	public static void main(String args[]){

		/*The advantage of doing it like this is that everything can be stored together so
		there can be one list to store everything, however, it makes it trickier to call more
		unique operations without causing a crash. As long as nothing new is added to the
		implementation by the children then this is perfect but if not then you might need messy
		checks to avoid crashing*/

		lab1.Course[] courses = new lab1.Course[3];

		courses[0] = new IntroToProgrammingCourse("IntoToProgramming", "42");
		courses[1] = new IntroJavaCourse("IntroJava", "43");
		courses[2] = new lab1.AdvancedJavaCourse("AdvancedJava1", "44");

		System.out.println();
		for (int i = 0; i < courses.length; i++) {
			Course course = courses[i];
			course.setCredits(3);
			if(course instanceof PrerequisiteRequiringCourse){
				((PrerequisiteRequiringCourse) course).setPrerequisites(courses[0].getCourseName());
			}
			if(course.getClass() == AdvancedJavaCourse.class){
				((PrerequisiteRequiringCourse) course).setPrerequisites(courses[1].getCourseName());
			}

			System.out.println(course.getCourseName()+" "+course.getCourseNumber()+" "+course.getCredits()+" "+course.getClass());
		}
	}


}
