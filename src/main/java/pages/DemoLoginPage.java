package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLoginPage {

    private WebDriver driver;

    private By usernameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By loginButton = By.id("submit");

    public DemoLoginPage(WebDriver driver) {
        this.driver = driver;
    }

//    public void enterUsername(String username) {
//        driver.findElement(usernameTextBox).clear();
//        driver.findElement(usernameTextBox).sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        driver.findElement(passwordTextBox).clear();
//        driver.findElement(passwordTextBox).sendKeys(password);
//    }
//
//    public void clickLogin() {
//        driver.findElement(loginButton).click();
//    }
    public void login(String username, String password) {

        driver.findElement(usernameTextBox).clear();
        driver.findElement(usernameTextBox).sendKeys(username);

        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(password);

        driver.findElement(loginButton).click();
    }
}