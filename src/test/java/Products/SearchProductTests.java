package Products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsCart;
import pages.ProductsPage;
import pages.ProductsSearch;

import java.io.FileNotFoundException;

public class SearchProductTests extends BaseTests {

    @Test
    public void testSearchProduct() throws FileNotFoundException {

        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");


        ProductsPage productsPage1 = homePage.clickProductsLinkLink();
        Assert.assertTrue(productsPage1.productsPageVisible(),"products page is visible");

        productsPage1.insertSearchProductTxt(dataModel().SearchOnProducts.SearchedOnProducts.Product);

        ProductsSearch searchPro =  productsPage1.clickOnSearchBtn();
        Assert.assertEquals(searchPro.getSearchedProductsTxt() , "SEARCHED PRODUCTS");
        Assert.assertTrue(searchPro.getRelatedSearchProduct() , "Tshirt");
    }


    @Test
    public void testSearchProductsAndVerifyCartAfterLogin() throws FileNotFoundException {

        Assert.assertTrue(homePage.homePageVisible(),"Home page is not visible");


        ProductsPage productsPage1 = homePage.clickProductsLinkLink();
        Assert.assertTrue(productsPage1.productsPageVisible(),"products page is visible");

        productsPage1.insertSearchProductTxt(dataModel().SearchOnProducts.SearchedOnProducts.Product);

        ProductsSearch searchPro =  productsPage1.clickOnSearchBtn();
        Assert.assertEquals(searchPro.getSearchedProductsTxt() , "SEARCHED PRODUCTS");
        Assert.assertTrue(searchPro.getRelatedSearchProduct() , "Men Tshirt");

        searchPro.clickOnAddProductCartBtn();

        String cart = searchPro.ClickOnViewCartBtn().getNameOfProductInCart();
        Assert.assertEquals(cart , "Men Tshirt");



        LoginPage loginPage=homePage.clickOnSignUpAndLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Email,dataModel().Login.ValidCredentials.Password );


        ProductsCart getCartProductTxt = homePage.clickOnCartLinkPage();
        Assert.assertEquals( getCartProductTxt.getNameOfProductInCart() , "Men Tshirt");

    }
}
