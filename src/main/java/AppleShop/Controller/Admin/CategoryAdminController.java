package AppleShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import AppleShop.Controller.User.BaseController;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Customer;
import AppleShop.Entity.Size;
import AppleShop.Service.User.CategoryServiceImpl;
@Controller
public class CategoryAdminController extends BaseController {
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@RequestMapping(value={"/home_admin/category_list"})
	  public String listCategory(Model model) {
	    model.addAttribute("listCategory", categoryServiceImpl.findAll());    
	    return "admin/category/category_list";
	  }
	  @RequestMapping("/home_admin/category_save")
	  public String insertCategory(Model model) {
	    model.addAttribute("category", new Categorys());
	    return "admin/category/category_save";
	  }
	  @RequestMapping("/home_admin/updateCategory")
	  public String doUpdateCategory(@ModelAttribute("Categorys") Categorys category, Model model) {
		  categoryServiceImpl.update(category);
	    model.addAttribute("listCategory", categoryServiceImpl.findAll());
	    return "admin/category/category_list";
	  }
	  
	  @RequestMapping("/home_admin/category_update/{id}")
	  public String updateCategory(@PathVariable int id, Model model) {
		  Categorys category = categoryServiceImpl.findById(id);
	    model.addAttribute("category", category);
	    return "admin/category/category_update";
	  }
	  @RequestMapping("/home_admin/saveCategory")
	  public String doSaveCategory(@ModelAttribute("Categorys") Categorys category, Model model) {
	    categoryServiceImpl.save(category);
	    model.addAttribute("listCategory", categoryServiceImpl.findAll());
	    return "admin/category/category_list";
	  }
	
	  
	  @RequestMapping("/home_admin/categoryDelete/{id}")
	  public String doDeleteCategory(@PathVariable int id, Model model) {
	    categoryServiceImpl.delete(id);
	    model.addAttribute("listCategory", categoryServiceImpl.findAll());
	    return "admin/category/category_list";
	  }
	
	
	
}
 