package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchFirefoxBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		   FirefoxDriver driver=new FirefoxDriver(); 
		   Thread.sleep(5000);
		   driver.close();

	}

}
