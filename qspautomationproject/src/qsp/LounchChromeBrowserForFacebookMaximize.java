package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchChromeBrowserForFacebookMaximize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://www.facebook.com");
		   Thread.sleep(10000);
		   driver.close();

	}

}
