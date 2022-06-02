package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.ProductsDao;
import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Customer;
@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	ProductsDao productsDao = new ProductsDao();
	
	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> listProducts = productsDao.GetProductByID(id);	
		return listProducts.get(0);
	}

	@Override
	public List<ProductsDto> GetProductByCategory(int id) {
		
		return productsDao.GetAllProductsByID(id);
	}
//	
//	@Override
//	public List<ProductsDto> GetProductByNameAndId_color(String name_product, int id_color) {
//		return  productsDao.GetProductByNameAndId_color(name_product, id_color);
//	}
	
	/* admin */
	@Override
	  public List<ProductsDto> findAll() {
	    return productsDao.findAll();
	  }
	@Override
	  public ProductsDto findById(int id) {
	    return productsDao.findById(id);
	  }

	@Override
	public void save(ProductsDto products) {
		 productsDao.save(products);
	}
	@Override
	public void update(ProductsDto products) {
		productsDao.update(products);
	}
//	@Override
//	public ProductsDto viewProductfindById(int id) {
//		return productsDao.viewProductfindById(id);
//	}

	

	
}
