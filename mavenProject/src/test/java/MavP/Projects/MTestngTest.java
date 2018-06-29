package MavP.Projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class MTestngTest {
	public WebDriver driver;
	
	  @Test

	  public void openApp() throws InterruptedException {
	  driver.get("https://www.philips.co.uk/");
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
	  
	  

	  } 
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\selenium_ jars\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		 
	 
	  }

	  @AfterTest
	  public void afterTest() {
	  driver.close();
	  }

	}
