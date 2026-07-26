package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;
    private By relatedProductText = By.cssSelector(".a-size-base.a-spacing-small.a-spacing-top-small.a-text-normal");
    private By invalidProductMessage = By.cssSelector(".a-size-medium.a-color-base.a-text-normal");
    private By products = By.cssSelector(".puisg-row .a-link-normal");
    private By addToCartBtn = By.id("a-autoid-3-announce");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getRelatedProductText() {
        return driver.findElement(relatedProductText).getText();
    }

    public String getInvalidProductMessage() {
        return driver.findElement(invalidProductMessage).getText();
    }

    public ProductPage getFirstProduct() {
        driver.findElement(products).click();
        var windows = driver.getWindowHandles();
        System.out.println(windows.size());
        System.out.println(driver.getTitle());
        switchToNewTab();
        return new ProductPage(driver);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }


//    public ProductPage switchToProductPage(){
//
//    }


    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);

    }

//    public void clickAddToCart(){
//        driver.findElement(addToCartBtn);
//    }
}
