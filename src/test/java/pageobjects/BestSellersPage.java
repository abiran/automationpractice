package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSellersPage extends BasePage{

    private String sortByLocator = "selectProductSort";
    private List<WebElement> sortingResults = getDriver().findElements(By.cssSelector("div[class='product-image-container']"));

    public BestSellersPage(WebDriver driver) {
        super(driver);
    }

    public void selectFilterForSorting(String option){
        dropdownSelect(sortByLocator, option);
    }

    public Boolean checkForStocks(){
        if (sortingResults.size()>0)
        return true;
        return false;
    }
}
