package cafeProject;

import java.time.LocalDate;

import cafeProject.Abstract.BaseCustomerManager;
import cafeProject.Adapters.MernisServiceAdapter;
import cafeProject.Concrete.NeroCustomerManager;
import cafeProject.Concrete.StarbucksCustomerManager;
import cafeProject.Entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(2,"Furkan","Özpolat",LocalDate.of(1952, 11, 21),"12345678910"));
		
		BaseCustomerManager starbuckCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbuckCustomerManager.save(new Customer(1,"Ahmet","Özpolat",LocalDate.of(1975, 10, 12),"153485234"));
	}

}
