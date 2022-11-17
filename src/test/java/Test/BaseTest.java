package Test;

import configs.ConfigHolder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest extends ConfigHolder {
    WebDriver driver;

    @BeforeClass
    void initialize() {
        WebDriverManager.chromedriver().setup();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = (WebDriver) new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = (WebDriver) new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(getBaseURL());
    }

    @AfterTest(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
