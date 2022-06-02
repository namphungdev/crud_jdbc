package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import AppleShop.Dao.CustomerDAO;
import AppleShop.Entity.Customer;
@Service
@Transactional
@Component
public class CustomerService implements ICustomerService{

	@Autowired
	  private CustomerDAO customerDAO;
	@Override
	  public List<Customer> findAll() {
	    return customerDAO.findAll();
	  }
	@Override
	  public Customer findById(int id) {
	    return customerDAO.findById(id);
	  }
	@Override
	  public void save(Customer customer){
	    // validate business
	    customerDAO.save(customer);
	  }
	@Override
	  public void update(Customer customer){
	    // validate business
	    customerDAO.update(customer);
	  }
	@Override
	  public void delete(int id){
	    // validate business
	    customerDAO.delete(id);
	  }

}
