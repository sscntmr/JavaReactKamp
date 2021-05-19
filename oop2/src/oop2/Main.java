package oop2;

public class Main {

	public static void main(String[] args) {
		/*LogManager logManager = new LogManager(); // Kötü kodun örnek kullanimi
		logManager.log(2);*/ 
		
		CustomerManager customerManager = new CustomerManager();
		
		FileLogger fileLogger = new FileLogger();
		customerManager.add(fileLogger);
		customerManager.add(new EmailLogger());

	}

}
