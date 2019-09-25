package tests;


import org.testng.annotations.Test;
import pageobjects.HomePage;

public class ValidatePersonalInfo extends BaseTest {

    @Test
    public void validatePersonalInfo() {
        HomePage homePage = new HomePage(getWebDriver());

        homePage.SignInClick();

        // CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());




    }

}

//