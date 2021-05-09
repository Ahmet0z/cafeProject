package cafeProject.Concrete;

import cafeProject.Abstract.BaseCustomerManager;
import cafeProject.Abstract.PersonCheckService;
import cafeProject.Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private PersonCheckService checkService;
	
	public StarbucksCustomerManager(PersonCheckService checkService) {
		this.checkService=checkService;
	}
	
	
	@Override
	public void save(Customer customer) {
		
		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Geçersiz Bilgi girdiniz.");
		}
	}
	

}
