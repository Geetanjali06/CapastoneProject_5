package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static  void initialization() {
		// Launch the Chrome driver(Here used 4.19.1 version
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Upcasting
        driver = new ChromeDriver();

        // Launch the URL
        driver.get("https://wordpress.org/");
//        maximize window
        driver.manage().window().maximize();
//        Apply implicitlyWait to each webelement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        Pageload
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        delete Cookies
		driver.manage().deleteAllCookies();
	}

	
}
