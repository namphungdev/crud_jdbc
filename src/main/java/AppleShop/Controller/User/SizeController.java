package AppleShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import AppleShop.Entity.Size;
import AppleShop.Service.User.SizeService;

@Controller
public class SizeController {
	@Autowired
	private SizeService sizeService;
	
	@RequestMapping(value={"/home_admin/size_list"})
	  public String listSize(Model model) {
	    model.addAttribute("listSize", sizeService.findAll());    
	    return "admin/size/size_list";
	  }
	 @RequestMapping("/home_admin/size_save")
	  public String insertSize(Model model) {
	    model.addAttribute("size", new Size());
	    return "admin/size/size_save";
	  }
	  @RequestMapping("/home_admin/size_view/{id}")
	  public String viewSize(@PathVariable int id, Model model) {
	    Size size = sizeService.findById(id);
	    model.addAttribute("size", size);
	    return "admin/size/size_view";
	  }
	  @RequestMapping("/home_admin/size_update/{id}")
	  public String updateSize(@PathVariable int id, Model model) {
	    Size size = sizeService.findById(id);
	    model.addAttribute("size", size);
	    return "admin/size/size_update";
	  }
	  
	  @RequestMapping("/home_admin/saveSize")
	  public String doSaveSize(@ModelAttribute("Size") Size size, Model model) {
		  sizeService.save(size);
	    model.addAttribute("listSize", sizeService.findAll());
	    return "admin/size/size_list";
	  }
	  @RequestMapping("/home_admin/updateSize")
	  public String doUpdateSize(@ModelAttribute("Size") Size size, Model model) {
		  sizeService.update(size);
	    model.addAttribute("listSize", sizeService.findAll());
	    return "admin/size/size_list";
	  }
	  
	  @RequestMapping("/home_admin/size_delete/{id}")
	  public String doDeleteSize(@PathVariable int id, Model model) {
		  sizeService.delete(id);
	    model.addAttribute("listSize", sizeService.findAll());
	    return "admin/size/size_list";
	  }
}
