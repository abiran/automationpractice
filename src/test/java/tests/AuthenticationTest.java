package tests;

import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class AuthenticationTest extends BaseTest {

    @Test
    public void IsAuthenticationPageDisplayed() throws InterruptedException {
        HomePage homepage = new HomePage(getWebDriver());
        SignInPage signInPage = new SignInPage(getWebDriver());
        homepage.SignInClick();
        wait3Secs();
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
    public void createAccountWithInvalidEmail() throws InterruptedException {
        SignInPage signInPage = new SignInPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("thisisnotanemail");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithRegisteredEmail() throws InterruptedException {
        SignInPage signInPage = new SignInPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("miriam_nearsoft@mailinator.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithValidEmail() throws InterruptedException {
        SignInPage signInPage = new SignInPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());
        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("mcorona_test@mailinator.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(createAccountPage.isPageTitleDisplayed());
    }

}
