package AppleShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AppleShop.Dto.PaginatesDto;
import AppleShop.Service.User.CategoryServiceImpl;
import AppleShop.Service.User.PaginatesServiceImpl;
@Controller
public class CategoryController extends BaseController {
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	@Autowired
	private PaginatesServiceImpl paginatesServiceImpl;
	
	private int totalProductsPage = 9;
	
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {		
		_mvShare.setViewName("user/products/category");		
		int totalData = categoryServiceImpl.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesServiceImpl.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginatesInfo", paginatesInfo);	
		_mvShare.addObject("productsPaginate", categoryServiceImpl.GetDataProductsPaginate(Integer.parseInt(id), paginatesInfo.getStart(), totalProductsPage));
		return _mvShare;	
	}
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id, @PathVariable String currentPage) {
		_mvShare.setViewName("user/products/category");		
		int totalData = categoryServiceImpl.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesServiceImpl.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginatesInfo", paginatesInfo);	
		_mvShare.addObject("productsPaginate", categoryServiceImpl.GetDataProductsPaginate(Integer.parseInt(id), paginatesInfo.getStart(), totalProductsPage));
		return _mvShare;	
	}
	
}
 