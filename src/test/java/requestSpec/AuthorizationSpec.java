package requestSpec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import java.io.IOException;

import static ReusableMethods.TestUtils.loadEnvironmentalProperties;

public class AuthorizationSpec {
	public static RequestSpecification createRequestSpec() throws IOException {
		String url =loadEnvironmentalProperties("ApplicationUrl");
        return new RequestSpecBuilder().setBaseUri(url)
				.addFormParam("grant_type","client_credentials")
				.addFormParam("ignoreCache",true)
				.addFormParam("return_authn_schemes", true)
				.addFormParam("return_client_metadata",true)
				.addFormParam("return_unconsented_scopes",true)
				.addHeader("Authorization","Basic <AuthorizationToken>").build();
	}
	
	
	
	
}
