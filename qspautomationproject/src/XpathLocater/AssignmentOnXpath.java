package XpathLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpath {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
				driver.findElement(By.xpath("(//div[@class='_213eRC _2ssEMF'])[1]")).click();
				driver.findElement(By.xpath("//div[@class='_3879cV'])[1]")).click();
				
			    driver.findElement(By.xpath("//div[text()='POCO M3 Pro 5G (Yellow, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'")).click();
				

			}


	}


