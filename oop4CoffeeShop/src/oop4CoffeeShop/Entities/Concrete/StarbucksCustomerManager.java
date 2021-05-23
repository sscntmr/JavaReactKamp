package oop4CoffeeShop.Entities.Concrete;

import oop4CoffeeShop.Entities.Customer;
import oop4CoffeeShop.Entities.Abstracts.BaseCustomerManager;
import oop4CoffeeShop.Entities.Abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
		
		
	}
	@Override
	public void Save(Customer customer) {
		
	if(this.customerCheckService.checkIfRealPerson(customer)) {	
		System.out.println("Save to db:" + customer.getFirstname());
		
	}

	else {
		System.out.println("Not a valid person.");
	}
}
}