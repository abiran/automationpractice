package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ConfirmationPage;
import pageobjects.CreateAccountPage;
import pageobjects.HomePage;
import pageobjects.MyAccountPage;
import pageobjects.SignInPage;

import static org.testng.Assert.assertTrue;

//Alejandro Ramirez
public class CreateAccountFormatTest extends BaseTest {

    @Test
    public void requiredFieldsFormatSucceded() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = new SignInPage(getWebDriver());
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail());
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
        createAccountPage.clickRegisterButton();

        wait3Secs();

        ConfirmationPage confirmationPage = new ConfirmationPage(getWebDriver());
        Assert.assertTrue(confirmationPage.confirmUserLogged());



    }

    @Test
    public void requiredFieldsFormatFailed() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.SignInClick();
        wait3Secs();
        SignInPage signInPage = new SignInPage(getWebDriver());
        signInPage.sendKeysCreateAccountEmailAddress(getRandomEmail());
        signInPage.clickCreateAccountButton();
        wait3Secs();

        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());

        createAccountPage.typeFirstNameCustomer("1121212");
        createAccountPage.typeLastNameCustomer("343434");
        createAccountPage.typeEmail("21212.dd.com");
        createAccountPage.typePassword("pass");
        createAccountPage.typeFirstNameAddress("Alejo");
        createAccountPage.typeLastNameAddress("Ramirez");
        createAccountPage.typeAddress1Address("Street 02 number45");
        createAccountPage.typeCityAddress("!@2@");
        createAccountPage.selectStateAddress("-");
        createAccountPage.typeZipCodeAddress("1273918273937");
        createAccountPage.selectCountryAddress("-");
        createAccountPage.typeMobilePhoneAddress("asasassqwq");
        createAccountPage.clickRegisterButton();
        wait3Secs();

        Assert.assertTrue(createAccountPage.isAlertDisplayed());
    }

    //rtr
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

        System.out.println("rtr");


    }
}
