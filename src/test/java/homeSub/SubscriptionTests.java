package homeSub;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class SubscriptionTests extends BaseTests {

    @Test
    public void testVerifySubscriptionInHomepage() throws FileNotFoundException {

        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");
        Assert.assertEquals(homePage.getSubscriptionText(),"SUBSCRIPTION");

        homePage.insertEmailAddressText(dataModel().Subscriptions.subscriptionEmail.EmailAddress);
        homePage.clickOnSubscriptionArrowBtn();
        Assert.assertTrue(homePage.getSuccessfulMessageTxt() , "You have been successfully subscribed!");

    }
}
