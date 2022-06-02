package AppleShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCombo implements RowMapper<Combo> {

	@Override
	public Combo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Combo combo = new Combo();
		combo.setId(rs.getInt("id"));
		combo.setSize(rs.getString("size"));	
		return combo;
	}

}
