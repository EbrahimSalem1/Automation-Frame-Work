package logout;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LogoutTest extends BaseTests {
    @Test
    public void testLogout() throws FileNotFoundException {
        //Verify that home page is visible successfully
        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");
        // Click on 'Signup / Login' button
        LoginPage loginPage=homePage.clickOnSignUpAndLoginLink();
        //Verify 'Login to your account' is visible
        Assert.assertTrue(loginPage.loginTextVisible(),"'Login to your account' is not visible");
        //  Enter correct email address and password and then Click On Login Button
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Email,dataModel().Login.ValidCredentials.Password );
        Assert.assertEquals(homePage.getLoggedUsername(),"Logged in as eslam");
        LoginPage loginPage1=homePage.clickOnLogoutLink();
        Assert.assertTrue(loginPage1.loginTextVisible(),"'Login to your account' is not visible");
    }
}
