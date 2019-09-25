package pageobjects;

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

}
