package KeywordDrivenFramwork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Thread.sleep(2000);
		
		
		
		Flib flib = new Flib();
     	int rc = flib.getrowCount("./data/ActiTimetextData.xlsx", "invalidcred");
		 for(int i=1;i<=rc;i++)
		 {
			    String username = flib.readExcelData("./data/ActiTimetextData.xlsx","invalidcred", i, 0);
			    System.out.println(username);
				String password = flib.readExcelData("./data/ActiTimetextData.xlsx","invalidcred", i, 1);
				System.out.println(password);
				Thread.sleep(2000);
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();
			 
		 }
		 bt.closeBrowser();

	}

}
