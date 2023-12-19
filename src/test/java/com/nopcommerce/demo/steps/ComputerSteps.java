package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("I am on home page for shopping")
    public void iAmOnHomePageForShopping() {

    }

    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new ComputerSteps().iClickOnComputerTab();
    }

    @Then("I should navigate to computer page")
    public void iShouldNavigateToComputerPage() {
    }

    @And("Computer text should be visible")
    public void computerTextShouldBeVisible() {
        Assert.assertEquals(new ComputerPage().getPageTitleText(), "Computers" ,"Message displayed" );

    }

    @When("I click on Computers tab")
    public void iClickOnComputersTab() {
        new ComputerSteps().iClickOnComputersTab();
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerSteps().iClickOnDesktopsLink();
    }

    @Then("I should be navigated to desktop page")
    public void iShouldBeNavigatedToDesktopPage() {
    }

    @And("Desktop Text should be visible")
    public void desktopTextShouldBeVisible() {
        Assert.assertEquals(new DesktopsPage().getPageTitleText(),"Desktops", "Text displayed");
    }

    @And("I select desktop product Build your own computer")
    public void iSelectDesktopProductBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYoueOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select ram {string}")
    public void iSelectRam(String ramGB) {
        new BuildYourOwnComputerPage().selectRam(ramGB);
    }

    @And("I select hdd {string}")
    public void iSelectHdd(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select os {string}")
    public void iSelectOs(String osName) {
        new BuildYourOwnComputerPage().selectOS(osName);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String softwareName) {
        new BuildYourOwnComputerPage().selectSoftware(softwareName);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();

    }

    @Then("I am successfully select my own build computer")
    public void iAmSuccessfullySelectMyOwnBuildComputer() {

    }

    @And("I can see the addtocart message {string}")
    public void iCanSeeTheAddtocartMessage(String expectedMessage) {
        Assert.assertEquals("displayed message is wrong :",expectedMessage,new BuildYourOwnComputerPage().getProductAddedMessage());
    }
}
