package tests;

import org.testng.annotations.Test;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;

//Alejandro Ramirez
public class CreateAccountFormatTest extends BaseTest {

    @Test
    public void requiredFieldsFormatSucceded() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = new SignInPage(getWebDriver());
        signInPage.sendKeysCreateAccountEmailAddress("alejandro@gmail.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();

        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());

        createAccountPage.typeFirstNameCustomer("Alejo");
        createAccountPage.typeLastNameCustomer("Ramirez");
        createAccountPage.typePassword("Password1");
        createAccountPage.typeFirstNameAddress("Alejo");
        createAccountPage.typeLastNameAddress("Ramirez");
        createAccountPage.typeAddress1Address("Street 02 number45");
        createAccountPage.typeCityAddress("City1");
        createAccountPage.selectStateAddress("Alabama");
        createAccountPage.typeZipCodeAddress("00000");
        createAccountPage.selectCountryAddress("United States");
        createAccountPage.typeMobilePhoneAddress("1212121212");

    }

    @Test
    public void requiredFieldsFormatFailed() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = new SignInPage(getWebDriver());
        signInPage.sendKeysCreateAccountEmailAddress("alejandro@gmail.com");
        signInPage.clickCreateAccountButton();
        wait3Secs();
        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());

        createAccountPage.typeFirstNameCustomer("1121212");
        createAccountPage.typeLastNameCustomer("343434");
        createAccountPage.typePassword("pass");
        createAccountPage.typeFirstNameAddress("Alejo");
        createAccountPage.typeLastNameAddress("Ramirez");
        createAccountPage.typeAddress1Address("Street 02 number45");
        createAccountPage.typeCityAddress("!@2@");
        createAccountPage.selectStateAddress("-");
        createAccountPage.typeZipCodeAddress("1273918273937");
        createAccountPage.selectCountryAddress("-");
        createAccountPage.typeMobilePhoneAddress("asasassqwq");
    }
}
