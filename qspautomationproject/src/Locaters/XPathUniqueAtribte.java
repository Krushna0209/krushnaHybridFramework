package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUniqueAtribte {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		//login operation
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='L3NKy']")).click();


	}

}
