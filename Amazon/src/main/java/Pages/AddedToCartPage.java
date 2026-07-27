package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedToCartPage {
    private WebDriver driver;
    private By ConfirmationOfAddedProductToCart = By.xpath("//*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1");
    private By price = By.xpath("//div[contains(@class,'a-section') and contains(@class,'a-spacing-mini')]//span[contains(@class,'a-text-bold')]");
    private By cartNav = By.id("nav-cart-count");

    public AddedToCartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getConfirmationOfAddedProductToCart(){
        return driver.findElement(ConfirmationOfAddedProductToCart).getText();
    }
    public CartPage clickCartNav(){
        driver.findElement(cartNav).click();
        return new CartPage(driver);
    }


}
