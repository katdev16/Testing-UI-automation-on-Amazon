package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    ConfigReader config = new ConfigReader();
    String browser = config.getProperty("browser");
    String url = config.getProperty("app.url");


    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        goHome();
    }

    public HomePage goHome(){
        driver.get(url);
        return new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
