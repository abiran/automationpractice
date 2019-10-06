package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularProductMorePage extends BasePage {

    private String add2WishesListId = "wishlist_button";
    private String popUpAlertClassSelector = "#product > div.fancybox-overlay.fancybox-overlay-fixed > div";
    private String popUpMessage = "";
    private By optionsLocator = By.cssSelector("div[class='box-cart-bottom']");

    public PopularProductMorePage(WebDriver driver) {
        super(driver);
    }

    public void add2WishesList() throws InterruptedException {
        getDriver().findElement(By.id(add2WishesListId)).click();
        Thread.sleep(2000);
        popUpMessage = getDriver().findElement(By.cssSelector(popUpAlertClassSelector)).findElement(By.tagName("p")).getText();
    }

    public String getPopUpMessage() {
        return popUpMessage;
    }
}
