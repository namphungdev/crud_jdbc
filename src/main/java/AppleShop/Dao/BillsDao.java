package AppleShop.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import AppleShop.Dto.ProductsDto;
import AppleShop.Dto.ProductsDtoMapper;
import AppleShop.Entity.BillDetail;
import AppleShop.Entity.Bills;
import AppleShop.Entity.Customer;
import AppleShop.Entity.CustomerMapper;
import AppleShop.Entity.MapperBillDetail;
import AppleShop.Entity.MapperBills;
import AppleShop.Entity.MapperUsers;
import AppleShop.Entity.Users;
@Repository
public class BillsDao extends BaseDao {

	public int AddBills(Bills bill) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT  ");
		sql.append("INTO bills ");
		sql.append("( ");
		sql.append("    username, ");
		sql.append("    phone, ");
		sql.append("    display_name, ");
		sql.append("    address, ");
		sql.append("    total, ");
		sql.append("    quanty, ");
		sql.append("    note, ");
		sql.append("    NgayMua, ");
		sql.append("    TrangThai, ");
		sql.append("    VanChuyen ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+bill.getUsername()+"', ");
		sql.append("    '"+bill.getPhone()+"', ");
		sql.append("    '"+bill.getDisplay_name()+"', ");
		sql.append("    '"+bill.getAddress()+"', ");
		sql.append("    '"+bill.getTotal()+"', ");
		sql.append("    '"+bill.getQuanty()+"', ");
		sql.append("    '"+bill.getNote()+"', ");
		sql.append("    '"+bill.getNgayMua()+"', ");
		sql.append("    '"+bill.getTrangThai()+"', ");
		sql.append("    '"+bill.getVanChuyen()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
	
	public long GetIDLastBills()  {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills ");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	};
	
	public int AddBillsDetail(BillDetail billDetail) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT  ");
		sql.append("INTO billdetail ");
		sql.append("( ");
		sql.append("    id_product, ");
		sql.append("    id_bills, ");
		sql.append("    quanty, ");
		sql.append("    total ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+billDetail.getId_product()+"', ");
		sql.append("    '"+billDetail.getId_bills()+"', ");
		sql.append("    '"+billDetail.getQuanty()+"', ");
		sql.append("    '"+billDetail.getTotal()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
	@Autowired
	  private JdbcTemplate jdbcTemplate;
	
//	public Bills findById(int id) {
//		String sql = "SELECT * FROM billdetail WHERE id = ?";
//		return jdbcTemplate.queryForObject(sql, new MapperBillDetail(), id);
//	}
	public List<Bills> findAll() {
		String sql = "SELECT * FROM `bills`";
		return jdbcTemplate.query(sql, new MapperBills());
	};
//	public List<Bills>  GetBillByAcc(Bills bill)  {
//		String sql =  "SELECT * FROM bills WHERE username = '" + bill.getUsername() + "'";	
//		List<Bills>  rerult = (List<Bills>) jdbcTemplate.queryForObject(sql, new MapperBills());
//		return rerult;
//	};
	
	public List<Bills>  GetBillByAcc(Bills bill)  {
		String sql =  ("SELECT * FROM bills WHERE username = '" + bill.getUsername() + "'").toString();	
		List<Bills>  rerult = (List<Bills>) jdbcTemplate.queryForObject(sql, new MapperBills());
		return rerult;
	};

	/*
	 * public List<BillDetail> findById(int id) { String sql =
	 * ("SELECT * FROM billdetail WHERE id_bills =" + id + " ").toString();
	 * List<BillDetail> listBillDetail = jdbcTemplate.query(sql, new
	 * MapperBillDetail()); return listBillDetail; }
	 */
	 public List<BillDetail> findById(int id) {
		    String sql = ("SELECT\r\n"
		    		+ "p.id as id_product\r\n"
		    		+ ",p.id_category\r\n"
		    		+ ",p.name_product\r\n"
		    		+ ",p.img_product\r\n"
		    		+ ",p.name_color\r\n"
		    		+ ",b.id\r\n"
		    		+ ",b.id_bills\r\n"
		    		+ ",b.quanty\r\n"
		    		+ ",b.total\r\n"
		    		+ "FROM\r\n"
		    		+ "products AS p\r\n"
		    		+ "INNER JOIN \r\n"
		    		+ "billdetail AS b\r\n"
		    		+ "on p.id = b.id_product\r\n"
		    		+ "WHERE id_bills =" + id + " ").toString();
		    List<BillDetail> listBillDetail = jdbcTemplate.query(sql, new MapperBillDetail());
		    return listBillDetail;
		  }

}
