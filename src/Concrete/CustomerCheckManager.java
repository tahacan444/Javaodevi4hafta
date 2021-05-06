package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
