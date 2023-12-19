package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement regSuccessFullField;


    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;


    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Get registerText : " + registerText.toString());
        return message;
    }

    public void selectGender(String gender) {
        for (WebElement radio : genderRadios) {
            if (radio.getText().contains(gender)) {
                log.info("Select : " + gender + genderRadios.toString());
                clickOnElement(radio);
                break;
            }
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter Firstname : '" + firstName + firstNameField.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Enter Lastname : '" + lastName + lastNameField.toString());
    }

    public void selectDay(String text) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, text);
        log.info(" select day : " + text + " frome drop down " + dateOfBirthDay.toString());
    }

    public void selectMonth(String text) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, text);
        log.info(" select month : " + text + " from drop down field " + dateOfBirthMonth.toString());

    }

    public void selectYear(String text) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, text);
        log.info(" select year : " + text + " from drop down menu " + dateOfBirthYear.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email : " + email + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password : " + password + passwordField.toString());
    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPasswordField, confPassword);
        log.info("Enter Confirm password : " + confPassword + confirmPasswordField.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
        log.info("Click on 'REGISTER' button: " + registerBtn.toString());
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                log.info("Validation message : " + message.getText() + fieldValidationErrors.toString());
                break;
            }
        }
            return validationMessage;
        }



        public String getTextFromRegSuccesfull(){
            log.info(" Get register Success Text: "+ regSuccessFullField.toString());
            return  getTextFromElement(regSuccessFullField);
        }


        public void clickOnContinueButton () {
            clickOnElement(continueBtn);
            log.info("Click on 'CONTINUE' button: " + continueBtn.toString());
        }

    }


