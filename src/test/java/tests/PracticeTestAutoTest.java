package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DemoLoginPage;
import pages.PracticeTestAutoPage;

public class PracticeTestAutoTest extends BaseTest {

	@Test(groups = { "smoke" })
	public void practiceLoginTest() {

		DemoLoginPage demoLoginPage = new DemoLoginPage(driver);
		demoLoginPage.login("student", "Password123");

		PracticeTestAutoPage page = new PracticeTestAutoPage(driver);
		page.clickPractice();
		page.clickTestLoginPage();
		String text = page.getTextTestLogin();
		System.out.println(text);
	}
}
