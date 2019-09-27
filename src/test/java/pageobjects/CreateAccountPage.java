package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

//Miriam Corona & Jorge Fimbres

    String radioButtonMr = "#id_gender1";
    String radioButtonMrs = "#id_gender2";
    String firstName = "customer_firstname";
    String lastName = "customer_lastname";
    String email = "email";
    String password = "passwd";
    String days = "#days";
    String months = "#months";
    String years = "#years";
    String newsletter = "#newsletter";
    String specialOffers = "#optin";
    String firstNameAddress = "firstname";
    String lastNameAddress = "lastname";
    String companyNameAddress = "company.form-control";
    String address1Address = "address1";
    String address2Address = "address2.form-control";
    String cityAddress = "city";
    String stateDropdownAddress = "id_state";
    String zipCodeAddress = "postcode";
    String countryDropdownAddress = "id_country";
    String additionalInfoAddress = "other.form-control";
    String homePhoneAddress = "phone.form-control";
    String mobilePhoneAddress = "phone_mobile";
    String addressAliasAddress = "alias";
    String registerButton = "submitAccount";
    By alert_danger = By.cssSelector("div[class='alert alert-danger']");


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    // Your personal information
    public void selectGenderMale() {
        getDriver().findElement(By.id(radioButtonMr)).click();
    }

    public void selectGenderFemale() {
        getDriver().findElement(By.id(radioButtonMrs)).click();
    }

    public void typeFirstNameCustomer(String firstNameCustomer){
        getDriver().findElement(By.id(firstName)).sendKeys(firstNameCustomer);
    }

    public void typeLastNameCustomer(String lastNameCustomer){
        getDriver().findElement(By.id(lastName)).sendKeys(lastNameCustomer);
    }

    public void typeEmail(String customerEmail){
        getDriver().findElement(By.id(email)).sendKeys(customerEmail);
    }

    public void typePassword(String customerPassword){
        getDriver().findElement(By.id(password)).sendKeys(customerPassword);
    }

    public void setDOB(String dayDOB, String monthDOB, String yearDOB){
        getDriver().findElement(By.id(days)).sendKeys(dayDOB);
        getDriver().findElement(By.id(months)).sendKeys(monthDOB);
        getDriver().findElement(By.id(years)).sendKeys(yearDOB);
    }

        // Your Address

    public void typeFirstNameAddress(String firstNameAddressValue){
        getDriver().findElement(By.id(firstNameAddress)).sendKeys(firstNameAddressValue);
    }

    public void typeLastNameAddress(String lastNameAddressValue){
        getDriver().findElement(By.id(lastNameAddress)).sendKeys(lastNameAddressValue);
    }

    public void typeCompanyNameAddress(String companyNameAddressValue){
        getDriver().findElement(By.id(companyNameAddress)).sendKeys(companyNameAddressValue);
    }

    public void typeAddress1Address(String address1AddressValue){
        getDriver().findElement(By.id(address1Address)).sendKeys(address1AddressValue);
    }

    public void typeAddress2Address(String address2AddressValue){
        getDriver().findElement(By.id(address2Address)).sendKeys(address2AddressValue);
    }

    public void typeCityAddress(String cityAddressValue){
        getDriver().findElement(By.id(cityAddress)).sendKeys(cityAddressValue);
    }

    public void selectStateAddress(String option){
        dropdownSelect(stateDropdownAddress, option);
    }


    public void typeZipCodeAddress(String zipCodeAddressValue){
        getDriver().findElement(By.id(zipCodeAddress)).sendKeys(zipCodeAddressValue);
    }

    public void selectCountryAddress(String option){
        dropdownSelect(countryDropdownAddress, option);
    }

    public void typeMobilePhoneAddress(String mobilePhoneAddressValue){
        getDriver().findElement(By.id(mobilePhoneAddress)).sendKeys(mobilePhoneAddressValue);
    }

    public void typeAliasAddress(String aliasAddressValue){
        getDriver().findElement(By.id(addressAliasAddress)).sendKeys(aliasAddressValue);
    }

    public void clickRegisterButton(){
        getDriver().findElement(By.id(registerButton)).click();
    }

    public Boolean isAlertDisplayed(){
       return getDriver().findElement(alert_danger).isDisplayed();
    }

    //added by Lemma
    public String getAlertMessage() {return getDriver().findElement(alert_danger).getText();}

}
