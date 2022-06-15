package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LonchChromeForFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("http://www.facebook.com");
		   Thread.sleep(10000);
		   driver.close();

	}

}
