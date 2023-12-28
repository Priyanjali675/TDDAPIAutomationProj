package requestSpec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import static ReusableMethods.Utils.loadEnvironmentalProperties;

public class AuthorizationSpec {
	RequestSpecification res;
	public static RequestSpecification createRequestSpec() throws IOException {
	//	String url =loadEnvironmentalProperties("ApplicationUrl");
	RequestSpecification res =	new RequestSpecBuilder().setBaseUri("https://api-m.sandbox.paypal.com").addFormParam("grant_type","client_credentials")
				.addFormParam("ignoreCache",true)
				.addFormParam("return_authn_schemes", true)
				.addFormParam("return_client_metadata",true)
				.addFormParam("return_unconsented_scopes",true)
				.addHeader("Authorization","Basic <Input your Authorization here>").build();
	return res;
	}
	
	
	
	
}
