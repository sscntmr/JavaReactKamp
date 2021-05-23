package oop4CoffeeShop;

import oop4CoffeeShop.Adapters.MernisServiceAdapter;
import oop4CoffeeShop.Entities.Customer;
import oop4CoffeeShop.Entities.Abstracts.BaseCustomerManager;
import oop4CoffeeShop.Entities.Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(new Customer(1, "SAADET SENA ","ÇÝNTÝMUR", 2000, "55533354867"));
	}

}
