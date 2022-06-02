package AppleShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SizeMapper implements RowMapper<Size> {
	  public Size mapRow(ResultSet rs, int rowNum) throws SQLException {
		    Size size = new Size();
		    size.setId(rs.getInt("id"));
		    size.setSize(rs.getString("size"));
		    return size;
		  }
}
