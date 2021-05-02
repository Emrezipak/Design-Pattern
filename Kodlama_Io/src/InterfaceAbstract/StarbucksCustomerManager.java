package InterfaceAbstract;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService checkCustomer;

	public StarbucksCustomerManager(CustomerCheckService checkCustomer) {
		this.checkCustomer = checkCustomer;
	}

	@Override
	public void save(Customer customer) {
		
		if(checkCustomer.checkService(customer)) {
			super.save(customer);
		}
		else {
			throw new NullPointerException("18 yaþýndan küçük");
		}
	}

	
	

}
