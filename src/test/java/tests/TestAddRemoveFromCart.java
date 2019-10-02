package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestAddRemoveFromCart extends BaseTest {

    @Test(groups = "Alejandro")
    public void addThreeProductsToTheCart() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.add3PopularPorductsToCart();

        Assert.assertFalse(homePage.isCartEmpty());
    }

    @Test(priority = 1, groups = "Alejandro")
    public void testRemoveFromCart() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());

        homePage.removeAllFromCart();

        Assert.assertTrue(homePage.isCartEmpty());
    }



}
