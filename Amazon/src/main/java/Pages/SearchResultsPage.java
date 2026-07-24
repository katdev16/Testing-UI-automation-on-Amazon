package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;
    private By relatedProductText = By.cssSelector(".a-size-base.a-spacing-small.a-spacing-top-small.a-text-normal");
    private By invalidProductMessage = By.cssSelector(".a-size-medium.a-color-base.a-text-normal");

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getRelatedProductText(){
        return driver.findElement(relatedProductText).getText();
    }

    public String getInvalidProductMessage(){
        return driver.findElement(invalidProductMessage).getText();
    }
}
