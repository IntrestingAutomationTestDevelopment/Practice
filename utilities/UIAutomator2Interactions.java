/*
 * package utilities; import io.appium.java_client.AppiumDriver; import
 * io.appium.java_client.TouchAction; import
 * io.appium.java_client.android.AndroidDriver; //import
 * io.appium.java_client.touch.action.TapOptions; import
 * io.appium.java_client.touch.offset.PointOption; import
 * io.appium.java_client.touch.LongPressOptions; import
 * io.appium.java_client.touch.WaitOptions; import
 * io.appium.java_client.touch.offset.PointOption; import
 * io.appium.java_client.touch.offset.ElementOption; //import
 * io.appium.java_client.WebElement; import io.appium.java_client.TouchAction;
 * import io.appium.java_client.touch.WaitOptions; //import
 * io.appium.java_client.touch.action.TapOptions; import
 * io.appium.java_client.touch.offset.PointOption; import java.time.Duration;
 * 
 * import org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.remote.RemoteWebElement; import
 * io.appium.java_client.PointerInput; import
 * io.appium.java_client.touch.offset.PointOption; import
 * io.appium.java_client.MobileElement; import org.openqa.selenium.By; import
 * org.openqa.selenium.Dimension; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; public class UIAutomator2Interactions{
 * 
 * public static void tapAction() {
 * 
 * 
 * // public static void main(String[] args) throws Exception { // Driver setup
 * AndroidDriver driver = new AndroidDriver(new
 * URL("http://127.0.0.1:4723/wd/hub"), capabilities); //MobileElement
 * WebElement element = driver.findElement(By.id("element_id"));
 * 
 * // Perform tap action using PointerEvent PointerInput finger = new
 * PointerInput(PointerInput.Kind.TOUCH, "finger"); driver.perform(
 * finger.createPointerMove(Duration.ofMillis(0), PointOption.point(100, 500))
 * .createPointerDown(PointerInput.Button.LEFT)
 * .createPointerUp(PointerInput.Button.LEFT) );
 * 
 * driver.quit(); // }
 * 
 * 
 * } public static void swipeAction() { PointOption startPoint =
 * PointOption.point(100, 500); PointOption endPoint = PointOption.point(100,
 * 100);
 * 
 * 
 * PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
 * driver.perform( finger.createPointerMove(Duration.ofMillis(0), startPoint)
 * .createPointerDown(PointerInput.Button.LEFT)
 * .createPointerMove(Duration.ofMillis(1000), endPoint) // The duration for
 * swipe .createPointerUp(PointerInput.Button.LEFT) );
 * 
 * } public static void test() { WebDriver driver = // Setup your driver here
 * 
 * // Scroll down by swiping PointOption startPoint = PointOption.point(200,
 * 800); // Starting point PointOption endPoint = PointOption.point(200, 400);
 * // End point for scroll
 * 
 * PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
 * driver.perform( finger.createPointerMove(Duration.ofMillis(0), startPoint)
 * .createPointerDown(PointerInput.Button.LEFT)
 * .createPointerMove(Duration.ofMillis(1000), endPoint) // Scroll duration
 * .createPointerUp(PointerInput.Button.LEFT) }
 * 
 * AppiumDriver driver; public static void tap() { // Create a TouchAction
 * instance TouchAction action = new TouchAction(driver);
 * 
 * // Perform a tap on a specific coordinate action.tap(PointOption.point(100,
 * 200)).perform(); }
 * 
 * @SuppressWarnings("deprecation") public static void longPress(AppiumDriver
 * driver,RemoteWebElement element) { try { Actions action = new
 * Actions(driver);
 * 
 * action.longPress(LongPressOptions.longPressOptions()
 * .withElement(ElementOption.element(element))
 * .withDuration(Duration.ofSeconds(2))) .release() .perform(); } catch
 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); } }
 * 
 * 
 * public static void swipe(AppiumDriver driver,RemoteWebElement element) {
 * Actions action = new Actions(driver);
 * 
 * // Perform a swipe gesture from one point to another
 * 
 * action.press(PointOption.point(300, 500)) // Starting point
 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Pause before
 * moving .moveTo(PointOption.point(300, 1000)) // Ending point .release()
 * .perform(); }
 * 
 * public static void dragAndDrop(AppiumDriver driver) { Actions action = new
 * Actions(driver); // Drag an element from one location to another
 * action.press(ElementOption.element(sourceElement))
 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
 * .moveTo(ElementOption.element(targetElement)) .release() .perform();
 * 
 * }
 * 
 * 
 * public void performGestures(AppiumDriver driver) { WebElement element =
 * driver.findElementById(""); TouchAction action = new TouchAction(driver);
 * 
 * // Tap on a button WebElement button =
 * driver.findElementById("com.example:id/button");
 * action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button))
 * ).perform();
 * 
 * // Long press on an element WebElement element =
 * driver.findElementById("com.example:id/element");
 * action.longPress(LongPressOptions.longPressOptions()
 * .withElement(ElementOption.element(element))
 * .withDuration(Duration.ofSeconds(2))) .release() .perform();
 * 
 * // Swipe from point A to B action.press(PointOption.point(100, 500))
 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
 * .moveTo(PointOption.point(300, 500)) .release() .perform(); }
 * 
 * 
 * }
 * 
 * 
 * package utilities;
 * 
 * import org.openqa.selenium.WebElement;
 * 
 * import io.appium.java_client.AppiumDriver; import
 * io.appium.java_client.TouchAction; import
 * io.appium.java_client.touch.TapOptions; import
 * io.appium.java_client.touch.offset.ElementOption;
 * 
 * public class UIAutomator2Interactions {
 * 
 * WebElement element; AppiumDriver driver;
 *//**
	 * Touch Action
	 */
/*
 * 
 * @SuppressWarnings("rawtypes") TouchAction action = new TouchAction(driver);
 * TouchAction((AndroidDriver)driver).longPress(longPressOptions().withElement((
 * ElementOption) point(xPoint, yPoint)).
 * withDuration(Duration.ofMillis(duration))).release().perform(); touch(){
 * .release().perform(); }
 * 
 * public static void swipe(WebElement element){ .release().perform(); } public
 * static void touchAction(WebElement element) { element =
 * getDriver().findElement(By.xpath("//*[@text='(+)']"));
 * 
 * new TouchAction(getDriver()) .tap(TapOptions.tapOptions()
 * .withElement(ElementOption.element(botao, -500, -100))) .release()
 * .perform(); }
 * 
 *//**
	 * Mobile Element
	 * 
	 * @param element
	 *//*
		 * public static void tap(WebElement element,String button){ element =
		 * driver.findElementByXpath(element);
		 * action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button))
		 * ).perform();
		 * 
		 * // .release().perform(); }
		 * 
		 * public static void doubletap(WebElement element){ .release().perform(); } }
		 * 
		 * 
		 * import io.appium.java_client.WebElement; import
		 * io.appium.java_client.TouchAction; import
		 * io.appium.java_client.touch.WaitOptions; import
		 * io.appium.java_client.touch.action.TapOptions; import
		 * io.appium.java_client.touch.offset.PointOption; import java.time.Duration;
		 * 
		 * public void performGestures() { TouchAction action = new TouchAction(driver);
		 * 
		 * // Tap on a button WebElement button =
		 * driver.findElementById("com.example:id/button");
		 * action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button))
		 * ).perform();
		 * 
		 * // Long press on an element WebElement element =
		 * driver.findElementById("com.example:id/element");
		 * action.longPress(LongPressOptions.longPressOptions()
		 * .withElement(ElementOption.element(element))
		 * .withDuration(Duration.ofSeconds(2))) .release() .perform();
		 * 
		 * // Swipe from point A to B action.press(PointOption.point(100, 500))
		 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		 * .moveTo(PointOption.point(300, 500)) .release() .perform(); }
		 */