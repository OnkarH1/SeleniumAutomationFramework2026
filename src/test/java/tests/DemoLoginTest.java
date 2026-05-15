package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DemoLoginPage;

public class DemoLoginTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void testDemoLogin() {

        DemoLoginPage demoLoginPage = new DemoLoginPage(driver);

        demoLoginPage.enterUsername("student");
        demoLoginPage.enterPassword("Password123");
        demoLoginPage.clickLogin();

        System.out.println("Title of the Page: " + driver.getTitle());
    }
}