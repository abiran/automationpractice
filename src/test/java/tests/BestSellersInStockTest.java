package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BestSellersPage;
import pageobjects.HomePage;

public class BestSellersInStockTest extends BaseTest {

    @Test
    public void testBestSellersForStock() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.bestSellersClick();
        wait3Secs();

        BestSellersPage bestSellersPage = new BestSellersPage(getWebDriver());
        bestSellersPage.selectFilterForSorting("In stock");
        wait3Secs();
        Assert.assertTrue(bestSellersPage.checkForStocks());
    }

    @Test
    public void testBestSellersForStockZero() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.bestSellersClick();
        wait3Secs();

        BestSellersPage bestSellersPage = new BestSellersPage(getWebDriver());
        bestSellersPage.selectFilterForSorting("In stock");
        wait3Secs();
        Assert.assertFalse(bestSellersPage.checkForStocks());
    }
}