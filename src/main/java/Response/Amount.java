package Response;

public class Amount {
	private String currency_code;
	private double value;
	private Breakdown breakdown;
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Breakdown getBreakdown() {
		return breakdown;
	}
	public void setBreakdown(Breakdown breakdown) {
		this.breakdown = breakdown;
	}
	

}
