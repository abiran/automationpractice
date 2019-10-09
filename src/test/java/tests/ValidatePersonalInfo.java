package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

public class ValidatePersonalInfo extends BaseTest {

    @Test (groups = "David")
    public void validatePersonalInfo() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage();
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create Account Page
        createAccountPage.clickRegisterButton(); // Click button
        // assertTrue(getWebDriver().findElement(By.cssSelector(".alert-danger")).isDisplayed());
        createAccountPage.isAlertDisplayed(); // Confirms the error message is displayed

    }

    @Test (groups = "David")
    public void validateAllFieldsMinusFirstName() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeLastNameCustomer("lastono");
        createAccountPage.typeEmail("firsto.lastono@yopmail.com");
        createAccountPage.typePassword("supersecretpassword");
        createAccountPage.setDOB("01", "01", "1990");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button
        // assertTrue(getWebDriver().findElement(By.cssSelector(".alert-danger")).isDisplayed());
        createAccountPage.isAlertDisplayed(); // Confirms the error message is displayed

    }

    @Test (groups = "David")
    public void validateAllFieldsMinusLastName() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeFirstNameCustomer("first name");
        createAccountPage.typeEmail("firsto.lastono@yopmail.com");
        createAccountPage.typePassword("supersecretpassword");
        createAccountPage.setDOB("01", "01", "1990");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button on Create Account Page
        Assert.assertTrue(createAccountPage.isLastNameMissing());// Confirms that the last name is missing
    }

    @Test (groups = "David")
    public void validateAllFieldsMinusEmail() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeFirstNameCustomer("first name");
        createAccountPage.typeLastNameCustomer("lasto blasto");
        createAccountPage.typePassword("supersecretpassword");
        createAccountPage.setDOB("01", "01", "1990");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button on Create Account Page
        createAccountPage.isEmailMissing();      // Confirms that the email is missing
    }

    @Test (groups = "David")
    public void validateAllFieldsMinusPassword() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeFirstNameCustomer("first name");
        createAccountPage.typeLastNameCustomer("lasto blasto");
        createAccountPage.setDOB("01", "01", "1990");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button on Create Account Page
        createAccountPage.isPasswordMissing(); // Confirms that the password is missing
    }

    @Test (groups = "David")
    public void validateAllFieldsMinusCity() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeFirstNameCustomer("first name");
        createAccountPage.typeLastNameCustomer("lasto blasto");
        createAccountPage.typePassword("supersecretpassword123");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button on Create Account Page
        createAccountPage.isCityMissing(); // Confirms that the City is missing
    }

    @Test (groups = "David")
    public void validateAllFieldsMinusZip() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.SignInClick(); // Sign in into page
        wait3Secs();

        SignInPage signInPage = withPage().getSignInPage(); // Opens Sign In page
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail()); // Type email to login
        signInPage.clickCreateAccountButton(); // Click button to login
        wait3Secs();

        CreateAccountPage createAccountPage = withPage().getCreateAccountPage(); // Instancia de Create account page
        createAccountPage.typeFirstNameCustomer("first name");
        createAccountPage.typeLastNameCustomer("lasto blasto");
        createAccountPage.typePassword("supersecretpassword123");
        wait3Secs();

        createAccountPage.clickRegisterButton(); // Click button on Create Account Page
        createAccountPage.isZipMissing(); // Confirms that the City is missing
    }
}