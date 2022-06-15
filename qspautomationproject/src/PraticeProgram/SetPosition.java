package PraticeProgram;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers.ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		Point.targetPosition=new Point(250, 150);
	    driver.manage().window().setPosition(targetPosition);	

	}

}
