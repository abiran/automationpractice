package pageobjects;

import java.security.SecureRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    private WebDriver _driver;

    public BasePage (WebDriver driver){
        _driver = driver;
    }

    public WebDriver getDriver(){
        return _driver;
    }

    public void click(String cssSelector){
        _driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void dropdownSelect(String element, String option){
        WebElement dropdown = _driver.findElement(By.cssSelector(element));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByVisibleText(option);
    }

    public String getRandomEmail(){
        final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        final String NUMBER = "0123456789";

        final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        SecureRandom random = new SecureRandom();


        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {

            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            // debug
            System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar);

        }

        return sb.toString() + "@testing.com";

    }

}
