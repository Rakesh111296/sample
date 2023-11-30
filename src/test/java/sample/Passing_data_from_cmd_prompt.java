package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Passing_data_from_cmd_prompt {
	
	public WebDriver driver;
	@Test
	public void Vtiger() {
		
		String BROWSER = System.getProperty("browser");
		
		if (BROWSER.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.err.println("Invalide Browser Name");
		}
		
	
		System.out.println("--"+BROWSER+"---Browser Launched----");
	
	
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
}

	
	

}
