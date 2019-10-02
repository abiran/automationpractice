package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends PageFactory{

    public BasePage (WebDriver driver){
        super(driver);
    }

    public void click(String cssSelector){
        getDriver().findElement(By.cssSelector(cssSelector)).click();
    }

    public void dropdownSelect(String element, String option){
        WebElement dropdown = getDriver().findElement(By.id(element));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByVisibleText(option);
    }

}
