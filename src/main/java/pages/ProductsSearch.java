package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsSearch extends MethodHandles {

    public ProductsSearch(WebDriver driver) {
        super(driver);
    }


    private final By SearchedProductsText = By.cssSelector(".title.text-center");
    private final By RelatedSearchProduct = By.cssSelector(".google-anno-t");
    private final By addProductCartBtn = By.cssSelector("div[class='productinfo text-center'] a[class='btn btn-default add-to-cart']");
    private final By viewCartBtn = By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2) > a:nth-child(1) > u:nth-child(1)");



    public String getSearchedProductsTxt(){
        return getText(SearchedProductsText , 3);
    }

    public boolean getRelatedSearchProduct(){
        return isDisplayed(RelatedSearchProduct , 3);
    }

    public void clickOnAddProductCartBtn(){
        click(addProductCartBtn , 3);
    }

    public ProductsCart ClickOnViewCartBtn(){
        click(viewCartBtn , 3);
        return new ProductsCart(driver);
    }


}
