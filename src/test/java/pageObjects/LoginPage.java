package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement UserN;
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void enter_Uname() {
		UserN.sendKeys("Admin");
	}
	public void enter_pass() {
		pwd.sendKeys("admin123");
	}
	public void click_login() {
		login.click();;
	}
}
