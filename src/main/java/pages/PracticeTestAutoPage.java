package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeTestAutoPage extends BasePage {

	public PracticeTestAutoPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Practice']")
	WebElement practiceButton;

	@FindBy(xpath = "//a[text()='Test Login Page']")
	WebElement testLoginPageButton;

	@FindBy(xpath = "//section[@id='login']/h2")
	WebElement testLoginText;

	public void clickPractice() {
		click(practiceButton);
	}

	public void clickTestLoginPage() {
		click(testLoginPageButton);
	}

	public String getTextTestLogin() {
		return testLoginText.getText();
	}
}