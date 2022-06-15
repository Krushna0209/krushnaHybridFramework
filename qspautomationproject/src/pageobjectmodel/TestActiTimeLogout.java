package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException 

 {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		String validusername = flib.readPropertyFile("./data/config.properties", "username");
		Thread.sleep(2000);
		String validpassward = flib.readPropertyFile("./data/config.properties", "password");
		
	    LoginPage lp = new LoginPage(driver);
	    lp.actiTimeValidLogin(validusername,validpassward );
	    
	    HomePage hp = new HomePage(driver);
	    Thread.sleep(2000);
	    hp.clickLogout();
	    
	}

}
