package cafeProject.Abstract;

import cafeProject.Entities.Customer;

public interface PersonCheckService {
	boolean checkIfRealPerson(Customer customer);
}
