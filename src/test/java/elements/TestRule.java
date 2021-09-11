package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		
		//caso for utilizar o navegador Edge
//		System.setProperty("webdriver.chrome.driver", "drivers/edge/msedgedriver.exe");
//		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@After
    public void end(){
        //driver.quit();
    }
	
	public static WebDriver getDriver() {
		return driver;
	}
}
