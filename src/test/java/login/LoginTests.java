package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteAccountPage;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {

    @Test
    public void testLoginSucessful() throws FileNotFoundException {
        //Verify that home page is visible successfully
        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");
        // Click on 'Signup / Login' button
        LoginPage loginPage=homePage.clickOnSignUpAndLoginLink();
        //Verify 'Login to your account' is visible
        Assert.assertTrue(loginPage.loginTextVisible(),"'Login to your account' is not visible");
        //  Enter correct email address and password and then Click On Login Button
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Email,dataModel().Login.ValidCredentials.Password );
        // Verify that 'Logged in as username' is visible
        String emailName= (dataModel().Login.ValidCredentials.Email).split("@")[0];
        Assert.assertTrue(homePage.getLoggedUsername().contains(emailName));
        // Click 'Delete Account' button
        DeleteAccountPage deleteAccountPage=homePage.clickOnDeleteAccount();
        //Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertEquals( deleteAccountPage.getMessageDelete(),"ACCOUNT DELETED!");
    }
    @Test
    public void testLoginIncorrectEmailAdnPassword() throws FileNotFoundException {
        //Verify that home page is visible successfully
        Assert.assertTrue(homePage.homePageVisible(), "Home page is not visible");
        // Click on 'Signup / Login' button
        LoginPage loginPage = homePage.clickOnSignUpAndLoginLink();
        //Verify 'Login to your account' is visible
        Assert.assertTrue(loginPage.loginTextVisible(), "'Login to your account' is not visible");
        //  Enter incorrect email address and password and then Click On Login Button
        loginPage.loginFeature(dataModel().Login.InvalidCredentials.InvalidUsername.Email, dataModel().Login.InvalidCredentials.InvalidPassword.Password);
        String actualResult =loginPage.getValidationMessage();
        // Verify error 'Your email or password is incorrect!' is visible
        String expectedResult="Your email or password is incorrect!";
        Assert.assertEquals(expectedResult,actualResult);    }
}
