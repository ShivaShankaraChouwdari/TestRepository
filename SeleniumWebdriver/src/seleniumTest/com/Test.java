package seleniumTest.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Test {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setupApp(){
		System.setProperty("webdriver.chrome.driver", "D:/Users/125212/workspace/SeleniumWebdriver/chromedriver.exe");
		
		Reporter.log("Browser session started..",true);
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.close();
	}


}
