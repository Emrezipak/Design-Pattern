package KodlamaIoWeb;

public class StudentManager {
	
	public void showCourses(Student student) {
		System.out.println("****************");
		System.out.println("Kayıtlı kurslar");
		for(Course student1:student.getCourse()) {
			System.out.println(student1.getKursAdi());
		}
	}
	
	public void signCourse(Student student) {
		System.out.println(student.getName()+" kurs kaydı yapılmıştır...");
	}

}
