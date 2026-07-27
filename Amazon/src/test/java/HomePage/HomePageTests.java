package HomePage;

import Base.BaseTests;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTests extends BaseTests {

    @Test
    public void testHomePageLaunch(){

        HomePage homePage = goHome();

        Assert.assertTrue(homePage.isLogoDisplayed());
        Assert.assertTrue(homePage.isNavMenuDisplayed());
        Assert.assertTrue(homePage.isSearchBarDisplayed());
    }

    @Test
    public void testChangeLang() throws InterruptedException {
        HomePage homePage = goHome();
        homePage.hoverOverLangBar();
        homePage.changeLang();
        Thread.sleep(3000);
        System.out.println("Current language :"+homePage.getCurrentLang());
        Assert.assertEquals(homePage.getCurrentLang(),"TA","Language not change");

    }


}
