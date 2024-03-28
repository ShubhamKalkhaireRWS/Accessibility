package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Cucumber",glue="StepDefinition",monochrome = true,plugin = {"html:reports/cucumber.html"})



public class TestNGRunner extends AbstractTestNGCucumberTests {

}
