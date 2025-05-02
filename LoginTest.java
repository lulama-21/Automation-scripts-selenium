package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateAccPage;
import Pages.LoginPage;

public class LoginTest {
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void runTest() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		
		LoginPage obj = new LoginPage(driver);
		
		obj.clickSigninLink();
		
		Thread.sleep(2000);
		obj.enterEmail("johndoe2024@gmail.com");
		
		Thread.sleep(2000);
		obj.enterPassword("LumaAutomation2024");
		
		Thread.sleep(2000);
		obj.clickSignInBtn();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
