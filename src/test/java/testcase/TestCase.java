package testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddEmployeePage;
import pageObjects.EmployeeList;
import pageObjects.ListsPage;
import pageObjects.Logoutpage;
import pageObjects.PIMpage;
import testBase.BaseTest;

public class TestCase extends BaseTest{
	@Test
	public void TC_001() throws InterruptedException {
		ListsPage LP=new ListsPage(driver);
		LP.click_pim();
		
		PIMpage pp=new PIMpage(driver);
		pp.click_addEmploye();
		
		AddEmployeePage AE=new AddEmployeePage(driver);
		AE.enterFname("Jhon");
		AE.enterMname("J");
		AE.enterLname("Wick");
		AE.click_save();
		
		
	}
}
