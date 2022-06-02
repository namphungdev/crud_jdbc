package AppleShop.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AppleShop.Controller.User.BaseController;
@Controller
public class HomeAdminController extends BaseController{
	@RequestMapping(value = {"/home_admin"})
	public ModelAndView Home_admin() {
		_mvShare.setViewName("admin/home_admin");
		return _mvShare;	
	}
}
