package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Menus;
import AppleShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus() ;
	public List<ProductsDto> GetDataProducts() ;
}
