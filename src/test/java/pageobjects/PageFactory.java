package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageFactory {

    final private WebDriver _driver;

    public PageFactory(WebDriver driver){
        _driver = driver;
    }

    public WebDriver getDriver(){
        return _driver;
    }

    public HomePage getHomePage(){
        return new HomePage( getDriver() );
    }

    public CreateAccountPage getCreateAccountPage() { return new CreateAccountPage( getDriver());}
}
