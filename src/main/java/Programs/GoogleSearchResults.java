package Programs;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchResults {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\AutomationDrivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String srearchText = "World";
        for (int i = 0; i < 5; i++) {
            WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='World';", searchBox);
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ENTER).build().perform();
            WebElement res = driver.findElement(By.cssSelector("div#result-stats"));
            String result = res.getText();
            Long output = Long.valueOf(StringUtils.substringBetween(result, "About ", " results"));
            srearchText = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div[1]/a/h3\n")).getText();
        }
    }

    public static void main(String[] param) {
        init();
    }
}
