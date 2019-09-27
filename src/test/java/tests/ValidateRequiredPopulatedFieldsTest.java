package tests;


import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class ValidateRequiredPopulatedFieldsTest extends BaseTest {

    @Test
    public void ValidateRequiredPopulatedFieldsTest() throws InterruptedException {

    HomePage homePage = new HomePage(getWebDriver());
    homePage.SignInClick();

    SignInPage signInPage = new SignInPage(getWebDriver());
    signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail());
    signInPage.clickCreateAccountButton();
    wait3Secs();

    CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());
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
