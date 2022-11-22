package Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDemo {

    public static void getRestAssuredTesting(String endpoint, String parameter) {
        RestAssured.baseURI = "https://gorest.co.in/public-api/users";
        RequestSpecification requestSpec = RestAssured.given();
        Response postResponse = requestSpec.request(Method.POST, "/public-api/users");
        System.out.println("Post Response: " + postResponse.getBody().asString());
        System.out.println("Post Response: " + postResponse.getStatusLine());
        int num = 11;
        for (int i = 0; i < num / 2; i++) {
            int rem = i % 2;
            if (rem == 0) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        getRestAssuredTesting("https://gorest.co.in/public-api/users", "/public-api/users");
    }


}
