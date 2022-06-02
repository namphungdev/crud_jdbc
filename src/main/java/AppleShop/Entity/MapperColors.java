package AppleShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperColors implements RowMapper<Colors> {

	@Override
	public Colors mapRow(ResultSet rs, int rowNum) throws SQLException {
		Colors color = new Colors();
		color.setId(rs.getInt("id"));
		color.setName_color(rs.getString("name_color"));
		color.setCode_color(rs.getString("code_color"));	
		return color;
	}

}
