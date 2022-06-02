package AppleShop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import AppleShop.Entity.Capacitys;
import AppleShop.Entity.Categorys;
import AppleShop.Entity.MapperCapacitys;
import AppleShop.Entity.MapperCategorys;

public class CapacityDao {

	@Autowired
	  private JdbcTemplate jdbcTemplate;
	
	  public void save(Capacitys capacity) {
	    String sql = "INSERT INTO capacity (name_capacity()) VALUES (?)";
	    jdbcTemplate.update(sql, capacity.getName_capacity());
	  }
	  public void delete(int id) {
	    String sql = "DELETE FROM capacity WHERE id = " + id;
	    jdbcTemplate.update(sql);
	  }
	  
	  public void update(Capacitys capacity) {
	    String sql = "UPDATE capacity SET name_capacity = ? WHERE id = ? ";
	    jdbcTemplate.update(sql, capacity.getName_capacity(), capacity.getId());
	  }
	  public Capacitys findById(int id) {
	    String sql = "SELECT * FROM capacity WHERE id = ?";
	    return jdbcTemplate.queryForObject(sql, new MapperCapacitys(), id);
	  }
	  public List<Capacitys> findAll() {
	    String sql = "SELECT * FROM capacity";
	    return jdbcTemplate.query(sql, new MapperCapacitys());
	  }

}
