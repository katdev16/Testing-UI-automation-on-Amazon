package AddToCart;

import Base.BaseTests;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class AddToCartTests extends BaseTests {
    ConfigReader config = new ConfigReader();
    String product = config.getProperty("headphones");

    @Test
    public void testAddToCart(){
        HomePage homePage = goHome();
        homePage.setSearchBar(product);
        SearchResultsPage page = homePage.clickSearchBarBtn();


        ProductPage newPage = page.getFirstProduct();
        AddedToCartPage addTocartPage = newPage.clickAddToCartBtn();
        Assert.assertEquals(addTocartPage.getConfirmationOfAddedProductToCart(),"Added to cart", "product not added");
    }

    @Test
    public void testCartPage(){
        HomePage homePage = goHome();
        homePage.setSearchBar(product);
        SearchResultsPage page = homePage.clickSearchBarBtn();


        ProductPage newPage = page.getFirstProduct();
        AddedToCartPage addTocartPage = newPage.clickAddToCartBtn();
        CartPage cartPage = addTocartPage.clickCartNav();
        Assert.assertEquals(cartPage.getQuantity(),"1","quantity not added");
        Assert.assertTrue(cartPage.getPrice(),"price not visable");



    }


}
