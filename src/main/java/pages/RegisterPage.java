package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class RegisterPage extends MethodHandles {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    Select select;

    public final By userSignUpText = By.cssSelector("div[class='signup-form'] h2");
    public final By registerName = By.name("name");
    public final By registerEmail = By.cssSelector("input[data-qa='signup-email']");
    public final By registerBtn = By.cssSelector("button[data-qa='signup-button']");
    public final By enterAccountText = By.xpath("//b[normalize-space()='Enter Account Information']");
    public final By fillTitle = By.cssSelector("#id_gender1");
    public final By fillName = By.cssSelector("#name");
    public final By fillEmail = By.cssSelector("#email");
    public final By fillPassword = By.cssSelector("#password");
    public final By fillDateOfBirth1 = By.id("days");
    public final By fillDateOfBirth2 = By.id("months");
    public final By fillDateOfBirth3 = By.id("years");
    public final By clickSignUpNewsletter = By.id("newsletter");
    public final By clickReceiveSpecialOffers = By.cssSelector("#optin");
    public final By firstNameAddress = By.name("first_name");
    public final By lastNameAddress = By.name("last_name");
    public final By companyAddress = By.name("company");
    public final By AddressName1 = By.name("address1");
    public final By AddressName2 = By.name("address2");
    public final By countryName = By.name("country");
    public final By stateName = By.name("state");
    public final By cityName = By.name("city");
    public final By zipcodeName = By.name("zipcode");
    public final By mobileNumber1 = By.name("mobile_number");
    public final By createAccountBtn = By.cssSelector("button[data-qa='create-account']");
    public final By accountCreatedText = By.xpath("//h2[@class='title text-center']/b");
    public final By continueBtn = By.linkText("Continue");
    public final By loggedInUserName = By.cssSelector("li:nth-child(10) a:nth-child(1)");
    public final By deleteAccountBtn = By.cssSelector("a[href='/delete_account']");
    public final By accountDeletedText = By.cssSelector("h2[class='title text-center'] b");
    public final By continueDeleteBtn = By.linkText("Continue");



     
    public String userSignUpTextVisible(){
        return getText(userSignUpText , 3);
    }

     
    public RegisterPage insertRegisterName(String name){
        sendKeys(registerName , 3 , name);
        return this;
    }

     
    public RegisterPage insertRegisterEmail(String email){
        sendKeys(registerEmail , 3 , email);
        return this;
    }

     
    public RegisterPage clickOnRegisterBtn(){
        click(registerBtn , 3);
        return this;
    }

     
    public String getEnterAccountEInfoText(){
        return getText(enterAccountText , 3);
    }

     
    public RegisterPage clickOnTitleBox(){
        click(fillTitle , 3);
        return this;
    }


     
    public RegisterPage insertName(String name1){
        clear(fillName , 3);
        sendKeys(fillName , 3 , name1);
        return this;
    }

     
    public RegisterPage insertEmail(String email1){
        clear(fillEmail , 3);
        sendKeys(fillEmail , 3 , email1);
        return this;
    }


     
    public RegisterPage insertPassword(String pass1){
        sendKeys(fillPassword , 3 , pass1);
        return this;
    }

     
    public RegisterPage checkOnSignUpNewsletter(){
        click(clickSignUpNewsletter , 3);
        return this;
    }

     
    public RegisterPage checkOnReceiveSpecialOffers(){
        click(clickReceiveSpecialOffers , 3);
        return this;
    }

     
    public RegisterPage insertBirthDate1(String day){
        select  = new Select(driver.findElement(fillDateOfBirth1));
        select.selectByVisibleText(day);
        return this;
    }

     
    public RegisterPage insertBirthDate2(String month){
        select = new Select(driver.findElement(fillDateOfBirth2));
        select.selectByVisibleText(month);
        return this;
    }

     
    public RegisterPage insertBirthDate3(String year){

        select = new Select(driver.findElement(fillDateOfBirth3));
        select.selectByVisibleText(year);
        return this;
    }

     
    public RegisterPage insertFirstNameAddress(String firstNameAddress1){
        sendKeys(firstNameAddress , 3 , firstNameAddress1);
        return this;
    }

     
    public RegisterPage insertLastNameAddress(String lastNameAddress1){
        sendKeys(lastNameAddress , 3 , lastNameAddress1);
        return this;
    }

     
    public RegisterPage insertCompanyNameAddress(String companyNameAddress1){
        sendKeys(companyAddress , 3 , companyNameAddress1);
        return this;
    }

     
    public RegisterPage insertAddressName1(String addressName1){
        sendKeys(AddressName1 , 3 , addressName1);
        return this;
    }

     
    public RegisterPage insertAddressName2(String addressName2){
        sendKeys(AddressName2 , 3 , addressName2);
        return this;
    }

     
    public RegisterPage insertCountryAddress(String countryAddress){
        select  = new Select(driver.findElement(countryName));
        select.selectByVisibleText(countryAddress);
        return this;
    }

     
    public RegisterPage insertState(String stateName1){
        sendKeys(stateName , 3 , stateName1);

        return this;
    }

     
    public RegisterPage insertCity(String cityName1){
        sendKeys(cityName , 3 , cityName1);
        return this;
    }

     
    public RegisterPage insertZipCode(String zipCodeName1){
        sendKeys(zipcodeName , 3 , zipCodeName1);
        return this;
    }

     
    public RegisterPage insertMobileNumber(String mobileNum1){
        sendKeys(mobileNumber1 , 3 , mobileNum1);
        return this;
    }

     
    public RegisterPage clickOnCreateAccountBtn(){
        click(createAccountBtn , 3);
        return this;
    }

     
    public String accountCreatedTxtVisible(){
        return getText(accountCreatedText , 3);
    }

     
    public RegisterPage clickOnContinueBtn(){
        click(continueBtn , 3);
        return this;
    }

     
    public String loggedInUserNameTxtVisible(){
        return getText(loggedInUserName , 3);
    }

     
    public RegisterPage clickOnDeleteAccount(){
        click(deleteAccountBtn , 3);
        return this;
    }

     
    public String accountDeletedTxtVisible(){
        return getText(accountDeletedText , 3);
    }

     
    public RegisterPage clickOnContinueDeleteBtn(){
        click(continueDeleteBtn , 3);
        return this;
    }

    public void registerAccountForm(String password , String dayBirth , String monthBirth , String yearBrith
                                    ,String firstNameAddressR , String lastNameAddressR , String companyNameAddressR
                                    ,String addressNameR , String addressNameR2 , String countryAddressR
                                    ,String stateNameR , String cityNameR , String zipCodeName , String mobileNum){

        clickOnTitleBox();
        insertPassword(password);
        checkOnSignUpNewsletter();
        checkOnReceiveSpecialOffers();
        insertBirthDate1(dayBirth);
        insertBirthDate2(monthBirth);
        insertBirthDate3(yearBrith);
        insertFirstNameAddress(firstNameAddressR);
        insertLastNameAddress(lastNameAddressR);
        insertCompanyNameAddress(companyNameAddressR);
        insertAddressName1(addressNameR);
        insertAddressName2(addressNameR2);
        insertCountryAddress(countryAddressR);
        insertState(stateNameR);
        insertCity(cityNameR);
        insertZipCode(zipCodeName);
        insertMobileNumber(mobileNum);
        clickOnCreateAccountBtn();
    }
}
