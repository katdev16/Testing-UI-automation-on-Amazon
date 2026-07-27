package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By quantity = By.xpath("//div[contains(@class,'a-declarative')]//span[@data-a-selector='inner-value']");
    private By price = By.xpath("//div[contains(@class,'a-section') and contains(@class,'a-spacing-mini')]//span[contains(@class,'a-text-bold')]");
    private By removeProduct = By.cssSelector(".a-stepper-controls > button");
    private By message = By.cssSelector(".sc-list-item-removed-msg");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getQuantity(){
        return driver.findElement(quantity).getText();
    }

    public boolean getPrice(){
        return driver.findElement(price).isDisplayed();
    }

    public void clickRemoveProduct(){
        driver.findElement(removeProduct).click();
    }

    public String getMessage(){
        return driver.findElement(message).getText();
    }


}
