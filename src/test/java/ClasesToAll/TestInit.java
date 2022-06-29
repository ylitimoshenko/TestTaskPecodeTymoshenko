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
    boolean headless = false;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        options.setHeadless(headless);
        driver = new ChromeDriver(options);
        if (headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
