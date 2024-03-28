package Rws;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Operable extends BaseTest {

	@Test(groups = {"Operable","data"})
	public void checkKeyboardFunctionality() throws InterruptedException {
		landingPage.checkKeyboardFunctionality();
	}

//	@Test(groups = "Operable")
//	public void brokenLinks() throws MalformedURLException, IOException {
//		landingPage.brokenLinks();
//	}

}
