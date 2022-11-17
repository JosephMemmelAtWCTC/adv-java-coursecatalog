
package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */

public class Driver {

	public static void main(String args[]){

		/*For the architecture relating to abstraction and inheritance, this project I think
		it is good that because they are so similar to each other that once I created the Course
		class I was also able to extend that with PrerequisiteRequiringCourse and then extend
		that again for the others that needed it. The bad that I thought of the way I did it is
		that there are subclasses of superclasses with only a call to super, if everything is the
		same I wounder why we even need different classes aka IntroJavaCourse and AdvancedJavaCourse
		if they have the exact same contents and the only difference is the name.*/

		Course[] courses = new Course[3];
		/*The advantage of doing it like this is that everything can be stored together so
		there can be one list to store everything, however, it makes it trickier to call more
		unique operations without causing a crash. As long as nothing new is added to the
		implementation by the children then this is perfect but if not then you might need messy
		checks to avoid crashing*/

		courses[0] = new IntroToProgrammingCourse("IntoToProgramming", "42");
		courses[1] = new IntroJavaCourse("IntroJava", "43");
		courses[2] = new AdvancedJavaCourse("AdvancedJava1", "44");

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
