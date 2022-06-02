package AppleShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AppleShop.Dto.ProductsDto;
import AppleShop.Entity.Customer;
import AppleShop.Service.User.ICategoryService;
import AppleShop.Service.User.IComboService;
import AppleShop.Service.User.IProductService;
import AppleShop.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController {
	
	@Autowired
	private IProductService _productService;
	@Autowired
	private ICategoryService _iCategoryService;
	@Autowired
	private IComboService _iComboService;
	
	//private ProductServiceImpl productService;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _productService.GetProductByID(id));
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		int idCategory = _productService.GetProductByID(id).getId_category();
		_mvShare.addObject("productByIDCategory", _productService.GetProductByCategory(idCategory));
		return _mvShare;	
	}
	
	/* Admin */
	@RequestMapping(value={"/home_admin/product_list"})
	  public String listProduct(Model model) {
	    model.addAttribute("listProduct", _productService.findAll());    
	    return "admin/product_list";
	  }
	@RequestMapping("/home_admin/product_save")
	  public String insertProduct(Model model) {
	    model.addAttribute("product", new ProductsDto());
	    model.addAttribute("categorys", _homeService.GetDataCategorys());
	    model.addAttribute("sizes", _iComboService.GetDataSizes());
	    model.addAttribute("capacitys", _iComboService.GetDataCapacitys());
	    model.addAttribute("colors", _iComboService.GetDataColors());
	    return "admin/product_save";
	  }
	  @RequestMapping("/home_admin/product_view/{id}")
	  public String viewProduct(@PathVariable int id, Model model) {
		  ProductsDto product = _productService.findById(id);
	    model.addAttribute("product", product);
	    return "admin/product_view";
	  }
	  
	  @RequestMapping("/home_admin/product_update/{id}")
	  public String updateProduct(@PathVariable int id, Model model) {
		  ProductsDto product = _productService.findById(id);
	    model.addAttribute("product", product);
	    model.addAttribute("categorys", _homeService.GetDataCategorys());
	    model.addAttribute("sizes", _iComboService.GetDataSizes());
	    model.addAttribute("capacitys", _iComboService.GetDataCapacitys());
	    model.addAttribute("colors", _iComboService.GetDataColors());
	    return "admin/product_update";
	  }
	  @RequestMapping("/home_admin/saveProduct")
	  public String doSaveProduct(@ModelAttribute("products") ProductsDto products, Model model) {
		  _productService.save(products);
	    model.addAttribute("listProduct", _productService.findAll());
	    return "admin/product_list";
	  }
	  @RequestMapping("/home_admin/updateProduct")
	  public String doUpdateProduct(@ModelAttribute("product") ProductsDto products, Model model) {
		  _productService.update(products);
	    model.addAttribute("listProduct", _productService.findAll());
	    return "admin/product_list";
	  }
	  
//	  @RequestMapping("/customerDelete/{id}")
//	  public String doDeleteCustomer(@PathVariable int id, Model model) {
//	    customerService.delete(id);
//	    model.addAttribute("listCustomer", customerService.findAll());
//	    return "admin/customer-list";
//	  }

}
