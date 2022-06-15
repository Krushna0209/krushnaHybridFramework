package readDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table.Cell;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://http://laptop-5d19a40k/login.do");             
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		Thread.sleep(1000);
	     FileInputStream fis = new FileInputStream("./data/ActiTimeTextData");
	     Workbook wb = WorkbookFactory.create(fis);
	      org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("validcred");
	      Row row = sh.getRow(1);
	      org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
	      String username = cell.getStringCellValue();
		
	      FileInputStream fis2 = new FileInputStream("./data/ActiTimeTextData");
		     Workbook wb2 = WorkbookFactory.create(fis);
		      org.apache.poi.ss.usermodel.Sheet sh2 = wb.getSheet("validcred");
		      Row row2 = sh2.getRow(1);
		      org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(0);
		      String passward = cell.getStringCellValue();
		      
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(passward);
		driver.findElement(By.id("loginButton")).click();

	}

}
