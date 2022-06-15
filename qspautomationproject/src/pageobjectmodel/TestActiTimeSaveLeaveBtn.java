package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeSaveLeaveBtn extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		
		String validUsername = flib.readPropertyFile("./data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./data/config.properties", "password");
       
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.clickSaveLeaveTimeBtn();
	}

}
