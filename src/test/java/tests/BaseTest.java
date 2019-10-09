package tests;

import java.io.IOException;
import java.security.SecureRandom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.PageFactory;

public class BaseTest {

    private WebDriver driver;
    private PageFactory _pageFactory;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver");
//        vendor no longer needed
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(setupChromeOptions()); //you could send setupChromeOptions as param
        driver.get("http://automationpractice.com/index.php");
        _pageFactory = new PageFactory( driver );
        wait3Secs();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException {
//        if(testResult.getStatus() == ITestResult.FAILURE){
//        String actualTest = this.getClass().getName() + "." + testResult.getMethod().getMethodName();
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs( OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("target/screenshots/"+actualTest+".png"));}
        driver.quit();
    }

    public ChromeOptions setupChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--headless" );
        return options;
    }



    public PageFactory withPage(){
        return _pageFactory;
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
