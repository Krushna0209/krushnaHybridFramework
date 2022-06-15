package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorloginTheInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(4000);
		//login operation
		
		
		driver.findElement(By.name("username")).sendKeys("krushna_jadhav4320");
		driver.findElement(By.name("Password")).sendKeys("9822586905");
		driver.findElement(By.cssSelector("butten['class*=Igw0E']")).click();
		

	}

}
