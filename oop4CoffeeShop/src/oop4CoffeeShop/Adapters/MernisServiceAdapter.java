package oop4CoffeeShop.Adapters;
import java.rmi.RemoteException;
import java.util.Locale;

import oop4CoffeeShop.Entities.Customer;
import oop4CoffeeShop.Entities.Abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client =new KPSPublicSoapProxy() ;
		var result =true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstname().toUpperCase(new Locale("tr")),
					customer.getLastname().toUpperCase(new Locale("tr")),customer.getTimeOfBirth());
			
		}  catch (RemoteException e) {
		
			e.printStackTrace();
		}
		return result;
	}
}
