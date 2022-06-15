package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowCount("./data/ActiTimetextData.xlsx", "invalidcred");
		for(int i=1;i<=rc;i++)
		{
			 String invalidUsername = flib.readExcelData("./data/ActiTimetextData.xlsx", "invalidcred", i, 0);
			 String invalidPassword = flib.readExcelData("./data/ActiTimetextData.xlsx", "invalidcred", i, 1);
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
		}
		bt.tearDown();
		
		

	}

}
