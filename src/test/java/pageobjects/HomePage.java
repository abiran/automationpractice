package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


//Lemma
public class HomePage extends BasePage {

    private By ContactUsLocator = By.cssSelector("#contact-link > a");
    private By SignInLocator = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    private By SearchLocator = By.id("search_query_top");

    private By womenOption = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private By dressesOption = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By tshirtsOption = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private By bestSellersLocator = By.linkText("Best sellers");
    private By cartLocator = By.className("shopping_cart");
    private By contentPopularTab = By.cssSelector("ul[class='product_list grid row homefeatured tab-pane active']");
    private String modalLayerCartID = "layer_cart";
    private String addToCartBtnLocator = "Add to cart";
    private String moreBtnLocator = "More";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ClickWomenOption(By locator) {

        getDriver().findElement(womenOption).click();

    }

    public void SignInClick() {

        getDriver().findElement(SignInLocator).click();

    }
    //by Alejandro
    public void bestSellersClick(){
        getDriver().findElement(bestSellersLocator).click();
    }
    //by Alejandro
    public void tshirtsClick(){
        getDriver().findElement(tshirtsOption).click();
    }
    //by Alejandro
    public Boolean isCartEmpty(){
        boolean result = false;
        WebElement cartQty = getDriver().findElement(cartLocator).findElements(By.tagName("span")).get(0);
        if (cartQty.getAttribute("style").equals("") || cartQty.getAttribute("style").equals("display: none;"))
            result = true;

        return result;
    }
    //by Alejandro
    public void removeAllFromCart() throws InterruptedException {

        while (!isCartEmpty()){
            Actions builder = new Actions(getDriver());
            builder.moveToElement(getDriver().findElement(cartLocator).findElements(By.tagName("a")).get(0)).build().perform();
            Thread.sleep(2000);
            getDriver().findElement(By.className("ajax_cart_block_remove_link")).click();
        }
    }

    //by Alejandro
    public void add3PopularPorductsToCart() throws InterruptedException {
        List<WebElement> productList = getDriver().findElement(contentPopularTab).findElements(By.tagName("li"));
        Actions builder = new Actions(getDriver());
        for (int i = 0; i < 3; i++) {
            builder.moveToElement(productList.get(i)).build().perform();
            Thread.sleep(2000);
            getDriver().findElement(By.linkText(addToCartBtnLocator)).click();

            WebElement modal = getDriver().findElement(By.id(modalLayerCartID));
            WebDriverWait ewait1 = new WebDriverWait(getDriver(),10);
            ewait1.until(ExpectedConditions.visibilityOf(modal));
            getDriver().findElement(By.className("cross")).click();
        }
    }

    //by Alejandro
    public void seeMoreOfPopProduct() throws InterruptedException {
        List<WebElement> productList = getDriver().findElement(contentPopularTab).findElements(By.tagName("li"));
        Actions builder = new Actions(getDriver());
        builder.moveToElement(productList.get(0)).build().perform();
        Thread.sleep(2000);
        getDriver().findElement(By.linkText(moreBtnLocator)).click();
    }

}
