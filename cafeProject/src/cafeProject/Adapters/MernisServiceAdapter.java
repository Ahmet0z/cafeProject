package cafeProject.Adapters;

import java.rmi.RemoteException;

import cafeProject.Abstract.PersonCheckService;
import cafeProject.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {
	boolean result;
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			result = proxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			result = false;
			System.out.println("Clientte hata");
			e.printStackTrace();
		}
		return result;
		
		
	}

}
