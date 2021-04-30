package LoggerInheritance;

public class DatabaseLogger extends Logger {

	@Override
	public void log(String message) {
		System.out.println("Database log : "+message);
	}

	

}
