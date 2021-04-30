package KodlamaIoWeb;

import java.util.ArrayList;

public class Instructor extends User {
	
	private String information;
	
	public Instructor(String name, String surname, String email,String information) {
		super(name, surname, email);
		this.information=information;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	

	
	




	

	
	
	

	
	

}
