package practiceAndroidAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
//public class BaseTest {
//import constants.Target;
//import core.driver.DriverManager;
//import core.utils.PropertiesReader;
//import exceptions.PlatformNotSupportException;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.annotation.Target;
import java.sql.DriverManager;

public class BaseTest {
	protected AppiumDriver driver;
	// private AndroidDriver<WebElement> driver;

//	protected PropertiesReader reader = new PropertiesReader();

	/*
	 * @BeforeMethod(alwaysRun = true) public void setup(ITestContext context) {
	 * //context.setAttribute("target", reader.getTarget());
	 * 
	 * try { target = (Target) context.getAttribute("target"); this.driver = new
	 * DriverManager().getInstance(target); } catch (IOException |
	 * PlatformNotSupportException e) { e.printStackTrace(); }
	 * 
	 * }
	 */
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Desired Capabilities for Android
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Pixel_4"); // Replace with your real device name
		caps.setCapability("platformVersion", "12.0"); // Replace with your Android version
		caps.setCapability("appPackage", "com.example.myapp"); // Replace with your app's package name
		caps.setCapability("appActivity", "com.example.myapp.MainActivity"); // Replace with your app's main activity
		caps.setCapability("noReset", true); // Keeps app state between tests
		caps.setCapability("udid", "emulator-5554"); // Replace with your device UDID
		caps.setCapability("automationName", "UiAutomator2");

		// Initialize Android Driver
		// driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit(); // Close the driver and clean up
		}
	}
}

//}
//}
