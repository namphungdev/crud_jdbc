package AppleShop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import AppleShop.Entity.Customer;
import AppleShop.Entity.CustomerMapper;
import AppleShop.Entity.Size;
import AppleShop.Entity.SizeMapper;

@Repository
public class SizeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Size size) {
		String sql = "INSERT INTO sizes (size) VALUES (?)";
		jdbcTemplate.update(sql, size.getSize());
	}
	 public void delete(int id) {
		    String sql = "DELETE FROM sizes WHERE id = " + id;
		    jdbcTemplate.update(sql);
		  }
	 public void update(Size size) {
		    String sql = "UPDATE sizes SET size = ? WHERE id = ?  ";
		    jdbcTemplate.update(sql, size.getSize(), size.getId());
		  }
	 public Size findById(int id) {
		    String sql = "SELECT * FROM sizes WHERE id = ?";
		    return jdbcTemplate.queryForObject(sql, new SizeMapper(), id);
		  }
	 public List<Size> findAll() {
		    String sql = "SELECT * FROM sizes";
		    return jdbcTemplate.query(sql, new SizeMapper());
		  }
}
