package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.CategorysDao;
import AppleShop.Dao.MenuDao;
import AppleShop.Dao.ProductsDao;
import AppleShop.Dao.SlidesDao;
import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Menus;
import AppleShop.Entity.Slides;
@Service
public  class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	
	
	public List<Slides> GetDataSlide() {		
		return slidesDao.GetDataSlide();
	}
	
	public List<Categorys> GetDataCategorys() {
		return categorysDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}
}
