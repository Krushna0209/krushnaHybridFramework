package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htt://opensourse-demo.orangehrmlive.com/");
		String titleOfLoginPage=driver.getTitle();
		System.out.println("titleOfLoginPage");

	}

}