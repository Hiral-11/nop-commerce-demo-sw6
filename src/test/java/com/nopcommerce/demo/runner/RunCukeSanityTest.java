package com.nopcommerce.demo.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //all this is fixed steps to be added everytime
        glue = "com/nopcommerce/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        tags = "@sanity"
)

public class RunCukeSanityTest extends AbstractTestNGCucumberTests {
}
