package KeywordDrivenFramwork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;

	public void openbrowser() throws IOException {
		
		
		Flib flib = new Flib();
		String browservalue = flib.readPropertyFile("./data/config.properties", "browser");
		String url = flib.readPropertyFile("./data/config.properties", "url");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);             

			
		}
		else if(browservalue.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);             

			
		}
		else
		{
			System.out.println("enter correct choice");
		}


	}
	//method to close the browsers
	public void closeBrowser()
	{
		driver.quit();
	}

}
