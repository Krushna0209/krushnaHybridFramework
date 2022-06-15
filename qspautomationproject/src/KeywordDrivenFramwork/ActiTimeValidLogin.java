package KeywordDrivenFramwork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		
		String username = flib.readPropertyFile("./data/config.properties", "username");
		System.out.println(username);
		String passward = flib.readPropertyFile("./data/config.properties", "passward");
		System.out.println(passward);
		
		bt.openbrowser();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//close the browser
		bt.closeBrowser();
		

	}

}
