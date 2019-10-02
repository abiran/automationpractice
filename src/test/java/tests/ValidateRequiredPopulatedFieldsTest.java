package tests;


import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

//Lemma Rivera
public class ValidateRequiredPopulatedFieldsTest extends BaseTest {

    @Test(groups = "lemma")
    public void ValidateRequiredPopulatedFieldsTest() throws InterruptedException {

    HomePage homePage = withPage().getHomePage();
    homePage.SignInClick();

    SignInPage signInPage = withPage().getSignInPage();
    signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail());
    signInPage.clickCreateAccountButton();
    wait3Secs();

    CreateAccountPage createAccountPage = withPage().getCreateAccountPage();
    createAccountPage.clickRegisterButton();

    assertTrue(createAccountPage.isAlertDisplayed());
    assertTrue(createAccountPage.getAlertMessage().contains("must register at least one phone number"));
    assertTrue(createAccountPage.getAlertMessage().contains("lastname is required"));
    assertTrue(createAccountPage.getAlertMessage().contains("firstname is required"));
    assertTrue(createAccountPage.getAlertMessage().contains("passwd is required"));
    assertTrue(createAccountPage.getAlertMessage().contains("address1 is required"));
    assertTrue(createAccountPage.getAlertMessage().contains("city is required"));
    assertTrue(createAccountPage.getAlertMessage().contains("Zip/Postal code you've entered is invalid"));
    assertTrue(createAccountPage.getAlertMessage().contains("requires you to choose a State"));

   }
}
