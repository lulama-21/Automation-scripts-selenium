package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver = null;
	
	//constructor
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//register link locator
	By regLink = By.xpath("//a[normalize-space()='Register']");
	
	//click register link
	public void clickReg() {
		driver.findElement(regLink).click();
	}
}
