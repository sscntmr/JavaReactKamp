package oop4CoffeeShop.Entities.Concrete;
import oop4CoffeeShop.Entities.Customer;
import oop4CoffeeShop.Entities.Abstracts.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db:" + customer.getFirstname());
		
	}

}
