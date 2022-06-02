package AppleShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import AppleShop.Dto.ProductsDto;
import AppleShop.Dto.ProductsDtoMapper;
import AppleShop.Entity.Customer;
import AppleShop.Entity.CustomerMapper;

@Repository
public class ProductsDao extends BaseDao {
	/* User */
	private final boolean YES = true;
	private final boolean NO = false;
	

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM products ");
		return sql;
	}

	private String SqlProducts(boolean newProduct, boolean highLight) {
		StringBuffer sql = SqlString();
		sql.append("WHERE ");
		if (highLight) {
			sql.append("highlight = true ");
		}
		if (newProduct) {
			sql.append("new_product = true ");
		}
		sql.append("ORDER BY RAND() ");
		if (highLight) {
			sql.append("lIMIT 9 ");
		}
		if (newProduct) {
			sql.append("lIMIT 12 ");
		}

		return sql.toString();
	}

	private StringBuffer SqlProductsByID(int id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE ");
		sql.append("id_category = " + id + " ");
		return sql;
	}

	private String SqlProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sql = SqlProductsByID(id);
		sql.append("LIMIT  " + start + "," + totalPage);
		return sql.toString();
	}

	public List<ProductsDto> GetDataProducts() {
		String sql = SqlProducts(YES, NO);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;	
	}

	public List<ProductsDto> GetAllProductsByID(int id) {
		String sql = SqlProductsByID(id).toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sqlGetDataByID = SqlProductsByID(id);
		List<ProductsDto> listProductsByID = _jdbcTemplate.query(sqlGetDataByID.toString(), new ProductsDtoMapper());
		List<ProductsDto> listProducts = new ArrayList<ProductsDto>();
		if (listProductsByID.size() >= 0) {
			String sql = SqlProductsPaginate(id, start, totalPage);
			listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		}
		return listProducts;
	}

	private String SqlProductByID(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE ");
		sql.append("id = " + id + " ");
		return sql.toString();
	}
//	private String SqlProductByNameAndId_color(String name_product, int id_color) {
//		StringBuffer sql = SqlString();
//		sql.append("WHERE ");
//		sql.append("name_product like " + "'" + name_product + "'" + "AND id_color = " + id_color + " ");
//		return sql.toString();
//	}
//	public List<ProductsDto> GetProductByNameAndId_color(String name_product, int id_color) {
//		String sql = SqlProductByNameAndId_color(name_product, id_color);
//		List<ProductsDto> listProduct = _jdbcTemplate.query(sql, new ProductsDtoMapper());
//		return listProduct;
//	}
	
	

	public List<ProductsDto> GetProductByID(long id) {
		String sql = SqlProductByID(id);
		List<ProductsDto> listProduct = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProduct;
	}

	public ProductsDto FindProductByID(long id) {
		String sql = SqlProductByID(id);
		ProductsDto Product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return Product;
	}
	
	/* Admin */

	@Autowired
	  private JdbcTemplate jdbcTemplate;
	
		public ProductsDto findById(int id) {
			String sql = "SELECT * FROM products WHERE id = ?";
			return jdbcTemplate.queryForObject(sql, new ProductsDtoMapper(), id);
		}


		public List<ProductsDto> findAll() {
			String sql = "SELECT * FROM products";
			return jdbcTemplate.query(sql, new ProductsDtoMapper());
		} 
		

		public void save(ProductsDto products) {
			String sql = "INSERT INTO products (id_category, name_product, id_size,size, id_capacity, name_capacity, price, sale, title, img_product, highlight, new_product, details, created_at, updated_at, id_color, name_color, code_color) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, products.getId_category(), products.getName_product(), products.getId_size(), products.getSize(), products.getId_capacity(), products.getName_capacity(), products.getPrice(), products.getSale(), products.getTitle(), products.getImg_product(), products.getHighlight(), products.getNew_product(), products.getDetails(), products.getCreated_at(), products.getUpdated_at(), products.getId_color(), products.getName_color(), products.getCode_color() );
		}

//		public void delete(int id) {
//			String sql = "DELETE FROM customer WHERE id = " + id;
//			jdbcTemplate.update(sql);
//		}
//
		public void update(ProductsDto products) {
			String sql = "UPDATE products SET id_category = ?, name_product = ?, id_size = ?, size = ?, id_capacity = ?, name_capacity = ?, price = ?, sale = ?, title = ?, img_product = ?, highlight = ?, new_product = ?, details = ?, created_at = ?, updated_at = ?, id_color = ?, name_color = ?, code_color = ? WHERE id = ? ";

			jdbcTemplate.update(sql, products.getId_category(), 
					products.getName_product(), 
					products.getId_size(), 
					products.getSize(), 
					products.getId_capacity(), 
					products.getName_capacity(), 
					products.getPrice(), 
					products.getSale(), 
					products.getTitle(), 
					products.getImg_product(), 
					products.getHighlight(), 
					products.getNew_product(), 
					products.getDetails(), 
					products.getCreated_at(), 
					products.getUpdated_at(), 
					products.getId_color(), 
					products.getName_color(), 
					products.getCode_color(),
					products.getId());
		}
}
