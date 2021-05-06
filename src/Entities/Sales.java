package Entities;

public class Sales {
	
	private int id;
	private String salesAmount;

	public Sales(int id, String salesAmount) {
		super();
		this.id = id;
		this.salesAmount = salesAmount;
	}
	public Sales() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}
	
}
