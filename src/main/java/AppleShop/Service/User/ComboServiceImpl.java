package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.ComboDao;
import AppleShop.Entity.Capacitys;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.Colors;
import AppleShop.Entity.Combo;
@Service
public class ComboServiceImpl implements IComboService {
	@Autowired
	 private ComboDao comboDao;
	 
	public List<Combo> GetDataSizes() {
		return comboDao.GetDataSizes();
		
	}
	public List<Capacitys> GetDataCapacitys(){
		return comboDao.GetDataCapacitys();
		
	}
	@Override
	public List<Colors> GetDataColors() {
		return comboDao.GetDataColors();
	}
	
		
	 

}
