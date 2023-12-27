package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import ReusableMethods.GenericUtils;
import io.restassured.specification.RequestSpecification;
import requestSpec.OrderSpec;
import resourcePath.ResoucesPath;

import java.io.IOException;

public class GetOrderDetails {

	public void fetchOrderDetails(String orderId, String resourcePath,RequestSpecification req) throws IOException {
		// Get Order details by order Id
		ResoucesPath resourceValue = ResoucesPath.valueOf(resourcePath);
		String valueOfResourcePath = resourceValue.getResource();
		//GET  Request
		String orderDetails = given().spec(req).pathParam("order_id", orderId)
							.when().get(valueOfResourcePath).then().extract().response().asString();
		String orderId_response = GenericUtils.extractValueFromResponse(orderDetails,"id");
		assertThat(orderId, equalToIgnoringCase(orderId_response));
	}

}
