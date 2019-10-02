package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.TshirtsPage;

public class TestAddTshirtToCart extends BaseTest {

    @Test(groups = "Alejandro")
    public void testAddTshirtToCart() throws InterruptedException {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.tshirtsClick();
        wait3Secs();

        TshirtsPage tshirtsPage = new TshirtsPage(getWebDriver());
        tshirtsPage.addTshirtToCart();
        wait3Secs();

        Assert.assertEquals(tshirtsPage.confirmSuccessMsg(),"Product successfully added to your shopping cart");
    }
}
