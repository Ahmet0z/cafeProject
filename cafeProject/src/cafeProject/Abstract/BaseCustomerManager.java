package cafeProject.Abstract;

import cafeProject.Entities.Customer;

public abstract class BaseCustomerManager  implements CustomerService {
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}
}
