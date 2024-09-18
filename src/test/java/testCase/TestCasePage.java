package testCase;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestCasePage extends BaseTests {

    pages.TestCasePage test;

    @Test
    public void VerifyTestCasesPage() throws FileNotFoundException {

        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");

        homePage.clickOnTestCaseBtn();

        test = testCasePage;

        Assert.assertEquals(test.getCurrentUrlTestCasePage() , dataModel().TestCaseURL.TestCaseUrl);

    }
}
