package Test;

import Utils.TestDataReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RestAssuredTest4 extends BaseTest {

    @Test(dataProvider = "GenericDataProvider", dataProviderClass = TestDataReader.class, testName = "RestAssuredTest4")
    public void getJSONResponseBody(String endpoint, String parameter) {
        //Base URI to hit the server
        RestAssured.baseURI = endpoint;
        //Request Specification for above Base URI
        RequestSpecification requestSpec = RestAssured.given();
        //Get request method to fetch request details
        Response response = requestSpec.request(Method.GET, parameter);
        // Example of how to send request with basic authentication credentials
        //requestSpec.auth().preemptive().basic("","").get(parameter);

        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Status body: " + response.getBody().asString());
        System.out.println("Status body - Message: " + response.jsonPath().get("message"));
        System.out.println("Status body - page: " + response.jsonPath().get("page"));
        System.out.println("Status body - total: " + response.jsonPath().get("total"));
        ArrayList<HashMap> responseList = response.jsonPath().get("data");
        Map<String, String> support = response.jsonPath().get("support");
        System.out.println(responseList.get(0).get("id"));
    }

    //webtestclient similar to rest assured used to automate web services
    protected WebTestClient testClient() {
        return WebTestClient.bindToServer().build();
    }

}
