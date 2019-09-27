package tests;

import java.security.SecureRandom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver");
//        vendor no longer needed
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //you could send setupChromeOptions as param
        driver.get("http://automationpractice.com/index.php");
        wait3Secs();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public ChromeOptions setupChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--headless" );
        return options;
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    public void wait3Secs() throws InterruptedException {
        Thread.sleep(3000);
    }

    public String getRandomEmail(){
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        String NUMBER = "0123456789";
        String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
            // debugx
            sb.append(rndChar);
        }
        return sb.toString() + "@testing.com";
    }
}
