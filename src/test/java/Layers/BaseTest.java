package Layers;

import Utils.ReportReader;
import Utils.TestDataReader;
import configs.ConfigHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends TestDataReader {
    public static WebDriver driver;
    public static ConfigHolder configHolder;
    protected static final Logger log = LoggerFactory.getLogger("Logger");
    public ReportReader reportReader = new ReportReader();

    @BeforeTest(alwaysRun = true)
    public void initialize() {
        System.out.println(configHolder.get().webBaseCountry());
        System.out.println(configHolder.get().webBaseDepartment());
        System.out.println(configHolder.get().webBaseState());
        System.out.println(configHolder.get().webBaseURL());
        if (configHolder.get().browser().equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\AutomationDrivers\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (configHolder.get().browser().equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        //driver1.findElement()
        driver.get(configHolder.);
        reportReader.reportCreation();
    }

    @AfterTest(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
