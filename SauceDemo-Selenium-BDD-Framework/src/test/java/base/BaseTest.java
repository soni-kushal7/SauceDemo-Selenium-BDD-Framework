package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {

	public static WebDriver driver;
	
	public void setUp() {
		
		EdgeOptions options = new EdgeOptions();

		options.addArguments("--headless=new");          // ✅ new headless syntax for modern Edge
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-debugging-port=0"); // ✅ lets OS pick a free port
		options.addArguments("--disable-extensions");      // ✅ avoids extension-related crashes
		options.addArguments("--no-first-run");            // ✅ skips first-run setup under SYSTEM
		options.addArguments("--disable-background-networking");

		// Initialize the driver ONCE using the options
		driver = new EdgeDriver(options);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void tearDown() {
		// Null check to prevent NullPointerException if the driver failed to start
		if (driver != null) {
			driver.quit();
		}
	}
}