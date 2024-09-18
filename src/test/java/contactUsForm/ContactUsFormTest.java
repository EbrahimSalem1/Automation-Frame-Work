package contactUsForm;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import java.io.FileNotFoundException;

public class ContactUsFormTest extends BaseTests {
    @Test
    public void testContactUsForm() throws FileNotFoundException {
        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");
        ContactUsPage contactUsPage=homePage.clickOnContactUsLink();
        Assert.assertTrue(contactUsPage.getInVisible(),"Get In Touch Not Visible");
        contactUsPage.contactUsFeature(dataModel().ContactUsForm.Name,dataModel().ContactUsForm.Email,dataModel().ContactUsForm.Subject,dataModel().ContactUsForm.Message,dataModel().ContactUsForm.File);
        Assert.assertTrue(contactUsPage.successMessageVisible(),"Success Message Not Visible");
        HomePage homePage1=contactUsPage.clickOnHomeBtn();
        Assert.assertTrue(homePage1.homePageVisible(),"Home page is not visible");
    }
}
