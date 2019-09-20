package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Lemma
public class HomePage extends BasePage {

    private By ContactUsLocator = By.cssSelector("#contact-link > a");
    private By SignInLocator = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    private By SearchLocator = By.id("search_query_top");

    private By womenOption = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private By dressesOption = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By tshirtsOption = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ClickWomenOption(By locator) {

        getDriver().findElement(womenOption).click();

    }

}
