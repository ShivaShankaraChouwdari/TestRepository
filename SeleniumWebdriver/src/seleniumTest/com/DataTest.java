package seleniumTest.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class DataTest
{
 WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
    @BeforeTest
 public void initialization(){
     // To set the path of the Chrome driver.
    	 System.setProperty("webdriver.chrome.driver", "D:/Users/125212/workspace/SeleniumWebdriver/chromedriver.exe");
    	 
         //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
   	  driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        // exwait=new WebDriverWait(driver,90);
         
    
         //Launch the Online Store Website
    
         //driver.get("http://demowebshop.tricentis.com/login");
         driver.get("https://xdsom-test-1.sdpamp.com/");
    }
   
 @Test
 public void fbLoginLogout() throws IOException{
 // Import excel sheet.
 File src=new File("D:\\Test.xlsx");   
 // Load the file.
 FileInputStream fis = new FileInputStream(src);
 // Load he workbook.
 workbook = new XSSFWorkbook(fis);
 // Load the sheet in which data is stored.
 sheet= workbook.getSheetAt(0);
 for(int i=1; i<=sheet.getLastRowNum(); i++){
 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
 and first column (A) as 0 and second column (B) as 1 and so on*/ 
	
	
	 // driver.findElement(By.linkText("Log In")).click();
	 // driver.findElement(By.xpath("//img[@id='reg_img_304316340']")).click();
	  
	
 // Import data for Email.
 cell = sheet.getRow(i).getCell(0);
 cell.setCellType(CellType.STRING);
 driver.findElement(By.name("user")).clear();
 driver.findElement(By.name("user")).click();
 driver.manage().window().maximize();
 driver.findElement(By.name("user")).sendKeys(cell.getStringCellValue());
 // Import data for password.
 cell = sheet.getRow(i).getCell(1);
 cell.setCellType(CellType.STRING);
 driver.findElement(By.id("pass")).clear();
 driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
 driver.findElement(By.xpath("//div[@id='login_button']")).click();// To click on Login button
// driver.findElement(By.xpath("//input[@type='submit'][@id='u_0_5']")).click();
// To click on Account settings dropdown  //driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
// To click on logout button
 //driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
 FileOutputStream fos=new FileOutputStream(src);
 // Message to be written in the excel sheet
     String message = "Pass";
     // Create cell where data needs to be written.
     sheet.getRow(i).createCell(2).setCellValue(message);
         
     // finally write content
     workbook.write(fos);
     fos.close();
 }
 }
 
}