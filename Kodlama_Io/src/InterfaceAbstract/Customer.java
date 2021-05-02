package InterfaceAbstract;

import java.util.Date;

public class Customer {
	
	private int id;
	private String name;
	private String surname;
	private String nationalityId;
	private int age;
	public Customer(int id, String name, String surname, String nationalityId, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
