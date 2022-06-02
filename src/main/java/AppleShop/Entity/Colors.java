package AppleShop.Entity;

public class Colors {
	private int id;
	private String name_color;
	private String code_color;
	
	public Colors() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
