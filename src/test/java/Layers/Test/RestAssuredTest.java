package Layers.Test;

import Layers.BaseTest;
import Utils.TestDataReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredTest extends BaseTest {

    @Test(dataProvider = "GenericDataProvider", dataProviderClass = TestDataReader.class, testName = "RestAssuredTest")
    public void verifyResponseBodyAndStatusCode(String endpoint, String parameter) {
        //Base URI to hit the server
        RestAssured.baseURI = endpoint;
        //Request Specification for above Base URI
        RequestSpecification requestSpec = RestAssured.given();
        Response response = getResponse(requestSpec, parameter);
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Status body: " + response.getBody().asString());
    }

    public Response getResponse(RequestSpecification requestSpec, String parameter) {
        Response response = requestSpec.request(Method.GET, parameter);
        return response;
    }

    public Response postRequest(RequestSpecification requestSpec, String parameter) {
        Response response = requestSpec.request(Method.POST, parameter);
        return response;
    }

}
