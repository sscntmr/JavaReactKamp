package oop4CoffeeShop.Entities.Concrete;

import oop4CoffeeShop.Entities.Customer;
import oop4CoffeeShop.Entities.Abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
