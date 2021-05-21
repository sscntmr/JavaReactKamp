package oop3;

public class CustomerManager {
	
	private Logger[] loggers ;
	  
    public CustomerManager(Logger[] loggers) {
    	this.loggers=loggers;
    }
    
	
	public void add(Customer customer) {	//loosy(gevþek) - tightly(katý) coupled
		
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
	     Utils.runLoggers(loggers, customer.getLastName());
		//Utils utils=new Utils();
		//utils.runLoggers(loggers, customer.getLastName());  --> bu new lemeyi Utils de static yapmazsak yapacaktýk.
}
	public void delete(Customer customer) {
		
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		 Utils.runLoggers(loggers, customer.getLastName());
	}
	
}