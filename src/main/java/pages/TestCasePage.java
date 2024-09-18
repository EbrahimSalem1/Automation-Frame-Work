package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class TestCasePage extends MethodHandles {

    public TestCasePage(WebDriver driver){
        super(driver);
    }


    public String getCurrentUrlTestCasePage(){
        return getCurrentUrl();
    }

}
