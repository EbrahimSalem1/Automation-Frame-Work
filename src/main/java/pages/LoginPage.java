package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private final By loginText= By.xpath("//h2[normalize-space()='Login to your account']");
    private final By emailField=By.name("email");
    private final By passwordField=By.name("password");
    private final By signupEmailField=By.xpath("//input[@data-qa='signup-email']");
    private final By loginButton=By.xpath("//button[normalize-space()='Login']");
    private final By validationMessage =By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
    private final By newUserText=By.xpath("//h2[contains(text(),'New User Signup!')]");
    private final By signupButton=By.xpath("//button[normalize-space()='Signup']");
    private final By nameField=By.xpath("//input[@placeholder='Name']");
    private final By getMessageEmailExist=By.xpath("//p[normalize-space()='Email Address already exist!']");
    //Actions
        public boolean loginTextVisible ()
    {
        return  isDisplayed(loginText,3);
    }
    public boolean newUserTextVisible ()
    {
        return  isDisplayed(newUserText,3);
    }
    private void insertEmail(String text)
    {
        sendKeys(emailField,3,text);
    }
    private void insertPassword( String text)
    {
        sendKeys(passwordField,3,text);
    }
    private void insertName(String text)
    {
        sendKeys(nameField,3,text);
    }
    private void clickOnLoginButton()
    {
        click(loginButton,3);
    }

    public String getValidationMessage() {

        return getText(validationMessage, 3);
    }
    private void clickOnSignupButton()
    {
        click(signupButton,3);
    }
    private void insertSignupEmail(String text)
    {
        sendKeys(signupEmailField,3,text);
    }
    public String getValidationSignup()
    {
        return getText(getMessageEmailExist,3);
    }
    public HomePage loginFeature(String email,String password)
    {
        insertEmail(email);
        insertPassword(password);
        clickOnLoginButton();
        return new HomePage(driver);

    }
    public void signupFeature(String signupemail,String name)
    {
        insertSignupEmail(signupemail);
        insertName(name);
        clickOnSignupButton();
    }
}
