package AppleShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import AppleShop.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto GetProductByID(long id);
	
	//public List<ProductsDto> GetProductByNameAndId_color(String name_product, int id_color);
	
	public List<ProductsDto> GetProductByCategory(int id);	
	
	
	/* admin */
	public List<ProductsDto> findAll();
	public ProductsDto findById(int id);
	public void save(ProductsDto products);
//	public ProductsDto viewProductfindById(int id);

	public void update(ProductsDto products);
	
	
}
