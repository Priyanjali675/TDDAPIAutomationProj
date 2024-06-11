package tests;
import java.io.IOException;
import java.util.List;


import ReusableMethods.Utils;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
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
