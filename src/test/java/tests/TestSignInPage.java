package tests;

import org.testng.annotations.Test;
import pageobjects.SignInPage;

public class TestSignInPage extends BaseTest{

    @Test

    public void createNewAccount(){
        SignInPage signInPage = withPage().getSignInPage();
        signInPage.sendKeysCreateAccountEmailAddress("newEmail@email.com");
        signInPage.clickCreateAccountButton();
    }

}
