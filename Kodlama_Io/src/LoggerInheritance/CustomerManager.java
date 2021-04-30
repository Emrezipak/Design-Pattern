package LoggerInheritance;

public class CustomerManager {
	
	private Logger logger;

	public CustomerManager(Logger logger) {
		this.logger = logger;
	}


	public void logger(String message) {
		this.logger.log(message);
		this.logger.download();
	}

}
