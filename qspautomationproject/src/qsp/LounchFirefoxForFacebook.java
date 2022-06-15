package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchFirefoxForFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		   FirefoxDriver driver=new FirefoxDriver();
		   driver.get("http://www.facebook.com");
		   Thread.sleep(10000);
		   driver.close();

	}

}
