package AppleShop.Service.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.BillsDao;
import AppleShop.Dto.CartDto;
import AppleShop.Entity.BillDetail;
import AppleShop.Entity.Bills;
import AppleShop.Entity.Users;

@Service
public class BillsServiceImpl implements IBillsService {

	@Autowired
	private BillsDao billsDao = new BillsDao();
	

	@Override
	public int AddBills(Bills bill) {
		return billsDao.AddBills(bill);
	}
	
	@Override
	public void AddBillDetail(HashMap<Long, CartDto> carts) {
		long idBills = billsDao.GetIDLastBills();
		
		for(Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setId_bills(idBills);
			billDetail.setId_product(itemCart.getValue().getProduct().getId());
		    billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}
	}
	@Override
	public List<Bills> findAll() {
		return billsDao.findAll();
	}
	@Override
	public List<Bills>  GetBillByAcc(Bills bill) {
		return billsDao.GetBillByAcc(bill);
	}
	@Override
	public List<BillDetail> findById(int id)  {
		return billsDao.findById(id);
	}
	

	
	
	
}
