package InterfaceAbstract;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		BaseCustomerManager baseManager=new NeroCustomerManager(new CustomerCheckManager());
		baseManager.save(new Customer(1,"Emre","zipak","22342444114",16));

	}

}
