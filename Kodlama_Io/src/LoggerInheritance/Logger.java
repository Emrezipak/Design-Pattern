package LoggerInheritance;

public abstract class Logger {
	
	public abstract void log(String message);
	
	public void download() {
		System.out.println("Default download..");
	}
}
