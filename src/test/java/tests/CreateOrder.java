package tests;

import static io.restassured.RestAssured.given;
import Requests.OrderRequestBuilder;
import Response.CreateOrderResponse;
import io.restassured.specification.RequestSpecification;
import resourcePath.ResoucesPath;

import java.io.IOException;


public class CreateOrder {
	public String orderCreation(String resources, RequestSpecification req) throws IOException {
		// Get the Resource Path
		ResoucesPath resourceValue = ResoucesPath.valueOf(resources);
		String valueOfResourcePath = resourceValue.getResource();

		// POST request
		CreateOrderResponse OrderResponse = given().spec(req)
				.header("Prefer", "return=representation").header("PayPal-Request-Id","A v4 style guid")
				.body(OrderRequestBuilder.createOrderRequestBuilder("CAPTURE"))
				.when().post(valueOfResourcePath).then().assertThat().statusCode(200).extract().response().as(CreateOrderResponse.class);
				//String orderId = GenericUtils.extractValueFromResponse(OrderResponse, "id");
				return OrderResponse.getId();	
	}

}
