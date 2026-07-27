package Cart;

import Base.BaseTests;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class CartTests extends BaseTests {
    ConfigReader config = new ConfigReader();
    String product = config.getProperty("headphones");

    @Test
    public void testRemoveProductfromCart(){
        HomePage homePage = goHome();
        homePage.setSearchBar(product);
        SearchResultsPage page = homePage.clickSearchBarBtn();


        ProductPage newPage = page.getFirstProduct();
        AddedToCartPage addTocartPage = newPage.clickAddToCartBtn();
        CartPage cartPage = addTocartPage.clickCartNav();
        cartPage.clickRemoveProduct();
        Assert.assertTrue(cartPage.getMessage().contains("was removed from Shopping Cart."));

    }

}
