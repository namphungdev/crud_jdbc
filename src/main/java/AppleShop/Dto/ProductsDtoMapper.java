package AppleShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<ProductsDto> {

	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto products = new ProductsDto();
		products.setId(rs.getLong("id"));
		products.setId_category(rs.getInt("id_category"));
		products.setName_product(rs.getString("name_product"));
		products.setId_size(rs.getLong("id_size"));
		products.setSize(rs.getString("size"));
		products.setId_capacity(rs.getLong("id_capacity"));
		products.setName_capacity(rs.getString("name_capacity"));
		
		products.setPrice(rs.getDouble("price"));
		products.setSale(rs.getInt("sale"));
		products.setTitle(rs.getString("title"));
		products.setImg_product(rs.getString("img_product"));
		products.setHighlight(rs.getBoolean("highlight"));
		products.setNew_product(rs.getBoolean("new_product"));
		products.setDetails(rs.getString("details"));
		products.setCreated_at(rs.getDate("created_at"));
		products.setUpdated_at(rs.getDate("updated_at"));
		
		products.setId_color(rs.getLong("id_color"));
		products.setName_color(rs.getString("name_color"));
		products.setCode_color(rs.getString("code_color"));
		
		return products;
	}

}
