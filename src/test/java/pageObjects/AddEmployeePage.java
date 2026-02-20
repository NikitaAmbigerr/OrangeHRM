package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage extends BasePage {

	public AddEmployeePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@name='firstName']")
	WebElement Fname;
	@FindBy(xpath="//input[@name='middleName']")
	WebElement midname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement Lname;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	public void enterFname(String fname) {
		Fname.sendKeys(fname);
	}
	public void enterMname(String mname) {
		midname.sendKeys(mname);
	}
	public void enterLname(String lname) {
		Lname.sendKeys(lname);
	}
	public void click_save() {
		save.click();
	}
}
