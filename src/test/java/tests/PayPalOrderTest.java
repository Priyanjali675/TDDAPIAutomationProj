package tests;
import java.io.IOException;
import java.util.List;


import ReusableMethods.Utils;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requestSpec.OrderSpec;

public class PayPalOrderTest {

	GenerateAccessToken accessTokenGeneration= new GenerateAccessToken();
	CreateOrder createOrder;
	GetOrderDetails getOrderDetails;
	UpdateOrderDetails updateOrderDetails;
	List<String> accessTokenList;
	String orderId,token_type,access_token;
	OrderSpec orderSpec;
	RequestSpecification req;


	@BeforeTest
	public void initializeRequestResponseSpec() throws IOException {
		createOrder = new CreateOrder();
		getOrderDetails = new GetOrderDetails();
		updateOrderDetails = new UpdateOrderDetails();
		orderSpec = new OrderSpec();

		// Get Access Token
		accessTokenList = accessTokenGeneration.generateAccessToken("AuthorizationToken");
		token_type = accessTokenList.get(0);
		access_token = accessTokenList.get(1);

		req = orderSpec.createOrderSpec(token_type,access_token);
		orderId = createOrder.orderCreation("OrderCreation",req);
	}

	@Test
	public void getOrderDetailsPayPalAPI() throws IOException {
		getOrderDetails.fetchOrderDetails(orderId,"GetOrderDetails", req);
	}

	@Test(enabled = false)
	public void updateOrderDetailsPayPalAPI() throws IOException {
		updateOrderDetails.updateOrderDetails(orderId,"UpdateOrderDetails", req);

	}
}
