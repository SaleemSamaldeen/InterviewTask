package Layers.Test;


import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.Test;


public class AutoGroup1 {

    @Test(dataProvider = "GenericDataProvider")
    public void verifyAPIForAutomation(String username, String password, String account) {
        String baseURI = "";
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setRelaxedHTTPSValidation("SSL");
        builder.setBaseUri(baseURI);
        builder.addHeader("Content-Type", "text/xml");
        builder.addHeader("Content-Type", "application/xml");
        builder.setBody("");
        builder.build();

    }


}
