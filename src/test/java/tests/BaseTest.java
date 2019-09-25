package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver");
//        vendor no longer needed
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        wait3Secs();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    public void wait3Secs() throws InterruptedException {
        Thread.sleep(3000);
    }



}
