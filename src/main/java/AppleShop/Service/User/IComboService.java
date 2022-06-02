package AppleShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import AppleShop.Entity.Capacitys;
import AppleShop.Entity.Colors;
import AppleShop.Entity.Combo;

@Service
public interface IComboService {
	public List<Combo> GetDataSizes();
	public List<Capacitys> GetDataCapacitys();
	public List<Colors> GetDataColors();
	
}
