package LoggerInheritance;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
	  /*ArrayList<Logger> log=new ArrayList<Logger>();
	  log.add(new DatabaseLogger());
	  log.add(new EmailLogger());
	  log.add(new FileLogger());
	  
	  for(Logger logger:log) {
		  logger.log("Complete log");
	  }*/
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.logger("completed log");
	}

}
