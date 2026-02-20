package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.LoginPage;
import pageObjects.Logoutpage;

public class BaseTest {
	protected WebDriver driver;
	@BeforeClass
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void Login() {
		LoginPage LP=new LoginPage(driver);
		LP.enter_Uname();
		LP.enter_pass();
		LP.click_login();
	}
	@AfterMethod
	public void Logout() {
		Logoutpage LO=new Logoutpage(driver);
		LO.click_userDrop();
		LO.click_Logout();
	}
	@AfterClass
	public void Teardown() {
		
		driver.quit();
	}
	
}
