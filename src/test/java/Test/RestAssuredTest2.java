package Test;

import Utils.TestDataReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RestAssuredTest2 extends BaseTest {

    @Test(dataProvider = "GenericDataProvider", dataProviderClass = TestDataReader.class, testName = "RestAssuredTest2")
    public void registerCustomerPOSTRequestWithJSONRequestBody(String endpoint, String parameter) {
        //Base URI to hit the server
        RestAssured.baseURI = endpoint;
        //Request Specification for above Base URI
        RequestSpecification requestSpec = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "JohnXYZ");
        requestParams.put("LastName", "Johny");
        requestParams.put("UserName", "JohnyXYZ");
        requestParams.put("Password", "Johny123456");
        requestParams.put("Email", "JohnyXYZ@gmail.com");

        requestSpec.header("Content-Type", "application/json");
        requestSpec.body(requestParams.toJSONString());

        Response response = postRequest(requestSpec, parameter);
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Status body: " + response.getBody().asString());
    }

    public Response postRequest(RequestSpecification requestSpec, String parameter) {
        Response response = requestSpec.request(Method.POST, parameter);
        return response;
    }
}
