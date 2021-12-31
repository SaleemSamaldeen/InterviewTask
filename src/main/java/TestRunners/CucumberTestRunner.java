package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features",
        glue = {"src/test/java/Layers/StepDefinitions"},
        tags = "@001JobsAlert",
        plugin = {"pretty", "html:target/cucumber-report.html"})
class CucumberTestRunner {

}
