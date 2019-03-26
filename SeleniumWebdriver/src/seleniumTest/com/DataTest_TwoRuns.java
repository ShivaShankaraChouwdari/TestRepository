package seleniumTest.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataTest_TwoRuns {
	WebDriver driver;
 // To get data from dataprovider
 @Test(dataProvider="testdataset")
 public void fbLoginLogout(String user, String pass) throws Exception{
 
	 System.setProperty("webdriver.chrome.driver", "D:/Users/125212/workspace/SeleniumWebdriver/chromedriver.exe");
	 
     //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    // exwait=new WebDriverWait(driver,90);
     

     //Launch the Online Store Website

     //driver.get("http://demowebshop.tricentis.com/login");
     driver.get("https://xdsom-test-1.sdpamp.com/");
	  driver.findElement(By.name("user")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.name("user")).sendKeys(user);
	  driver.findElement(By.id("pass")).sendKeys(pass);
	 // driver.findElement(By.linkText("Log In")).click();
	 // driver.findElement(By.xpath("//img[@id='reg_img_304316340']")).click();
	  
	//driver.findElement(By.xpath("//div[@id='login_button']")).click();
 }
 // @DataProvider passes data to test cases. Here I took 2 dimension array. 
 @DataProvider(name="testdataset")
 public Object[][] getData(){
 // Create object with two paraments
 // first parameter is row and second one is column
 Object[][] data = new Object[2][2];
 data[0][0] = "test_user";
 data[0][1] = "Telstra123";
 
 data[1][0] = "ShivaP";
 data[1][1] = "Telstra123";
 
 return data;
 }
}