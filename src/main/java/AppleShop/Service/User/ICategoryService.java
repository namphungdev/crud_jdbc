package AppleShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Customer;

@Service
public interface ICategoryService {
	public List<ProductsDto> GetAllProductsByID(int id);
	
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage);
	
	public List<Categorys> GetDataCategorys();

	public List<Categorys> findAll();
	public Categorys findById(int id); 	    
	public void save(Categorys category);  
	public void delete(int id);

	public void update(Categorys category);
}
 