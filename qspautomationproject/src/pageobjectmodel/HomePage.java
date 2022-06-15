package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	////declaration
	
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutlink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement cretenewtask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	
	//initialisation
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//utilization
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	

	public WebElement getCretenewtask() {
		return cretenewtask;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//operational
	
	
	public void clickLogout()
	{
		logoutlink.click();
	}
	
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
