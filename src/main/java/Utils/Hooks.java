package Utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {

    /**
     * The background is run before each of your scenarios but after any of your @Before hook.
     **/


    @Before(order = 1)
    public void beforeScenario() {
        System.out.println("Start the browser and Clear the cookies");
    }

    @Before(order = 0)
    public void beforeScenarioStart() {
        System.out.println("-----------------Start of Scenario-----------------");
    }


    @After(order = 0)
    public void afterScenarioFinish() {
        System.out.println("-----------------End of Scenario-----------------");
    }

    @After(order = 1)
    public void afterScenario() {
        System.out.println("Log out the user and close the browser");
    }

    @AfterStep(order = 1)
    public void afterScenario1() {
        System.out.println("Log out the user and close the browser");
    }

}