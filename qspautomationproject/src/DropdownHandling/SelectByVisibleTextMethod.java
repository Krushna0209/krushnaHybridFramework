package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kjadh/OneDrive/Desktop/start%20html/singal%20select%20dropdown.html");
		Thread.sleep(4000);
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownelement);
		sel.selectByVisibleText("paratha");

	}

}
