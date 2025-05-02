package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePage {
	WebDriver driver = null;
	
	public MyProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By profileIcon = By.xpath("//img[@class='img30']");
	
	By myProfileList = By.xpath("//a[normalize-space()='My Profile']");
	
	By editDetailsBtn = By.xpath("//div[@class='col-lg-8 col-md-8 col-sm-12 col-xs-12 prof-career-other-details']//div[1]//div[1]//a[1]//i[1]");
	
	By updateName = By.xpath("//input[@id='fullName']");
	
	By saveDetails = By.xpath("//button[@class='btn btn-default btn-lg btn-save btn_save pull-right']");
	
	public void clickProfileIcon() {
		driver.findElement(profileIcon).click();
	}
	
	public void clickMyProfileList() {
		driver.findElement(myProfileList).click();
	}
	
	public void editDetails() {
		driver.findElement(editDetailsBtn).click();
	}
	
	public void updateFullName(String fullName) {
		driver.findElement(updateName).clear();
		driver.findElement(updateName).sendKeys(fullName);
	}
	
	public void saveAndContinue() {
		driver.findElement(saveDetails).click();
	}
}
