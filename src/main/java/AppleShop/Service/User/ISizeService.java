package AppleShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import AppleShop.Entity.Size;

@Service
@Repository
public interface ISizeService {
	  public List<Size> findAll();
	  public Size findById(int id); 	    
	  public void save(Size size);  
	  public void update(Size size);	  
	  public void delete(int id);
}
