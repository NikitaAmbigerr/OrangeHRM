package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logoutpage extends BasePage{

	public Logoutpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement userdrop;
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void click_userDrop() {
		userdrop.click();
	}
	public void click_Logout() {
		logout.click();
	}
}
