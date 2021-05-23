package oop4CoffeeShop.Entities.Abstracts;
import oop4CoffeeShop.Entities.Customer;


public abstract class BaseCustomerManager implements CustomerService {
	
	 public abstract void Save(Customer customer) ;

}
