package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
    @FindBy(linkText = "Log in")
    WebElement logInButton;
    @FindBy(xpath = "//input[@class='js-username-field email-input js-initial-focus']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@class='js-password-field']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement secondLoginButton;

    public void logInToTwitter( String username, String password) throws InterruptedException {
        logInButton.click();
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        secondLoginButton.click();
        Thread.sleep(2000);
    }
}

