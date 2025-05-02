package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyProfilePage;

public class Tests {
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void runTest() throws InterruptedException {
		driver.get("https://www.edureka.co/");
		
		LoginPage obj = new LoginPage(driver);
		MyProfilePage obj2 = new MyProfilePage(driver);
		
		obj.clickLoginBtn();
		
		obj.enterEmail("lulamashiringani.sl@gmail.com");
		
		//Thread.sleep(2000);
		obj.enterPassword("EdurekaSel");
		
		//Thread.sleep(2000);
		obj.signIn();
		
		Thread.sleep(2000);
		obj2.clickProfileIcon();
		
		Thread.sleep(2000);
		obj2.clickMyProfileList();
		
		Thread.sleep(2000);
		obj2.editDetails();
		
		Thread.sleep(2000);
		obj2.updateFullName("Lulama Shiringani");
		
		Thread.sleep(2000);
		obj2.saveAndContinue();
		
		
	}
	
	@AfterTest
	public void closeTest() {
		//driver.close();
	}
	
}
