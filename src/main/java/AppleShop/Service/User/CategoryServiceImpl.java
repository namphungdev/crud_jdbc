package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.CategorysDao;
import AppleShop.Dao.CustomerDAO;
import AppleShop.Dao.ProductsDao;
import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Customer;
@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	 private ProductsDao productsDao;
	@Autowired
	 private CategorysDao categorysDao;


	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
	
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage) {
		return productsDao.GetDataProductsPaginate( id, start, totalPage);
	}
	

	public List<Categorys> GetDataCategorys(){
		return categorysDao.GetDataCategorys();
		
	}
	
	
	//admin
	@Override
	  public List<Categorys> findAll() {
	    return categorysDao.findAll();
	  }
	@Override
	  public Categorys findById(int id) {
	    return categorysDao.findById(id);
	  }
	@Override
	  public void save(Categorys category){
	    // validate business
		categorysDao.save(category);
	  }
	
	@Override
	  public void delete(int id){
	    // validate business
		categorysDao.delete(id);
	  }
	@Override
	public void update(Categorys category) {
		categorysDao.update(category);
		
	}


}
