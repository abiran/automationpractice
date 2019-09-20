package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
