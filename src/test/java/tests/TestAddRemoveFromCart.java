package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestAddRemoveFromCart extends BaseTest {

    @Test
    public void addThreeProductsToTheCart() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.add3PopularPorductsToCart();

        Assert.assertFalse(homePage.isCartEmpty());
    }

    @Test(priority = 1)
    public void testRemoveFromCart() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());

        homePage.removeAllFromCart();

        Assert.assertTrue(homePage.isCartEmpty());
    }



}
