package AppleShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import AppleShop.Entity.Customer;

@Service
@Repository
public interface ICustomerService {
	  public List<Customer> findAll();
	  public Customer findById(int id); 	    
	  public void save(Customer customer);  
	  public void update(Customer customer);	  
	  public void delete(int id);
}
