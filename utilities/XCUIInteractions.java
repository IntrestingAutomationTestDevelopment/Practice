package utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class XCUIInteractions {
	static AppiumDriver driver;

	public static void swipeUpThenDown() {
		Map<String, Object> args = new HashMap<>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);
		args.put("direction", "down");
		driver.executeScript("mobile: swipe", args);
	}
	
	public static void scrollDownThenUp() {
		Map<String, Object> args = new HashMap<>();
		args.put("direction", "down");
		driver.executeScript("mobile: scroll", args);
		args.put("direction", "up");
		driver.executeScript("mobile: scroll", args);
	}
	/**
	 * Scroll To Last Item In the List
	 */
	public static void scrollToLastElement(String[] args) {
		//args.put("direction", "down");
		//args.put("name", "Stratus");
		driver.executeScript("mobile: scroll", args);
	}
	/**
	 * Scroll To First Item In the List
	 */
	public static void scrollToFirstElement(String[] args) {
		//MobileElement list = (MobileElement) driver.findElement(By.className("XCUIElementTypeScrollView"));
		WebElement element ;
	//	args.put("direction", "up");
	//	args.put("name", null);
		//args.put("element", list.getId());
		driver.executeScript("mobile: scroll", args);
	}
	/**
	 * Pinch or Zoom IN
	 */
	public static void pinch(String[] args) {
	//Map<String, Object> args = new HashMap<>();
	//args.put("scale", 5);
	driver.executeScript("mobile: pinch", args);
	}
	/**
	 * Tap On Element Very Near its top left corner 
	 */
	public static void mobileTap(WebElement element) {
	Map<String, Object> args = new HashMap<>();
	//args.put("element", ((MobileElement) element).getId());
	args.put("x", 2);
	args.put("y", 2);
	driver.executeScript("mobile: tap", args);
	}
	/**
	 * Double Tap
	 */
	public static void doubleTap() {
	// double-tap the screen at a specific point
	Map<String, Object> args = new HashMap<>();
	args.put("x", 100);
	args.put("y", 200);
	driver.executeScript("mobile: doubleTap", args);
	}
	
	/**
	 * Two Finger Tap
	 */
	public static void twoFingerTap(WebElement element) {
	// two-finger-tap an element (assume element object already exists)
	Map<String, Object> args = new HashMap<>();
	//args.put("element", ((MobileElement) element).getId());
	driver.executeScript("mobile: twoFingerTap", args);
	}
	
	/**
	 * Touch and Hold
	 */
	public static void touchAndHold(WebElement element) {
	// touch and hold an element
	Map<String, Object> args = new HashMap<>();
	//args.put("element", ((MobileElement) element).getId());
	args.put("duration", 1.5);
	driver.executeScript("mobile: touchAndHold", args);
	}
	public static void dragFromToForDuration() {
		// touch, hold, and drag based on coordinates
		Map<String, Object> args = new HashMap<>();
		args.put("duration", 1.5);
		args.put("fromX", 100);
		args.put("fromY", 100);
		args.put("toX", 300);
		args.put("toY", 600);
		driver.executeScript("mobile: dragFromToForDuration", args);
	}
	
	
}


