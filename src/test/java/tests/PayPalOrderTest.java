package tests;
import java.io.IOException;


import io.cucumber.java.Before;
import requestSpec.OrderSpec;

public class PayPalOrderTest {


	CreateOrder createOrder;
	GetOrderDetails getOrderDetails;
	UpdateOrderDetails updateOrderDetails;
	OrderSpec orderSpec;

	@Before
	public void initializeRequestResponseSpec() throws IOException {
		createOrder = new CreateOrder();
		getOrderDetails = new GetOrderDetails();
		updateOrderDetails = new UpdateOrderDetails();
		orderSpec = new OrderSpec();
		// Get Access Token
	}
}
