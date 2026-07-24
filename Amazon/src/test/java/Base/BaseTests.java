package Base;

import org.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class BaseTests {
    private WebDriver driver;
    ConfigReader config = new ConfigReader();
    String browser = config.getProperty("browser");
    String url = config.getProperty("app.url");

    @Test
    public void setup(){
        driver = new ChromeDriver();
        goHome();
    }

    public void goHome(){
        driver.get(url);
    }
}
