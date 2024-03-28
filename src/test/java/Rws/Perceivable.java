package Rws;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Perceivable extends BaseTest {
	


	@Test(groups = {"Perceivable"})
	public void getAllMissingAltAttributes() throws InterruptedException {
		landingPage.getAllMissingAltAttributes(".\\target\\getAllMissingAltAttributes.txt");
	}
//
//	@Test(groups = "Perceivable")
//	public void inputWithoutPlaceholder() {
//		landingPage.inputWithoutPlaceholder(".\\target\\inputWithoutPlaceholder.txt");
//	}
//
//	@Test(groups = "Perceivable")
//	public void getFramesWithoutTitle() {
//		landingPage.getFramesWithoutTitle(".\\target\\getFramesWithoutTitle.txt");
//	}
//
//	@Test(groups = "Perceivable")
//	public void getAllButtonsWithoutDescriptiveValue() {
//		landingPage.getAllButtonsWithoutDescriptiveValue(".\\target\\getAllButtonsWithoutDescriptiveValue.txt");
//	}

}
