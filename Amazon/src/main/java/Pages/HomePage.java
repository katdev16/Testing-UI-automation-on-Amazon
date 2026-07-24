package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By logo = By.id("nav-logo-sprites");
    private By searchBar = By.id("twotabsearchtextbox");
    private By navMenu = By.id("nav-main");
    private By searchBarBtn = By.cssSelector(".nav-search-submit.nav-sprite");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isLogoDisplayed(){
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSearchBarDisplayed(){
        return driver.findElement(searchBar).isDisplayed();
    }

    public boolean isNavMenuDisplayed(){
        return driver.findElement(navMenu).isDisplayed();
    }

    public SearchResultsPage clickSearchBarBtn(){
        driver.findElement(searchBarBtn).click();
        return new SearchResultsPage(driver);
    }

    public void setSearchBar(String inputs){
        driver.findElement(searchBar).sendKeys(inputs);
    }


}
