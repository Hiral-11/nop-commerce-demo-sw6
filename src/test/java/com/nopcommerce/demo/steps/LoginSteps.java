package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to log in page successfully")
    public void iShouldNavigateToLogInPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("I enter invalid email {string}")
    public void iEnterInvalidEmail(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("I enter invalid password {string}")
    public void iEnterInvalidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals("Error message not displayed", errorMessage, new LoginPage().getErrorMessage());
    }

    @And("I enter valid email {string}")
    public void iEnterValidEmail(String email) {
        new LoginPage().enterEmailId("Sunmoon@gmail.com");
    }

    @And("I enter valid password {string}")
    public void iEnterValidPassword(String password) {
        new LoginPage().enterPassword("MoonSun@123");
    }

    @And("I enter on login button")
    public void iEnterOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
            }

    @And("I click on logOut link")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOut();
    }

    @Then("I should be able to see log in link")
    public void iShouldBeAbleToSeeLogInLink() {
    }
}
