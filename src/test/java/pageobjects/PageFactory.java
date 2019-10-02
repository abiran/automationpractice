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

    public SignInPage getSignInPage(){
        return new SignInPage( getDriver() );
    }

    public TshirtsPage getTshirtsPage(){
        return new TshirtsPage( getDriver() );
    }
    public BestSellersPage getBestSellersPage(){
        return new BestSellersPage( getDriver() );
    }


    public CreateAccountPage getCreateAccountPage() { return new CreateAccountPage( getDriver());}
}
