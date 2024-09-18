package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsPage extends MethodHandles {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    // Locators
    private  final By productsPage = By.xpath("//a[@href='/products' and contains(@style, 'color: orange;')]");
    private  final By productsDetailsLink = By.xpath("//a[@href='/product_details/1' and contains(@style, 'color: brown;')]");

    private final By searchProductText = By.xpath("(//input[@id='search_product'])[1]");
    private final By searchBtn = By.cssSelector("#submit_search");
    //Actions
    public boolean productsPageVisible() {
        return isDisplayed(productsPage, 3);
    }
    public ProductsDetailsPage  clickProductsDetailsPage()
    {
        click(productsDetailsLink,3);
        return new ProductsDetailsPage(driver);
    }


    public void insertSearchProductTxt(String searchTxt){
        sendKeys(searchProductText , 3 , searchTxt);
    }

    public ProductsSearch clickOnSearchBtn(){
        click(searchBtn , 3);
        return new ProductsSearch(driver);
    }

}

