package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMpage extends BasePage {

	public PIMpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText="Add Employee")
	WebElement AddE;
	
	@FindBy(linkText="Employee List")
	WebElement empList;
	
	public void click_addEmploye() {
		AddE.click();
	}
	public void click_EmployeeList() {
		empList.click();
	}
}
