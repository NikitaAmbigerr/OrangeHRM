package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList extends BasePage{

	public EmployeeList(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	WebElement EmployeeName;
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	public void Entername(String hint) {
		EmployeeName.sendKeys(hint);
	}
	public void click_search() {
		search.click();
	}
    
}
