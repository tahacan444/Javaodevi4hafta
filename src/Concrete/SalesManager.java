package Concrete;

import Abstract.ISalesManager;
import Entities.Sales;

public class SalesManager implements ISalesManager {

	@Override
	public void pricing(Sales sales) {
		// TODO Auto-generated method stub
		System.out.println("Fiyat belirlendi : " + sales.getSalesAmount());
		
	}

}
