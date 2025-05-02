package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SearchProductPage;

public class SearchProductTest {
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void runTest() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		
		SearchProductPage obj = new SearchProductPage(driver);
		
		obj.populateSearchBar("Tees men");
		
		obj.clickSearchIcon();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
	}

}
