package ClasesToAll;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
//        comment this out if you with to run in headed mode
        options.addArguments("headless");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
