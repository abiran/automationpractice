package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.TshirtsPage;

public class TestAddTshirtToCart extends BaseTest {

    @Test(groups = "Alejandro")
    public void testAddTshirtToCart() throws InterruptedException {
        HomePage homePage = withPage().getHomePage();
        homePage.tshirtsClick();
        wait3Secs();

        TshirtsPage tshirtsPage = withPage().getTshirtsPage();
        tshirtsPage.addTshirtToCart();
        wait3Secs();

        Assert.assertEquals(tshirtsPage.confirmSuccessMsg(),"Product successfully added to your shopping cart");
    }
}
