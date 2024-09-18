package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsCart extends MethodHandles {
    public ProductsCart(WebDriver driver) {
        super(driver);
    }

    private final By nameOfProductInCart = By.cssSelector("a[href='/product_details/2']");


    public String getNameOfProductInCart(){
        return getText(nameOfProductInCart , 3);
    }
}
