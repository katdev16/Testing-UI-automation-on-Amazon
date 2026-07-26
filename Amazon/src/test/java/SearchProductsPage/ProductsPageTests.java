package SearchProductsPage;

import Base.BaseTests;
import Pages.HomePage;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class ProductsPageTests extends BaseTests {
    ConfigReader config = new ConfigReader();
    String product = config.getProperty("laptop");
    String invaildProduct =  config.getProperty("InvalidProduct");

    @Test
    public void testProductPageAndShowsRelatedProducts(){
        HomePage homePage = goHome();

        homePage.setSearchBar(product);
        SearchResultsPage searchPage = homePage.clickSearchBarBtn();
        String text = String.format("results for \"%s\"", product);
        String text2 = "results for ";
        System.out.println(searchPage.getRelatedProductText());
        System.out.println(text);

        Assert.assertTrue(searchPage.getRelatedProductText().contains(text));
    }

    @Test
    public void testSearchWithInvalidProduct(){
        HomePage homePage = goHome();

        homePage.setSearchBar(invaildProduct);
        SearchResultsPage searchPage = homePage.clickSearchBarBtn();
        System.out.println(searchPage.getInvalidProductMessage());

        String message = "No results for your search query.";
        Assert.assertEquals(searchPage.getInvalidProductMessage(),message,"Invalid message");
    }



}
