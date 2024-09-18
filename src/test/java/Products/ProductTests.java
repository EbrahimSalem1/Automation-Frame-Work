package Products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteAccountPage;
import pages.LoginPage;
import pages.ProductsDetailsPage;
import pages.ProductsPage;

import java.io.FileNotFoundException;

public class ProductTests extends BaseTests {
    @Test
    public void testViewProductDetails () throws FileNotFoundException {


        // Click on 'Products' button
        ProductsPage productsPage=homePage.clickProductsLinkLink();
        //Verify that products page is visible successfully
        Assert.assertTrue(productsPage.productsPageVisible(),"products page is visible");
        //Click on 'View Product' of first product
        ProductsDetailsPage productsDetailsPage=productsPage.clickProductsDetailsPage();
        // Verify that detail  is visible: product name, category, price, availability, condition, brand
        Assert.assertEquals(productsDetailsPage.getProductNameText(),"Blue Top");
        Assert.assertEquals(productsDetailsPage.getProductCategoryText(),"Category: Women > Tops");
        Assert.assertEquals(productsDetailsPage.getProductPrice(),"Rs. 500");
        Assert.assertEquals(productsDetailsPage.getProductAvailability(),"Availability: In Stock");
        Assert.assertEquals(productsDetailsPage.getProductCondition(),"Condition: New");
        Assert.assertEquals(productsDetailsPage.getGetProductBrand(),"Brand: Polo");










    }

}
