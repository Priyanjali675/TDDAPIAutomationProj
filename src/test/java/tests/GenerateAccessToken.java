package tests;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.Rule;

import ReusableMethods.GenericUtils;
import requestSpec.AuthorizationSpec;
import resourcePath.ResoucesPath;
import static io.restassured.RestAssured.*;
public class GenerateAccessToken {
	RequestSpecification req;

		public List<String> generateAccessToken(String APIName) throws IOException {
			// Get resource path endpoint
			ResoucesPath resourceAPI = ResoucesPath.valueOf(APIName);
			String resource = resourceAPI.getResource();

			// Create spec
			req = AuthorizationSpec.createRequestSpec();

			// Store response
			String Response =given().spec(req).when().post(resource)
					.then().extract().response().asString();

			// Extract the access token value and type and return them
			String access_Token = GenericUtils.extractValueFromResponse(Response,"access_token");
			String token_type= GenericUtils.extractValueFromResponse(Response,"token_type");
			ArrayList<String> list = new ArrayList<String>();
			list.add(token_type);
			list.add(access_Token);
			return list;
		}
	

	

}
