package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

//Alejandro Ramirez

public class ConfirmationPage extends BasePage {

    private List<WebElement> headerUserInfo = getDriver().findElements(By.cssSelector("div[class='header_user_info']"));

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public Boolean confirmUserLogged(){
        if (headerUserInfo.get(0).getText().contains("Sign out") || headerUserInfo.get(1).getText().contains("Sign out"))
            return true;
        return false;
    }
}
