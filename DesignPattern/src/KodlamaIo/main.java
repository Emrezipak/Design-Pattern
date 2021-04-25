package KodlamaIo;

public class main {

	public static void main(String[] args) {
		
    StudentClass [] student= {
				new StudentClass("Emre","Zipak","2244144141"),
				new StudentClass("Hakan","Arslan","3424224222")
		};
		
			
	 for(StudentClass student1: student) {
		System.out.print(student1.name+" ");
		System.out.print(student1.surname+" ");
		System.out.print(student1.studentNumber+" \n");
	   }
		
	StudentManager studentManager=new StudentManager();
	studentManager.Add(new StudentClass("emre","zipak","13141414141"));
	studentManager.Delete(new StudentClass("Yunus emre","zipak","13141414141"));

	}

}
