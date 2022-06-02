package AppleShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCapacitys implements RowMapper<Capacitys> {

	@Override
	public Capacitys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Capacitys capacitys = new Capacitys();
		capacitys.setId(rs.getInt("id"));
		capacitys.setName_capacity(rs.getString("name_capacity"));	
		return capacitys;
	}

}
