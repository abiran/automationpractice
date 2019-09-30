package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TshirtsPage extends BasePage {

    private List<WebElement> sortingResults = getDriver().findElements(By.cssSelector("div[class='product-image-container']"));
    private String addToCartBtnLocator = "Add to cart";
    private String modalLayerCartID = "layer_cart";

    public TshirtsPage(WebDriver driver) {
        super(driver);
    }

    public void addTshirtToCart(){
        Actions builder = new Actions(getDriver());
        //WebElement element = getDriver().findElement((By) sortingResults.get(0));
        builder.moveToElement(sortingResults.get(0)).build().perform();
        getDriver().findElement(By.linkText(addToCartBtnLocator)).click();
    }

    public String confirmSuccessMsg(){
        WebElement modal = getDriver().findElement(By.id(modalLayerCartID));
        WebDriverWait ewait1 = new WebDriverWait(getDriver(),10);
        ewait1.until(ExpectedConditions.visibilityOf(modal));

        String msg1 = modal.findElement(By.tagName("h2")).getText();
        return msg1;
    }
}
