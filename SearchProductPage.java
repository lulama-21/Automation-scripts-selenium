package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {
	WebDriver driver = null;
	
	public SearchProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//search bar
	By searchBar = By.xpath("//input[@id='search']");
	By searchTextbox = By.xpath("//input[@id='search']");
	By searchIcon = By.xpath("//button[@title='Search']");
	
	//click search bar
	public void populateSearchBar(String search) {
		//click on search
		driver.findElement(searchBar).click();
		
		//search description'
		driver.findElement(searchTextbox).sendKeys(search);
	}
	
	//click search icon/enter
	public void clickSearchIcon() {
		driver.findElement(searchIcon).click();
	}
}
