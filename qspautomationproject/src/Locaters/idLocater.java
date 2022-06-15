package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocater {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kjadh/OneDrive/Desktop/start%20html/task1.html");
		driver.findElement(By.id("text")).sendKeys("Admin");
		driver.findElement(By.id("text")).sendKeys("Manager");

	}

}
