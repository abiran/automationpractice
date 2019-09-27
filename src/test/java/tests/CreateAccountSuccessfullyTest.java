package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;

import static org.testng.Assert.assertTrue;

public class CreateAccountSuccessfullyTest extends BaseTest{


    @Test
    public void createAccountSuccessfully() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = new SignInPage(getWebDriver());

        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail());
        signInPage.clickCreateAccountButton();
        wait3Secs();

        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());
        //wait3Secs();
        createAccountPage.selectGenderMale();
        createAccountPage.typeFirstNameCustomer("Rodrigo");
        createAccountPage.typeLastNameCustomer("Topete");
        createAccountPage.typePassword("Password1");
        createAccountPage.setDOB("10","October","1980");
        createAccountPage.typeFirstNameAddress("Rodrigo");
        createAccountPage.typeLastNameAddress("Topete");
        createAccountPage.typeAddress1Address("123 Street");
        createAccountPage.typeCityAddress("City1");
        createAccountPage.selectStateAddress("Arizona");
        createAccountPage.typeZipCodeAddress("00000");
        createAccountPage.selectCountryAddress("United States");
        createAccountPage.typeMobilePhoneAddress("1212121212");
        createAccountPage.clickRegisterButton();
        wait3Secs();

        MyAccountPage myAccountPage = new MyAccountPage(getWebDriver());

        assertTrue(myAccountPage.getHeaderText().equals("MY ACCOUNT"));

        ConfirmationPage confirmationPage = new ConfirmationPage(getWebDriver());
        Assert.assertTrue(confirmationPage.confirmUserLogged());

        System.out.println("rtr");


    }
}
