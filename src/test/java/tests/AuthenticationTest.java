package tests;

import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class AuthenticationTest extends BaseTest {

    @Test
    public void IsAuthenticationPageDisplayed() throws InterruptedException {
        HomePage homepage = withPage().getHomePage();
        SignInPage signInPage = withPage().getSignInPage();
        homepage.SignInClick();
        wait3Secs();
        assertTrue(signInPage.getHeaderText().equals("AUTHENTICATION"));
    }

    @Test
    public void createAccountWithEmptyEmail() throws InterruptedException {
        SignInPage signInPage = withPage().getSignInPage();
        HomePage homePage = withPage().getHomePage();

        homePage.SignInClick();
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithInvalidEmail() throws InterruptedException {
        SignInPage signInPage = withPage().getSignInPage();
        HomePage homePage = withPage().getHomePage();

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("thisisnotanemail");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithRegisteredEmail() throws InterruptedException {
        SignInPage signInPage = withPage().getSignInPage();
        HomePage homePage = withPage().getHomePage();

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("miriam_nearsoft@mailinator.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(signInPage.createAccountError());
    }

    @Test
    public void createAccountWithValidEmail() throws InterruptedException {
        SignInPage signInPage = withPage().getSignInPage();
        HomePage homePage = withPage().getHomePage();
        CreateAccountPage createAccountPage = withPage().getCreateAccountPage();

        homePage.SignInClick();
        signInPage.sendKeysCreateAccountEmailAddress("mcorona_test@mailinator.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        assertTrue(createAccountPage.isPageTitleDisplayed());
    }

}
