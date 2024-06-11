package stepDefinitions;

import ReusableMethods.GenericUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import requestSpec.OrderSpec;
import resourcePath.ResoucesPath;
import tests.*;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class paypalOrderTestDefinition {
    OrderSpec orderSpec;
    GenerateAccessToken accessTokenGeneration= new GenerateAccessToken();
    CreateOrder createOrder;
    List<String> accessTokenList;
    String token_type,access_token,orderId;
    Response orderDetails;
    String statusCodeRes;
    RequestSpecification req;
    @Given("{string} is done for the PayPal Account")
    public void is_done_for_the_pay_pal_account(String resource) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        createOrder = new CreateOrder();
        orderId = createOrder.orderCreation("OrderCreation",req);

    }
    @When("{string} is sent with orderId")
    public void is_sent_with(String resourcePath) {
        ResoucesPath resourceValue = ResoucesPath.valueOf(resourcePath);
        //GET  Request
        orderDetails = given().spec(req).pathParam("order_id", orderId)
                .when().get(resourceValue.getResource());

    }
    @Then("Response is retrieved with status code {string}")
    public void response_is_retrieved_with_status_code_and(String statusCode) {
        // Write code here that turns the phrase above into concrete actions
        statusCodeRes = String.valueOf(orderDetails.getStatusCode());
        Assert.assertEquals(statusCodeRes,statusCode,"Status Code is matching");
        String orderId_response = GenericUtils.extractValueFromResponse(orderDetails.asString(),"id");
        assertThat(orderId, equalToIgnoringCase(orderId_response));
    }

    @Given("Authorization code is available to make a request")
    public void authorizationCodeIsAvailableToMakeARequest() throws IOException {
        orderSpec = new OrderSpec();
        accessTokenList = accessTokenGeneration.generateAccessToken("AuthorizationToken");
        token_type = accessTokenList.get(0);
        access_token = accessTokenList.get(1);
        req = orderSpec.createOrderSpec(token_type,access_token);
    }
}
