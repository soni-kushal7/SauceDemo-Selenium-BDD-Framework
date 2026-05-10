package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {

    public static WebDriver driver;

    public void setUp() {

//        EdgeOptions options = new EdgeOptions();
//       // options.addArguments("--headless=new");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--window-size=1920,1080");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-debugging-port=0");
//        options.addArguments("--no-first-run");
//        
//        options.addArguments("--disable-extensions");
//
        // ✅ Selenium 4 has built-in Selenium Manager — no WebDriverManager needed
        System.setProperty(
        	    "webdriver.edge.driver",
        	    System.getProperty("user.dir") + "\\resources\\msedgedriver.exe"
        	);        
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}