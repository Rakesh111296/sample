package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newProject_Test {
	WebDriver driver;
	
	@Test
	
	public void newTest () {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
	}
}
