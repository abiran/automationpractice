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
    public void createAccountWithEmptyEmail() throws InterruptedException {
        SignInPage signInPage = new SignInPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        signInPage.clickCreateAccountButton();
        wait3Secs();
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
