package KodlamaIoWeb;

import java.util.ArrayList;

public class InstructorManager {
	
	public void addCourse(Instructor instructor,String courseName) {
		System.out.println(courseName+" isimli kurs "
	    +instructor.getName()+" taraf�ndan eklenmi�tir...");
	
	}
	
	public void addExam(Instructor instructor) {
		System.out.println(instructor.getName()+" isimli e�itmen �devi ekledi...");
	}

}
