package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.TshirtsPage;

public class TestRemoveAllFromCart extends BaseTest {

    @Test
    public void testRemoveFromCart(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.removeAllFromCart();

        Assert.assertTrue(homePage.isCartEmpty());
    }



}
