package LoggerInheritance;

public class FileLogger extends Logger {
	
	public void log(String message) {
		System.out.println("File log : "+message);
	}

	@Override
	public void download() {
		System.out.println("Completed download file");
	}
	
	

}
