package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccPage {
	WebDriver driver = null;
	
	public CreateAccPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//create account link
	By createAccLink = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
	
	//first & last name
	By fName = By.xpath("//input[@id='firstname']");
	By lName = By.xpath("//input[@id='lastname']");
	
	//email and password
	By email = By.xpath("//input[@id='email_address']");
	By password = By.xpath("//input[@id='password']");
	By confirmationPassword = By.xpath("//input[@id='password-confirmation']");
	
	//create account button
	By createAccountBtn = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
	
	//click on create account link
	public void createAccount() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(createAccLink).click();
	}
	
	//Enter first and last name
	public void enterNames(String firstName, String lastName) {
		driver.findElement(fName).sendKeys(firstName);
		driver.findElement(lName).sendKeys(lastName);
	}
	
	//Enter email, password, and confirm password
	public void enterCredentials(String mail, String pass_word, String confirmPassword) {
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass_word);
		driver.findElement(confirmationPassword).sendKeys(confirmPassword);
	}
	
	//click create account button
	public void clickCreateAccBtn() {
		driver.findElement(createAccountBtn).click();
	}
}
