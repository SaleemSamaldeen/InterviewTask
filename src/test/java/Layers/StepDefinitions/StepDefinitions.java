package Layers.StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {


    @Given("I have a linkedin account")
    public void i_have_a_linkedin_account() {
        System.out.println("I have a linkedin account");
    }

    @Given("I enter valid username - saleemsamaldeen1991@gmail.com and password - Linkedinjobs@1")
    public void i_enter_valid_username_and_password() {
        System.out.println("I enter valid username - saleemsamaldeen1991@gmail.com and password - Linkedinjobs@1");
    }

    @When("I click Submit button")
    public void i_click_submit_button() {
        System.out.println("I click Submit button");
    }

    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("User is successfully logged in");
    }

    @Then("I verify my jobs alert")
    public void iVerifyMyJobsAlert() {
        System.out.println("I verify my jobs alert");
    }

    @And("Logout user and reaches home page")
    public void logoutUserAndReachesHomePage() {
        System.out.println("Logout user and reaches home page");
    }

    @And("I verify (.*) displayed in home page")
    public void iVerifyUsernameDisplayedInHomePage(String profileName) {
        System.out.println("Profile name is displayed in home page " + profileName);
    }

    @And("I verify (.*) displayed in search results page")
    public void iVerifyUsernameDisplayedInSearchResultsPage(String username) {
        System.out.println("Profile name is displayed in search results page");
    }

    @And("I verify my messages")
    public void verifyMsgs() {
        System.out.println("I verify my messages");
    }
}
