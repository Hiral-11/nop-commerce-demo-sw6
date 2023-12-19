package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on home page for registration")
    public void iAmOnHomePageForRegistration() {

    }

    @And("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I am on register page")
    public void iAmOnRegisterPage() {
    }

    @Then("I should be navigate to register page successfully")
    public void iShouldBeNavigateToRegisterPageSuccessfully() {
    }

    @And("I should be able to see register text")
    public void iShouldBeAbleToSeeRegisterText() {
        String expactedText="Register";
        Assert.assertEquals("displayed message is wrong ",expactedText,new RegisterPage().getRegisterText());
    }

    @When("I click on Register button")
    public void iClickOnRegisterButton() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should get errror for first name field {string} message")
    public void iShouldGetErrrorForFirstNameFieldMessage(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Last name"), "Last name is required", "Error");
    }

    @And("I should get  error for last name field {string} message")
    public void iShouldGetErrorForLastNameFieldMessage(String errorMessage) {

    }

    @And("I should get error for email field {string} message")
    public void iShouldGetErrorForEmailFieldMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"), "Email is required", "Error");
    }

    @And("I should get error for password  field {string} message")
    public void iShouldGetErrorForPasswordFieldMessage(String arg0) {
    }

    @And("I should get  error for confirm password field {string} message")
    public void iShouldGetErrorForConfirmPasswordFieldMessage(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm password"), "Password is required", "Error");
    }

    @When("I select gender male")
    public void iSelectGenderMale() {
        new RegisterPage().enterFirstName("Hir");

    }

    @And("I Enter FirstName")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Hir");
    }

    @And("I Enter LastName")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Kar");
    }

    @And("I select Day")
    public void iSelectDay() {
        new RegisterPage().selectDay("14");
    }

    @And("I select Month")
    public void iSelectMonth() {
        new RegisterPage().selectMonth("January");
    }

    @And("I select Year")
    public void iSelectYear() {
        new RegisterPage().selectYear("1999");
    }

    @And("I enter valid {string}")
    public void iEnterValid(String email) {
        new RegisterPage().enterEmail("Sunmoon@gmail.com");

    }

    @And("I enter valid confirmpassword in confirmpassword field for register {string}")
    public void iEnterValidConfirmpasswordInConfirmpasswordFieldForRegister(String password) {
        new RegisterPage().enterPassword("MoonSun@123");

    }

    @Then("I should create account successfully")
    public void iShouldCreateAccountSuccessfully() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should able to see Your registration completed message")
    public void iShouldAbleToSeeYourRegistrationCompletedMessage(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getTextFromAlert(), "Your registration completed", "Error");
    }
}
