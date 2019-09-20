package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// Jorge Valdez
public class MyAccountPage extends BasePage{

    String btnOrderHistory = "#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a > span";
    String btnMyCreditSlips = "#center_column > div > div:nth-child(1) > ul > li:nth-child(2) > a > span";
    String btnMyAddresses = "#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a > span";
    String btnMyPersonalInformation = "#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span";
    String btnMyWishlists = "#center_column > div > div:nth-child(2) > ul > li > a > span";


    public MyAccountPage(WebDriver driver) {
        super( driver );
    }

    public void clickbtnOrderHistory(){
        getDriver().findElement( By.className(btnOrderHistory) ).click();
    }

    public void clickbtnMyCreditSlips(){
        getDriver().findElement( By.className(btnMyCreditSlips) ).click();
    }

    public void clickbtnMyAddresses(){
        getDriver().findElement( By.className(btnMyAddresses) ).click();
    }

    public void clickbtnMyPersonalInformation(){
        getDriver().findElement( By.className(btnMyPersonalInformation) ).click();
    }

    public void clickbtnMyWishlists(){
        getDriver().findElement( By.className(btnMyWishlists) ).click();
    }

}
