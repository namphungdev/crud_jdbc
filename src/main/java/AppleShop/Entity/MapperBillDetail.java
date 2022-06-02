package AppleShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBillDetail implements RowMapper<BillDetail>{

	public BillDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BillDetail billDetail = new BillDetail();	
		billDetail.setId(rs.getLong("id"));
		billDetail.setId_product(rs.getLong("id_product"));
		billDetail.setId_category(rs.getInt("id_category"));
		billDetail.setName_product(rs.getString("name_product"));
		billDetail.setName_color(rs.getString("name_color"));
		billDetail.setImg_product(rs.getString("img_product"));
		billDetail.setId_bills(rs.getLong("id_bills"));
		billDetail.setTotal(rs.getDouble("total"));
		billDetail.setQuanty(rs.getInt("quanty"));		
		return billDetail;
	}
}
