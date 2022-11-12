package Test;

import configs.ConfigHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends ConfigHolder {
    public static WebDriver driver;
    protected static final Logger log = LoggerFactory.getLogger("Logger");

    @BeforeTest(alwaysRun = true)
    public void initialize() {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\AutomationDrivers\\chromedriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--headless"); //!!!should be enabled for Jenkins
            options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
            options.addArguments("--window-size=1920x1080");
            driver = (WebDriver) new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "");
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
