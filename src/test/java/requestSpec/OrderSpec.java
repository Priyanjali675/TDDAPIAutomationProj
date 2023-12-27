package requestSpec;

import ReusableMethods.Utils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OrderSpec {
    RequestSpecification req;
    public RequestSpecification createOrderSpec(String token_type, String access_token) throws IOException {
       // String applicationUrl = Utils.loadEnvironmentalProperties("ApplicationUrl");
        if(req==null) {
            PrintStream log = new PrintStream(Files.newOutputStream(Paths.get("PayPalApplicationLogger.txt")));
            req = new RequestSpecBuilder().setBaseUri("https://api-m.sandbox.paypal.com")
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .addHeader("Authorization", token_type + " " + access_token)
                    .setContentType(ContentType.JSON).build();
        }
        return req;
    }
}
