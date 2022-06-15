package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class lounchchromebrowser {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		GeckoDriver driver = new GeckoDriver ();
		 driver.get("http://www.instagram.com");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		driver.close();
	}

}
