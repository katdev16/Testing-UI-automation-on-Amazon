package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By logo = By.id("nav-logo-sprites");
    private By searchBar = By.id("twotabsearchtextbox");
    private By navMenu = By.id("nav-main");
    private By searchBarBtn = By.cssSelector(".nav-search-submit.nav-sprite");
//    private By searchDropDown = By.id("nav-search-dropdown-card");
    private By searchDropDown = By.id("searchDropdownBox");
    private By divSearchDropDown = By.id("nav-search-dropdown-card");



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

    public void clickSearchDropDownBooks(){
        WebElement dropdown =
                driver.findElement(searchDropDown);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value='search-alias=stripbooks';",
                dropdown
        );

        js.executeScript(
                "arguments[0].dispatchEvent(new Event('change'));",
                dropdown
        );
    }


}
