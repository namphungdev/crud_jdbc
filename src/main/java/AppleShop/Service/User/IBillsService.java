package AppleShop.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import AppleShop.Dto.CartDto;
import AppleShop.Entity.BillDetail;
import AppleShop.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bill);
	public void AddBillDetail(HashMap<Long, CartDto> carts);
	public List<Bills> findAll();
	public List<Bills> GetBillByAcc(Bills bill);
	public List<BillDetail> findById(int id);
	
}
