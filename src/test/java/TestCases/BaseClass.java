package TestCases;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  // logging
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public WebDriver driver;
	String baseUrl = "https://automationexercise.com/login";
	public Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
		switch (br) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		logger = LogManager.getLogger(this.getClass());
		
	}
	
	@AfterClass
	public void teardDown() {
		driver.quit();
		
	}
}
