package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class UserManager extends BaseCustomerManager {

	 ICustomerCheckService iCustomerCheckService;
	
	public UserManager(ICustomerCheckService iCustomerCheckService) {
		
		this.iCustomerCheckService = iCustomerCheckService;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
		if(iCustomerCheckService.ChekIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println(" eklenmedi ");
		}
		
	}

}
