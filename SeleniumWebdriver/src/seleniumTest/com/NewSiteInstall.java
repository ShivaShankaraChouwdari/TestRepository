package seleniumTest.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewSiteInstall {
	
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
	  
	  driver.findElement(By.name("user")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.name("user")).sendKeys("test_user");
	  driver.findElement(By.id("pass")).sendKeys("Telstra123");
	 // driver.findElement(By.linkText("Log In")).click();
	 // driver.findElement(By.xpath("//img[@id='reg_img_304316340']")).click();
	  
	driver.findElement(By.xpath("//div[@id='login_button']")).click();
	//driver.find_element_by_xpath(xpaths['login_button']).click()
	  Actions action=new Actions(driver);
	 action.moveToElement(driver.findElement(By.linkText("XD-SOM"))).build().perform();
	//  action.moveToElement(driver.findElement(By.linkText("XD-SOM")))
	 // action.moveToElement(driver.findElement(By.linkText("XD-SOM"))).moveToElement(driver.findElement(By.linkText("Feasibility Orders"))).moveToElement(driver.findElement(By.linkText("Create"))).build().perform();
	 // action.moveToElement(driver.findElement(By.linkText("XD-SOM"))).clickAndHold().moveToElement(driver.findElement(By.linkText("Feasibility Orders"))).clickAndHold().moveToElement(driver.findElement(By.linkText("Create"))).release().click();
	action.moveToElement(driver.findElement(By.linkText("Feasibility Orders"))).build().perform();
	 action.moveToElement(driver.findElement(By.linkText("Create"))).click().build().perform();
	 driver.findElement(By.xpath("//input[@id='9151679173913298198' and @class='gwt-TextBox nc-field-text-input']")).sendKeys("2021930895");
	 driver.findElement(By.xpath("//button[contains(text(),'Retrieve Customer Data')]")).click();

	 ///
	// int timeout = 90; // depends on your needs
	// WebDriverWait myWait= new WebDriverWait(driver,timeout);
	// myWait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//*[@id=\"9152680528013606203\"]/div/div[3]/table/tbody/tr[1]/td/div/form/table/tbody/tr/td/table/tbody/tr[4]/td[5]/div/table/tbody/tr/td/div/div"), "Text"));
	// myWait.until(ExpectedCondition.textToBePresentInElementValue(By.xpath("//*[@id=\"9152680528013606203\"]/div/div[3]/table/tbody/tr[1]/td/div/form/table/tbody/tr/td/table/tbody/tr[4]/td[5]/div/table/tbody/tr/td/div/div", ""));
	 (new WebDriverWait(driver, 300)).until(new ExpectedCondition<Boolean>() {
         public Boolean apply(WebDriver d) {
             return d.findElement(By.xpath("//*[@id=\"9152680528013606203\"]/div/div[3]/table/tbody/tr[1]/td/div/form/table/tbody/tr/td/table/tbody/tr[4]/td[5]/div/table/tbody/tr/td/div/div")).getText().length() != 0;
         }
     });
	 ///
	 
	// WebElement exwaitelement = exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"9152680528013606203\"]/div/div[3]/table/tbody/tr[1]/td/div/form/table/tbody/tr/td/table/tbody/tr[4]/td[5]/div/table/tbody/tr/td/div/div")));
	///String ss=exwaitelement.getText();
	//System.out.println("ssssss ="+ss);
//	System.out.println("ss.isEmpty() ="+ss.isEmpty());
	
	//	if(!ss.isEmpty()) {
			
			//System.out.println("ssssss ="+ss);
	driver.findElement(By.id("9151533860013269226")).sendKeys("0398263880");
	 WebElement mySelectElement = driver.findElement(By.id("9152765910313749646"));
	Select dropdown= new Select(mySelectElement);
	dropdown.selectByIndex(1);
	//}
	
  }

  @BeforeMethod
 
  public void beforeMethod() {
 
   // Create a new instance of the Firefox driver
 
	  System.setProperty("webdriver.chrome.driver", "D:/Users/125212/workspace/SeleniumWebdriver/chromedriver.exe");
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
      exwait=new WebDriverWait(driver,180);
      
 
      //Launch the Online Store Website
 
      //driver.get("http://demowebshop.tricentis.com/login");
      driver.get("https://xdsom-test-1.sdpamp.com/");
      
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
   // Close the driver
	  //driver.get(".../testreport.html");
 //driver.quit();
 
  }
 
}