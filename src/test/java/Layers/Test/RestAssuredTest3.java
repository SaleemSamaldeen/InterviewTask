package Layers.Test;

import Layers.BaseTest;
import Utils.TestDataReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Map;

public class RestAssuredTest3 extends BaseTest {

    @Test(dataProvider = "GenericDataProvider", dataProviderClass = TestDataReader.class, testName = "RestAssuredTest3")
    public void getJSONResponseBody(String endpoint, String parameter) {
        //Base URI to hit the server
        RestAssured.baseURI = endpoint;
        //Request Specification for above Base URI
        RequestSpecification requestSpec = RestAssured.given();
        //Get request method to fetch request details
        Response response = requestSpec.request(Method.GET, parameter);

        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Status body: " + response.getBody().asString());
        System.out.println("Status body - Message: " + response.jsonPath());
        try {
            Map<String, Object> responseMap = response.jsonPath().get("data");
            for (Map.Entry<String, Object> entry : responseMap.entrySet()) {
                System.out.println("Response body - data: Key " + entry.getKey());
                System.out.println("Response body - data: Value " + entry.getValue().toString());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error in getting value from Response body");
        }


    }


}
