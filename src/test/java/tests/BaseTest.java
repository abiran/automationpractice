package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver");
//        vendor no longer needed
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getWebDriver(){
        return driver;
    }



}
