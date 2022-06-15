package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		String validusername = flib.readPropertyFile("./data/config.properties", "username");
		Thread.sleep(2000);
		String validpassward = flib.readPropertyFile("./data/config.properties", "password");
		 LoginPage lp = new LoginPage(driver);
		 lp.actiTimeValidLogin(validusername, validpassward);
		 Thread.sleep(2000);
		 bt.tearDown();
		 
	}

}
