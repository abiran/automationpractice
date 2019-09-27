package tests;


import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class ValidatePersonalInfo extends BaseTest {

    @Test
    public void validatePersonalInfo() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = new SignInPage(getWebDriver());
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver()); // Instancia de Create Account Page
        createAccountPage.clickRegisterButton(); // Click button
        // assertTrue(getWebDriver().findElement(By.cssSelector(".alert-danger")).isDisplayed());
        createAccountPage.isAlertDisplayed(); // Confirms the error message is displayed

    }

}