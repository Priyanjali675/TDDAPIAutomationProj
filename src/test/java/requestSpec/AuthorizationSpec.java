package requestSpec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import jdk.internal.net.http.common.Utils;

import java.io.IOException;

import static ReusableMethods.Utils.loadEnvironmentalProperties;

public class AuthorizationSpec {
	RequestSpecification res;
	public static RequestSpecification createRequestSpec() throws IOException {
	//	String url =loadEnvironmentalProperties("ApplicationUrl");
        return new RequestSpecBuilder().setBaseUri(Utils.getProperty("ApplicationUrl"))
				.addFormParam("grant_type","client_credentials")
				.addFormParam("ignoreCache",true)
				.addFormParam("return_authn_schemes", true)
				.addFormParam("return_client_metadata",true)
				.addFormParam("return_unconsented_scopes",true)
				.addHeader("Authorization","Basic QWVtV0EyM05rVXR0WldoNzJCd1oyNXloaFNMRVVtdkhNeXM2NjNibW92ZlhIb1Eyb2FKUjd6UVZNOFF5dExZMF9QS1ZzQ1h0WTdaZ3dlUHY6RURKVU83eWFtMk53MW53emRBbHFwQzdMOE8tdzZxZkxLZjllQ0plNUV1ZWhNd2NCbzhkNk1peno2WHZKcnlwa0t2NXJjZWx1UlpDLUVWWlc=").build();
	}
	
	
	
	
}
