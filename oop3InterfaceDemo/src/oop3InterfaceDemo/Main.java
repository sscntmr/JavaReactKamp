package oop3InterfaceDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		// customerManager.customerDal=new OracleCustomerDal(); --> veritabaný olarak bunu seçtim. Tüm iþlemler bunun üzerinden gerçekleþecek.
		customerManager.add();
	}

}
