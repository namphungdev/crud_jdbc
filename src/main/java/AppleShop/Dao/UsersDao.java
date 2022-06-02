package AppleShop.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import AppleShop.Dto.CartDto;
import AppleShop.Entity.Bills;
import AppleShop.Entity.Customer;
import AppleShop.Entity.CustomerMapper;
import AppleShop.Entity.MapperUsers;
import AppleShop.Entity.Users;

@Repository
public class UsersDao extends BaseDao {
	@Autowired
	  private JdbcTemplate jdbcTemplate;
	
	public int AddAccount(Users user)  {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("    username, ");
		sql.append("    password, ");
		sql.append("    display_name, ");
		sql.append("    address ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getUsername()+"', ");
		sql.append("    '"+user.getPassword()+"', ");
		sql.append("    '"+user.getDisplay_name()+"', ");
		sql.append("    '"+user.getAddress()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
	
	public Users GetUserByAcc(Users user)  {
		String sql =  "SELECT * FROM users WHERE username = '" + user.getUsername() + "'";	
		Users rerult = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return rerult;
	};
//	public int GetUserByUsername(Users user) {			
//		 String sql = "SELECT  COUNT(*)  FROM users WHERE username = '" + user.getUsername() + "' ";	
//		 string rerult = _jdbcTemplate.g(sql, new MapperUsers());
//		 return rerult;
//	      
//	}
	
	
	

}
