package Response;

public class Item {
	private String name;
	private UnitAmount unit_amount;
	private int quantity;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UnitAmount getUnit_amount() {
		return unit_amount;
	}
	public void setUnit_amount(UnitAmount unit_amount) {
		this.unit_amount = unit_amount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
