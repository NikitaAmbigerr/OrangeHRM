package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListsPage extends LoginPage {

	public ListsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement PIM;
	
	public void click_pim() {
		PIM.click();
	}
}
