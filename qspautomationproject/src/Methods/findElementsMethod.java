package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		  List<WebElement> suggestion = driver.findElements(By.xpath("//span[text()='bike']"));
		  for(WebElement sugg:suggestion)
		  {
			  String textofweb = sugg.getText();
			  System.out.println(textofweb);
		  }
		  
		
	}

}
