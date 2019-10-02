package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BestSellersPage;
import pageobjects.HomePage;

public class BestSellersInStockTest extends BaseTest {

    @Test(groups = "Alejandro")
    public void testBestSellersForStock() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.bestSellersClick();
        wait3Secs();

        BestSellersPage bestSellersPage = withPage().getBestSellersPage();
        bestSellersPage.selectFilterForSorting("In stock");
        wait3Secs();
        Assert.assertTrue(bestSellersPage.checkForStocks());
    }

    @Test(groups = "Alejandro")
    public void testBestSellersForStockZero() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.bestSellersClick();
        wait3Secs();

        BestSellersPage bestSellersPage = withPage().getBestSellersPage();
        bestSellersPage.selectFilterForSorting("In stock");
        wait3Secs();
        Assert.assertFalse(bestSellersPage.checkForStocks());
    }
}
