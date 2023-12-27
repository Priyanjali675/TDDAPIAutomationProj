package resourcePath;

public enum ResoucesPath{
	AuthorizationToken("/v1/oauth2/token"),
	OrderCreation("/v2/checkout/orders"),
	GetOrderDetails("/v2/checkout/orders/{order_id}"),
	UpdateOrderDetails("/v2/checkout/orders/{order_id}");
	private String resource;

	ResoucesPath(String resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}

	public  String getResource() {
		
		return resource;
	}
			
}
