package AppleShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import AppleShop.Entity.Categorys;
import AppleShop.Entity.Customer;
import AppleShop.Entity.CustomerMapper;
import AppleShop.Entity.MapperCategorys;
@Repository
public class CategorysDao extends BaseDao{
	public List<Categorys> GetDataCategorys() {
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
		
	}
	//admin
	@Autowired
	  private JdbcTemplate jdbcTemplate;
	
	  public void save(Categorys category) {
	    String sql = "INSERT INTO categorys (name, description) VALUES (?, ?)";
	    jdbcTemplate.update(sql, category.getName(), category.getDescription());
	  }
	  public void delete(int id) {
	    String sql = "DELETE FROM categorys WHERE id = " + id;
	    jdbcTemplate.update(sql);
	  }
	  
	  public void update(Categorys category) {
	    String sql = "UPDATE categorys SET name = ?, description = ?  WHERE id = ? ";
	    jdbcTemplate.update(sql, category.getName(), category.getDescription(), category.getId());
	  }
	  public Categorys findById(int id) {
	    String sql = "SELECT * FROM categorys WHERE id = ?";
	    return jdbcTemplate.queryForObject(sql, new MapperCategorys(), id);
	  }
	  public List<Categorys> findAll() {
	    String sql = "SELECT * FROM categorys";
	    return jdbcTemplate.query(sql, new MapperCategorys());
	  }
	
}
