import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;
import java.util.Set;

public class TestBro {

    @Test

    public void popitka1() {
        ChromeDriver driver = new ChromeDriver();

//
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//        WebDriverManager.chromedriver().setup();


        driver.get("Google.com");

        driver.quit();
    }
}
