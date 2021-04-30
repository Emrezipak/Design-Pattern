package KodlamaIoWeb;

import java.util.ArrayList;

public class Student extends User{

	private Course [] course;

	public Student(String name, String surname, String email, Course [] course) {
		super(name, surname, email);
		this.course = course;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

	

	
	
	

}
