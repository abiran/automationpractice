package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class AuthenticationTest extends BaseTest {

    @Test
    public void IsAuthenticationPageDisplayed(){
        HomePage homepage = new HomePage(getWebDriver());
        SignInPage signInPage = new SignInPage(getWebDriver());
        homepage.SignInClick();
        assertTrue(signInPage.getHeaderText().equals("AUTHENTICATION"));
    }

    @Test
    public void createAccountWithEmptyEmail(){
        SignInPage signInPage = new SignInPage(getWebDriver());

        signInPage.clickCreateAccountButton();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithInvalidEmail(){
    }

    @Test
    public void createAccountWithRegisteredEmail(){

    }

    @Test
    public void createAccountWithalValidEmail(){}

}
