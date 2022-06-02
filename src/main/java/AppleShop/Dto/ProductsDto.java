package AppleShop.Dto;

import java.sql.Date;

public class ProductsDto {
	private long id;
	private int id_category;	
	private String name_product;
	private long id_size;
	private String size;
	private long id_capacity;
	private String name_capacity;
	private Double price;
	private int sale;
	private String title;
	private String img_product;
	private Boolean highlight;
	private Boolean new_product;
	private String details;
	private Date created_at;
	private Date updated_at;
	private long id_color;
	private String name_color;
	private String code_color;
	
	
	public ProductsDto() {
		super();
	}
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getId_category() {
		return id_category;
	}


	public void setId_category(int id_category) {
		this.id_category = id_category;
	}


	public String getName_product() {
		return name_product;
	}


	public void setName_product(String name_product) {
		this.name_product = name_product;
	}


	public long getId_size() {
		return id_size;
	}


	public void setId_size(long id_size) {
		this.id_size = id_size;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public long getId_capacity() {
		return id_capacity;
	}


	public void setId_capacity(long id_capacity) {
		this.id_capacity = id_capacity;
	}


	public String getName_capacity() {
		return name_capacity;
	}


	public void setName_capacity(String name_capacity) {
		this.name_capacity = name_capacity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public int getSale() {
		return sale;
	}


	public void setSale(int sale) {
		this.sale = sale;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getImg_product() {
		return img_product;
	}


	public void setImg_product(String img_product) {
		this.img_product = img_product;
	}


	public Boolean getHighlight() {
		return highlight;
	}


	public void setHighlight(Boolean highlight) {
		this.highlight = highlight;
	}


	public Boolean getNew_product() {
		return new_product;
	}


	public void setNew_product(Boolean new_product) {
		this.new_product = new_product;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	public Date getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}


	public long getId_color() {
		return id_color;
	}


	public void setId_color(long id_color) {
		this.id_color = id_color;
	}


	public String getName_color() {
		return name_color;
	}


	public void setName_color(String name_color) {
		this.name_color = name_color;
	}


	public String getCode_color() {
		return code_color;
	}


	public void setCode_color(String code_color) {
		this.code_color = code_color;
	}


	
	

}
