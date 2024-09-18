package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ContactUsPage extends MethodHandles {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    private final By getInVisibleField= By.xpath("//h2[contains(text(),'Get')]");
    private final By nameField= By.cssSelector("input[name='name']");
    private final By emailField= By.cssSelector("input[name='email']");
    private final By subjectField= By.cssSelector("input[name='subject']");
    private final By messageField= By.cssSelector("#message");
    private final By uploadFile= By.cssSelector("input[name='upload_file']");
    private final By submitBtn= By.cssSelector("input[name='submit']");
    private final By successMessage= By.cssSelector(".status.alert.alert-success");
    private final By homeBtn= By.cssSelector(".btn.btn-success");

    public boolean getInVisible(){
        return isDisplayed(getInVisibleField,3);
    }
    private void insertNameField(String text){
        sendKeys(nameField,3,text);
    }
    private void insertEmailField(String text){
        sendKeys(emailField,3,text);
    }
    private void insertSubjectField(String text){
        sendKeys(subjectField,3,text);
    }
    private void insertMessageField(String text){
        sendKeys(messageField,3,text);
    }
    private void uploadFileField(String text){
        sendKeys(uploadFile,3,text);
    }
    private void clickOnSubmitBtn(){
        click(submitBtn,3);
    }
    private void clickOnAlertButton(){
        acceptAlert();
    }
    public void contactUsFeature(String name,String email,String subject,String message,String file){
        insertNameField(name);
        insertEmailField(email);
        insertSubjectField(subject);
        insertMessageField(message);
        uploadFileField(file);
        clickOnSubmitBtn();
        clickOnAlertButton();
    }
    public boolean successMessageVisible(){
        return isDisplayed(successMessage,3);
    }
    public HomePage clickOnHomeBtn(){
        click(homeBtn,3);
        return new HomePage(driver);
    }
}
