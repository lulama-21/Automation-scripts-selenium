package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest {
	WebDriver driver = null;
	
	//base url
	String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
     	driver.get(baseUrl);
	}
	
	@Test
	public void runTest() {	
		//page object
		RegisterPage obj = new RegisterPage(driver);
		
		obj.clickReg();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
