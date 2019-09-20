package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EquisPage extends BasePage {

    String buttonCss = "classButton";

    public EquisPage(WebDriver driver) {
        super( driver );
    }

    public void clickElemento(){
        getDriver().findElement( By.className(buttonCss) ).click();
    }

}
