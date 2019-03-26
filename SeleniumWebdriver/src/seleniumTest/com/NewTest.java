package seleniumTest.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver driver;
	public WebDriverWait exwait;
  @Test
  public void main() {
//	  // Find the element that's ID attribute is 'account'(My Account)
//	  
//      driver.findElement(By.id("Email")).click();
// 
//      // Find the element that's ID attribute is 'log' (Username)
// 
//      // Enter Username on the element found by above desc.
// 
//      driver.findElement(By.id("Email")).sendKeys("pshiva42@gmail.com");
// 
//      // Find the element that's ID attribute is 'pwd' (Password)
// 
//      // Enter Password on the element found by the above desc.
// 
//      driver.findElement(By.id("Password")).sendKeys("Password-1");
// 
//      // Now submit the form. WebDriver will find the form for us from the element
// 
//      driver.findElement(By.xpath("//input[@value='Log in']")).click();
// 
//      // Print a Log In message to the screen
// 
//      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
// 
//      // Find the element that's ID attribute is 'account_logout' (Log Out)
// 
//      //driver.findElement(By.id("account_logout"));
////driver.findElement(By.name("Books"));
//      exwait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Books"))); 
//             
//driver.findElement(By.linkText("Books")).click();
//
//WebElement mySelectElement = driver.findElement(By.id("products-orderby"));
//Select dropdown= new Select(mySelectElement);
//dropdown.selectByIndex(1);
	  
	  driver.findElement(By.name("user-name")).click();
	  driver.findElement(By.name("user-name")).sendKeys("d804725");
	  driver.findElement(By.id("login-user-password")).sendKeys("Telstra123");
	  driver.findElement(By.id("login-jsp-btn")).click();
	  driver.findElement(By.xpath("//img[@id='reg_img_304316340']")).click();
	  
	  
	  
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
   // Create a new instance of the Firefox driver
 
	  System.setProperty("webdriver.chrome.driver", "D:/Users/125212/workspace/SeleniumWebdriver/chromedriver.exe");
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      exwait=new WebDriverWait(driver,10);
      
 
      //Launch the Online Store Website
 
      //driver.get("http://demowebshop.tricentis.com/login");
      driver.get("https://itam9webintstg2.bluemix.corp.telstra.com/arsys/");
      
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
   // Close the driver
	  //driver.get(".../testreport.html");
 //driver.quit();
 
  }
 
}