package Methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("india",Keys.ENTER);
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("maharastra",Keys.ENTER);

	}

}
