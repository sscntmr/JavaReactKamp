package oop3InterfaceDemo;

public class CustomerManager { // CustomerManager classýnýn

	ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) { // constructorýnýn bir ICustomerDal istiyorum.

		this.customerDal = customerDal; // burdaki this, ICustomerDal customerDal; bu deðiþkene atama yapmýþ oldu.

	}

	public void add() { // iþ kodlarý burda yazýlýr.
		// OracleCustomerDal oracleCustomerDal=new OracleCustomerDal(); --> Bunu yazarsak Oracle a baðlý kalmýþ oluruz.
		customerDal.Add();

	}
}
