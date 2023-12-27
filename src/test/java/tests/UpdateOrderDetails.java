package tests;

import io.restassured.specification.RequestSpecification;
import requestSpec.OrderSpec;
import resourcePath.ResoucesPath;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class UpdateOrderDetails {

	public void updateOrderDetails(String OrderId, String resourcePath, RequestSpecification req) throws IOException {

		ResoucesPath resource = ResoucesPath.valueOf(resourcePath);
		given().spec(req)
				.header("PayPal-Request-Id","A v4 style guid")
		.pathParam("order_id", OrderId).body(OrderBody.updatedOrderBody())
		.when().patch(resource.getResource()).then().assertThat().statusCode(204);
	}

}
