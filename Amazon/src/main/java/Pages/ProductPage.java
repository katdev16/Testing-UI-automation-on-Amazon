package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By productTitle = By.id("productTitle");
    private By price = By.cssSelector(".a-price-whole");
    private By image = By.id("main-image-container");
    private By addToCartBtn = By.id("add-to-cart-button");
    private By cartNav = By.id("nav-cart-count");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean ProductTitleDisplayed() {
        System.out.println(driver.getTitle());
        return driver.findElement(productTitle).isDisplayed();
    }

    public boolean PriceIsDisplayed(){
        return driver.findElement(price).isDisplayed();
    }

    public boolean ImageIsDisplayed(){
        return driver.findElement(image).isDisplayed();
    }

    public AddedToCartPage clickAddToCartBtn(){
        driver.findElement(addToCartBtn).click();
        return new AddedToCartPage(driver);
    }

    public CartPage clickCartNav(){
        driver.findElement(cartNav).click();
        return new CartPage(driver);
    }

}
