package oop4CoffeeShop.Entities;
import oop4CoffeeShop.Entities.Abstracts.Entity;

public class Customer implements Entity {	
	

	private int id;
    private String firstname;
    private  String lastname;
    private  int timeOfBirth;
    private String nationalityId;	
    
    public Customer(int id, String firstname, String lastname, int timeOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.timeOfBirth = timeOfBirth;
		this.nationalityId = nationalityId;
	}
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(int timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


}
