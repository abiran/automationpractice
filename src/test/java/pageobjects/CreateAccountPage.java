package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

//Miriam Corona & Jorge Fimbres

    String radioButtonMr = "#id_gender1";
    String radioButtonMrs = "#id_gender2";
    String firstName = "#customer_firstname";
    String lastName = "#customer_lastname";
    String email = "#email";
    String password = "#passwd";
    String days = "#days";
    String months = "#months";
    String years = "#years";
    String newsletter = "#newsletter";
    String specialOffers = "#optin";
    String firstNameAddress = "#firstname.form-control";
    String lastNameAddress = "#lastname.form-control";
    String companyNameAddress = "#company.form-control";
    String address1Address = "#address1.form-control";
    String address2Address = "#address2.form-control";
    String cityAddress = "#city.form-control";
    String stateDropdownAddress = "#id_state.form-control";
    String zipCodeAddress = "#postcode.form-control";
    String countryDropdownAddress = "#id_country.form-control";
    String additionalInfoAddress = "#other.form-control";
    String homePhoneAddress = "#phone.form-control";
    String mobilePhoneAddress = "#phone_mobile.form-control";
    String addressAliasAddress = "#alias.form-control";
    String registerButton = "#submitAccount";


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    // Your personal information



    // Your Address

    public void typeFirstNameAddress(){
        getDriver().findElement(By.id(firstNameAddress)).sendKeys("Miriam");
    }

    public void typeLastNameAddress(){
        getDriver().findElement(By.id(lastNameAddress)).sendKeys("Corona");
    }

    public void typeCompanyNameAddress(){
        getDriver().findElement(By.id(companyNameAddress)).sendKeys("Nearsoft");
    }

    public void typeAddress1Address(){
        getDriver().findElement(By.id(address1Address)).sendKeys("Blvd. Quiroga 21");
    }

    public void typeAddress2Address(){
        getDriver().findElement(By.id(address2Address)).sendKeys("Int. 1");
    }

    public void typeCityAddress(){
        getDriver().findElement(By.id(cityAddress)).sendKeys("Phoenix");
    }

    public void selectStateAddress(){
        getDriver().findElement(By.id(stateDropdownAddress)).sendKeys("AZ");
    }
}
