package practiceAndroidAutomation;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import constants.TestGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

//	import pages.apidemos.home.APIDemosHomePage;
public class AndroidTest extends BaseTest {
	//AppiumDriver driver;

	@Test
	public void verifyHomeScreen() {
		// Wait for the app to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement homeTitle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.example:id/homeTitle")));

		// Verify the home screen title
		Assert.assertEquals(homeTitle.getText(), "Welcome Home", "Home screen title is incorrect!");
		System.out.println("Home screen verified successfully!");
		// public class AndroidTest extends BaseTest {

		/*
		 * @Test(groups = {TestGroups.ANDROID}) public void testLogText() { String
		 * logText = new APIDemosHomePage(this.driver) .openText() .tapOnLogTextBox()
		 * .tapOnAddButton() .getLogText();
		 * 
		 * Assert.assertEquals(logText, "This is a test"); }
		 */
	}

}
