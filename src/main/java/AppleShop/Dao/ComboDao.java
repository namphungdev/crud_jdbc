package AppleShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import AppleShop.Entity.Capacitys;
import AppleShop.Entity.Colors;
import AppleShop.Entity.Combo;
import AppleShop.Entity.MapperCapacitys;
import AppleShop.Entity.MapperColors;
import AppleShop.Entity.MapperCombo;
@Repository
public class ComboDao extends BaseDao{
	public List<Combo> GetDataSizes() {
		List<Combo> list = new ArrayList<Combo>();
		String sql = "SELECT * FROM sizes";
		list = _jdbcTemplate.query(sql, new MapperCombo());
		return list;
		
	}
		public List<Capacitys> GetDataCapacitys() {
			List<Capacitys> list = new ArrayList<Capacitys>();
			String sql = "SELECT * FROM capacity";
			list = _jdbcTemplate.query(sql, new MapperCapacitys());
			return list;
			
		}
		
		public List<Colors> GetDataColors() {
			List<Colors> list = new ArrayList<Colors>();
			String sql = "SELECT * FROM colors";
			list = _jdbcTemplate.query(sql, new MapperColors());
			return list;
			
		}
	
}