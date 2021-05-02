package InterfaceAbstract;

public class NeroCustomerManager extends BaseCustomerManager {

	private CustomerCheckManager checkManager;
	
	public NeroCustomerManager(CustomerCheckManager checkManager) {
		this.checkManager = checkManager;
	}

	@Override
	public void save(Customer customer) {
		super.save(customer);
	}

	
	
}
