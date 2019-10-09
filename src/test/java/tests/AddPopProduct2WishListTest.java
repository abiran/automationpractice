package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.PopularProductMorePage;

public class AddPopProduct2WishListTest extends BaseTest {

    @Test(groups = "Alejandro")
    public void noLogAdditionTest() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.seeMoreOfPopProduct();
        wait3Secs();
        PopularProductMorePage popularProductMorePage = withPage().getPopularProductMorePage();
        popularProductMorePage.add2WishesList();
        Assert.assertEquals(popularProductMorePage.getPopUpMessage(),"You must be logged in to manage your wishlist.");
    }
}
