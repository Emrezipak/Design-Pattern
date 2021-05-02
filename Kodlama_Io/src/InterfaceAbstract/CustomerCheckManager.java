package InterfaceAbstract;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkService(Customer customer) {
		
		if(customer.getAge()>17) {
			return true;
		}
		return false;
	}

}
