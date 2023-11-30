package sample;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parameterized_test {

	WebDriver driver;
	
	@Test
	public void project1 () {
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println(BROWSER + "-----------"+ URL);
		
		
		if (BROWSER.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.err.println("Invalide Browser Name");
		}
		
		System.out.println("--"+BROWSER+"---Browser Launched----");
		
		driver.get(URL);
		
		
		
		
	}
}
