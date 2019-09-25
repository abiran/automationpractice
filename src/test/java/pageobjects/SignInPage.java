package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rodrigo Topete

public class SignInPage extends BasePage {

    String headerTextCSS = "#center_column > h1";
    String createAccountEmailAddressCSS = "#email_create";
    String createAccountButtonCSS = "#SubmitCreate";
    String alreadyRegisteredEmailAddressCSS = "#email";
    String alreadyRegisteredPasswordCSS = "#passwd";
    String alreadyRegisteredForgotPasswordCSS = "#login_form div p:nth-child(1)";
    String alreadyRegisteredSignInButtonCSS = "#SubmitLogin";



    public SignInPage(WebDriver driver) {

        super( driver );
    }

    public String getHeaderText(){
        String headerTxt="";
        headerTxt = getDriver().findElement(By.cssSelector(headerTextCSS)).getText();
        return headerTxt;
    }

    public void clickCreateAccountEmailAddress(){
        getDriver().findElement(By.cssSelector(createAccountEmailAddressCSS)).click();
    }

    public void clickCreateAccountButton(){
        getDriver().findElement(By.cssSelector(createAccountButtonCSS)).click();
    }

    public void clickAlreadyRegisteredEmailAddress(){
        getDriver().findElement(By.cssSelector(alreadyRegisteredEmailAddressCSS)).click();
    }

    public void clickAlreadyRegisteredPassword(){
        getDriver().findElement(By.cssSelector(alreadyRegisteredPasswordCSS)).click();
    }

    public void clickAlreadyRegisteredForgotPasswordURL(){
        getDriver().findElement(By.cssSelector(alreadyRegisteredForgotPasswordCSS)).click();
    }

    public void clickAlreadyRegisteredSignInButton(){
        getDriver().findElement(By.cssSelector(alreadyRegisteredSignInButtonCSS)).click();
    }

    public void sendKeysCreateAccountEmailAddress(String email){
        getDriver().findElement(By.cssSelector(createAccountEmailAddressCSS)).sendKeys(email);
    }


}
