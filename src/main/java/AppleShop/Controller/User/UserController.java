package AppleShop.Controller.User;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import AppleShop.Dao.UsersDao;
import AppleShop.Dto.PaginatesDto;
import AppleShop.Entity.BillDetail;
import AppleShop.Entity.Bills;
import AppleShop.Entity.Customer;
import AppleShop.Entity.Users;
import AppleShop.Service.User.AccountServiceImpl;
import AppleShop.Service.User.BillsServiceImpl;
import AppleShop.Service.User.IComboService;
import AppleShop.Service.User.IProductService;
import AppleShop.Service.User.ProductServiceImpl;

@Controller
public class UserController extends BaseController{
	private static final Bills Bills = null;
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	@Autowired
	private BillsServiceImpl _billsServiceImpl;
	@Autowired
	private ProductServiceImpl _productServiceImpl;
//	@Autowired
//	private IProductService _productService;
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public  ModelAndView Register() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new Users());
		_mvShare.addObject("status", "" );
		return _mvShare;
	}
	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public  ModelAndView CreateAcc(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		_mvShare.addObject("status", "" );	
				if(count > 0) {
					_mvShare.addObject("status", " đăng kí tài khoản thành công");
				}else {
				_mvShare.addObject("status", " tài khoản đã tồn tại");
			}	
		
		_mvShare.setViewName("user/account/register");	
		return _mvShare;
	}
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public  ModelAndView Login(HttpSession session, @ModelAttribute("user") Users user) {
		user  = accountService.CheckAccount(user);
		_mvShare.addObject("statusLogin", "" );	
		if(user != null) {
			_mvShare.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", user);
		}else{
			_mvShare.addObject("statusLogin", "Tài khoản hoặc mật khẩu không đúng" );			
		}	
		return _mvShare;
	}

	@RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
	public  String Login(HttpSession session, HttpServletRequest request) {	
			session.removeAttribute("LoginInfo");
			return "redirect:"+request.getHeader("Referer");
		
	}
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public  ModelAndView Account(HttpSession session, @ModelAttribute("user") Users user) {
		_mvShare.setViewName("user/account/account");
		Users loginInfo = (Users)session.getAttribute("LoginInfo");

		
		_mvShare.addObject("account", loginInfo);
		_mvShare.addObject("bills", _billsServiceImpl.findAll());
		
//		_mvShare.addObject("bills", _billsServiceImpl.GetBillByAcc()));
		
		return _mvShare;
	}
	 @RequestMapping("/billdetail/{id}")
	  public ModelAndView ViewBillDetail(@PathVariable String id) {
		 _mvShare.setViewName("user/account/billdetail");	
		 List<BillDetail> billdetail = _billsServiceImpl.findById(Integer.parseInt(id));
	    _mvShare.addObject("billdetail", billdetail);
//	    _mvShare.addObject("products", _productServiceImpl.GetProductByID(Integer.parseInt(id)));
//	    int idProduct = billdetail.get(id.toString());
//	    int Product = (int) _productService.GetProductByID(Integer.parseInt(id)).getId(billdetail.get(Integer.parseInt(id_product)));
//	    _mvShare.addObject("product", Product);
//	    
//	    _mvShare.addObject("products", _productServiceImpl.GetProductByID());	
//	    
//	    int idCategory = _productService.GetProductByID(id).getId_category();
//		_mvShare.addObject("productByIDCategory", _productService.GetProductByCategory(idCategory));
	    return _mvShare;
	  }
//	 @RequestMapping(value = "/san-pham/{id}")
//		public ModelAndView Product(@PathVariable String id) {		
//			_mvShare.setViewName("user/products/category");		
//			int totalData = categoryServiceImpl.GetAllProductsByID(Integer.parseInt(id)).size();
//			PaginatesDto paginatesInfo = paginatesServiceImpl.GetInfoPaginates(totalData, totalProductsPage, 1);
//			_mvShare.addObject("idCategory", id);
//			_mvShare.addObject("paginatesInfo", paginatesInfo);	
//			_mvShare.addObject("productsPaginate", categoryServiceImpl.GetDataProductsPaginate(Integer.parseInt(id), paginatesInfo.getStart(), totalProductsPage));
//			return _mvShare;	
//		}
}
