package Test;

import Utils.TestDataReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
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

        JsonPath jsonPath = response.jsonPath();

        System.out.println("Status body - Message: " + jsonPath.get("message"));
        System.out.println("Status body - page: " + jsonPath.get("page"));
        System.out.println("Status body - total: " + jsonPath.get("total"));
        System.out.println(jsonPath.get("data[4].first_name") + " " + jsonPath.get("data[4].last_name"));
        List<HashMap> responseList = jsonPath.get("data");
        Map<String, String> support = jsonPath.get("support");
        System.out.println(responseList.get(0).get("id"));
        System.out.println(support.get("url"));
    }

    //webtestclient similar to rest assured used to automate web services
    protected WebTestClient testClient() {
        return WebTestClient.bindToServer().build();
    }

}
