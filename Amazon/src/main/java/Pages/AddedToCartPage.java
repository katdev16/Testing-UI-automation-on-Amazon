package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedToCartPage {
    private WebDriver driver;
    private By ConfirmationOfAddedProductToCart = By.xpath("//*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1");

    public AddedToCartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getConfirmationOfAddedProductToCart(){
        return driver.findElement(ConfirmationOfAddedProductToCart).getText();
    }


}
