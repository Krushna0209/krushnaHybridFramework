package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htt://opensourse-demo.orangehrmlive.com/");
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);

	}

}
