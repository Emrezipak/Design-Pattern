package KodlamaIoWeb;

import java.util.ArrayList;

public class InstructorManager {
	
	public void addCourse(Instructor instructor,String courseName) {
		System.out.println(courseName+" isimli kurs "
	    +instructor.getName()+" tarafýndan eklenmiþtir...");
	
	}
	
	public void addExam(Instructor instructor) {
		System.out.println(instructor.getName()+" isimli eðitmen ödevi ekledi...");
	}

}
