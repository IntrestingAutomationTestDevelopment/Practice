package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileInteractions {
	static AppiumDriver driver;
	// AppiumWebDriver awd = new AppiumWebDriver
	// AppiumDriver<MobileElement> driver;
	// AndroidDriver<MobileElement> driver = null;

	/**
	 * TouchAction is Depriciated
	 */
	
	/*
	 * public static void singleTap() {
	 * 
	 * 
	 * AndroidDriver<MobileElement> driver = new AndroidDriver<>(new
	 * URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 * 
	 * WebElement element = driver.findElement(By.id("element_id")); // Replace with
	 * actual locator
	 * 
	 * // Perform single tap TouchAction touchAction = new TouchAction(driver);
	 * touchAction.tap(tap -> tap.withElement(() -> element)).perform();
	 * 
	 * driver.quit(); }
	 */
	
	public static void longClick_Android(WebElement element) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}

	public static void click_Android(WebElement element) {
		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}

	public static void dragGesture_Android(WebElement element) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "endX", 100,
		    "endY", 100
		));
	}

	public static void pinchCloseGesture_Android(WebElement element) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", 0.75
		));
	}

	public static void swipeGesture_Android(WebElement element) {
	// Java
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "left",
		    "percent", 0.75
		));
	}

	public static void scrollGesture_Android(WebElement element) {
		// Java
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 1.0
		    ));
	}
	
}