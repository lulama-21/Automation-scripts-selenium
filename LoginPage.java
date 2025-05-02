package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//By
	//Constructor
	//Locate and Action methods
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By loginBtn = By.xpath("//span[contains(@class,'login_click login-vd giTrackElementHeader')]");
	
	By emailTextbox = By.xpath("//input[@id='si_popup_email']");
	
	By passwordTextBox = By.xpath("//input[@id='si_popup_passwd']");
	
	By signInButton = By.xpath("//button[@class='clik_btn_log btn-block']");
	

	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void enterEmail(String email) {
		driver.findElement(emailTextbox).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void signIn() {
		driver.findElement(signInButton).click();
	}

}
