package tests;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AuthenticationPageTest extends BaseTest {

    @Test

    public void IsAuthenticationPageDisplayed(){

        HomePage homePage = new HomePage(getWebDriver());
        SignInPage signInPage = new SignInPage(getWebDriver());

        homePage.SignInClick();

        wait3Secs();

        assertTrue(signInPage.getHeaderText().equals("AUTHENTICATION"));





    }


}
