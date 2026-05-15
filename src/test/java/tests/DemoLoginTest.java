package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DemoLoginPage;

public class DemoLoginTest extends BaseTest {
	@Test
	public void testValidLogin() {

		DemoLoginPage demoLoginPage = new DemoLoginPage(driver);
		demoLoginPage.enterUsername("student");
		demoLoginPage.enterPassword("Password123");
		demoLoginPage.clickLogin();
		//Assert.assertEquals(driver.getTitle(), "Just a moment...");
		 System.out.println("Title of the Page: " + driver.getTitle());
	}

}
