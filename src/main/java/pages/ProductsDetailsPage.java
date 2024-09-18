package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsDetailsPage extends MethodHandles {
    public ProductsDetailsPage(WebDriver driver) {
        super(driver);
    }

    //Locators product name, category, price, availability, condition, brand
    private final By productNameText= By.xpath("//h2[text()='Blue Top']");
    private final By productCategoryText= By.xpath("//p[contains(text(), 'Category: Women > Tops')]");
    private final By productPrice= By.xpath("//span[text()='Rs. 500']");
    private final By productAvailability= By.xpath("//p[b[text()='Availability:'] and contains(text(), 'In Stock')]");
    private final By productCondition =By.xpath("//p[b[text()='Condition:'] and contains(text(), 'New')]");
    private final By getProductBrand =By.xpath("//p[b[text()='Brand:'] and contains(text(), 'Polo')]");


    //Actions

    public String getProductNameText() {

        return getText(productNameText,3);
    }

    public String getProductCategoryText() {

        return getText(productCategoryText,3);
    }
    public String getProductPrice() {

        return getText(productPrice,3);
    }
    public String getProductAvailability() {

        return getText(productAvailability,3);
    }
    public String getProductCondition() {

        return getText(productCondition,3);
    }
    public String getGetProductBrand() {

        return getText(getProductBrand,3);
    }


}
