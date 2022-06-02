package AppleShop.Entity;

public class Bills {
	
	private long id;
	private String username;
	private String phone;
	private String display_name;
	private String address;
	private double total;
	private int quanty;
	private String note;
	private String NgayMua;
	private String TrangThai;
	private String VanChuyen;



	public Bills() {
		super();
	}
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getDisplay_name() {
			return display_name;
		}

		public void setDisplay_name(String display_name) {
			this.display_name = display_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public int getQuanty() {
			return quanty;
		}

		public void setQuanty(int quanty) {
			this.quanty = quanty;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}
		
		public String getNgayMua() {
			return NgayMua;
		}

		public void setNgayMua(String NgayMua) {
			this.NgayMua = NgayMua;
		}
		public String getTrangThai() {
			return TrangThai;
		}

		public void setTrangThai(String TrangThai) {
			this.TrangThai = TrangThai;
		}
		public String getVanChuyen() {
			return VanChuyen;
		}

		public void setVanChuyen(String VanChuyen) {
			this.VanChuyen = VanChuyen;
		}

		
}
