package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;

import static org.testng.Assert.assertTrue;

public class LoginToExistingAccountTest extends BaseTest{

    @Test(groups = "Topete")
    public void createAccountSuccessfully() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = withPage().getSignInPage();

        signInPage.sendKeysAlreadyRegisteredEmailAddress("rodrigotr@gmail.com");
        signInPage.sendKeysAlreadyRegisteredPassword("Password1");
        signInPage.clickAlreadyRegisteredSignInButton();
        wait3Secs();

        MyAccountPage myAccountPage = withPage().getMyAccountPage();

        assertTrue(myAccountPage.getHeaderText().equals("MY ACCOUNT"));

        ConfirmationPage confirmationPage = withPage().getConfirmationPage();
        Assert.assertTrue(confirmationPage.confirmUserLogged());

        System.out.println("rtr");
    }


}
