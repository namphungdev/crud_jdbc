package AppleShop.Entity;

public class BillDetail {

	private long id;
	private long id_product;
	private int id_category;
	private String name_product;
	private String img_product;
	private String name_color;
	private int quanty;
	private double total;
	private long id_bills;
	
	
	public BillDetail() {
		super();
	}
		
	public long getId_bills() {
		return id_bills;
	}
	
	public void setId_bills(long id_bills) {
		this.id_bills = id_bills;
	}
		public long getId() {
			return id_bills;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public long getId_product() {
			return id_product;
		}
		
		public void setId_product(long id_product) {
			this.id_product = id_product;
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
		
		public String getName_color() {
			return name_color;
		}
		
		public void setName_color(String name_color) {
			this.name_color = name_color;
		}
		public String getImg_product() {
			return img_product;
		}
		
		public void setImg_product(String img_product) {
			this.img_product = img_product;
		}
		public int getQuanty() {
			return quanty;
		}
		
		public void setQuanty(int quanty) {
			this.quanty = quanty;
		}
		
		public double getTotal() {
			return total;
		}
		
		public void setTotal(double total) {
			this.total = total;
		}
		
		
	
	
}
