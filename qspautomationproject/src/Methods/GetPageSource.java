package Methods;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kjadh/OneDrive/Desktop/start%20html/rediobutten.html");
		String sourceCodeOfTheWebPage = driver.getPageSource();
		System.out.println(sourceCodeOfTheWebPage);

	}

}
