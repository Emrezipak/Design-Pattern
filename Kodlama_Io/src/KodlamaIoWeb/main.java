package KodlamaIoWeb;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Course [] course= {new Course("Java&React"), new Course("C#&Angular")};
		Student student=new Student("Emre","zipak","266262@gmail.com",course);
		Instructor instructor=new Instructor("Yunus Emre","zipak","dddd@gmail.com","Yazılım geliştirme uzmanı");
		
		UserManager userManager=new UserManager();
		userManager.login(student);
		userManager.login(instructor);
		StudentManager studentManager=new StudentManager();
		studentManager.showCourses(student);
		studentManager.signCourse(student);
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor,"Python");
		instructorManager.addExam(instructor);

	}

}
