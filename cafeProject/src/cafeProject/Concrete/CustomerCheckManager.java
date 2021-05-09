package cafeProject.Concrete;

import cafeProject.Abstract.PersonCheckService;
import cafeProject.Entities.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
