package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {

	//declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInLabel") private WebElement kertmelogincheckbox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;

	
	
	
	
	
	
	//initiliasation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getKertmelogincheckbox() {
		return kertmelogincheckbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	
	
	//generic reusable method
	
	public void actiTimeValidLogin(String validUsername,String validPassword )
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginbtn.click();
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword )
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginbtn.click();
		
		usn.clear();
	}
	
	
	
	
	//operational methods
	
	

	
	

}
