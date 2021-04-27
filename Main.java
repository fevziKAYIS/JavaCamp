package fevzikayışjava;

import fevzikayışjava.Course;
import fevzikayışjava.CourseManagement;
import fevzikayışjava.intructor;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Java","2Ay","Engin Demirog");
		Course course2 = new Course(2, "Angular ve C#", "1 Ay ", "Engin dEM");
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.title);
			
		}
	
		System.out.println(courses.length);
		
		CourseManagement courseManagement = new CourseManagement();
		courseManagement.add(course1);
		courseManagement.update(course2);
		courseManagement.delete(course2);
		
		intructor intructor = new intructor();
		intructor.id=1;
		intructor.name="Engin Demirog";
		
		System.out.println(intructor.name);
	}

}
