package StepDefinition;

import java.io.IOException;

import PageObjects.LandingPage;
import TestComponents.BaseTest;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseTest{
	public LandingPage landingPage;
	
	@Given("^Open (.+)$")
	public void Open_Link(String baseUrl) throws IOException, InterruptedException{
		landingPage=launchApplication(baseUrl);
	}
	
	@When("^Run Accessibility Test for Perceivable for (.+)$")
	public void Run_Accessibility_Test_Perceivabble(String linkName) {
		landingPage.getAllMissingAltAttributes(".\\ResultFiles\\"+linkName+"MissingAltAttributes.txt");
		landingPage.inputWithoutPlaceholder(".\\ResultFiles\\"+linkName+"inputWithoutPlaceholder.txt");
		landingPage.getFramesWithoutTitle(".\\ResultFiles\\"+linkName+"getFramesWithoutTitle.txt");
		landingPage.getAllButtonsWithoutDescriptiveValue(".\\ResultFiles\\"+linkName+"ButtonsWithoutDescriptiveValue.txt");
		
	}
	
	@And("Run Accessibility Test for Operable")
	public void Run_Accessibility_Test_for_Operable() throws InterruptedException {
		landingPage.checkKeyboardFunctionality();
	}
	
	@Then("Close Browser")
	public void close_Browser() {
		driver.quit();
	}

}
