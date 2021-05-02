package InterfaceAbstract;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("add database : "+customer.getName());
	}

}
