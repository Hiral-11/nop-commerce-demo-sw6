package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailId '" + email + "' to email field : "
                + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password '" + password + "' to password field : "
                + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on loginButton : " + loginButton.toString());

    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Get errorMessage : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String email, String password) {
        enterEmailId(email);
        log.info("Enter email : " + email + emailField.toString());
        enterPassword(password);
        log.info("Enter password : " + password + passwordField.toString());
        clickOnLoginButton();
        log.info(" click on login : " + loginButton.toString());
    }

    public void clickOnLogOut() {
        clickOnElement(logoutLink);
        log.info("click on logout : " + logoutLink.toString());
    }
}
