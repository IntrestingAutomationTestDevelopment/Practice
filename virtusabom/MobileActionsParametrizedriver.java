package virtusabom;

	//import io.appium.java_client.WebElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.ios.IOSDriver;
	import io.appium.java_client.TouchAction;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import java.net.URL;
	//import io.appium.java_client.WebElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.ios.IOSDriver;
	import io.appium.java_client.TouchAction;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import java.net.URL;
	public class MobileActionsParametrizedriver {

	    private AndroidDriver driverAndroid;
	    private IOSDriver driverIOS;

	   // private AndroidDriver driverAndroid;
	   // private IOSDriver driverIOS;

	    // Constructor for Android
	    public MobileActionsParametrizedriver(AndroidDriver driver) {
	        this.driverAndroid = driver;
	    }

	    // Constructor for iOS
	    public MobileActionsParametrizedriver(IOSDriver driver) {
	        this.driverIOS = driver;
	    }

	    // Perform Tap Action (For Android and iOS)
	    /*public void tap(WebElement element) {
	        new TouchAction<AndroidDriver>(driverAndroid).tap(element).perform(); // For Android
	        new TouchAction<IOSDriver>(driverIOS).tap(element).perform();    // For iOS
	    }
*/
	    // Perform Swipe Action (For Android and iOS)
	    /*public void swipe(WebElement startElement, WebElement endElement) {
	        new TouchAction<AndroidDriver>(driverAndroid)
	            .press(startElement)
	            .moveTo(endElement)
	            .release()
	            .perform(); // Android swipe

	        new TouchAction<IOSDriver>(driverIOS)
	            .press(startElement)
	            .moveTo(endElement)
	            .release()
	            .perform(); // iOS swipe
	    }*/

	    // Perform Scroll Action (For Android and iOS)
	  /*  public void scroll(int startX, int startY, int endX, int endY) {
	        new TouchAction<AndroidDriver>(driverAndroid)
	            .press(startX, startY)
	            .moveTo(endX, endY)
	            .release()
	            .perform(); // Android scroll

	        new TouchAction<IOSDriver>(driverIOS)
	            .press(startX, startY)
	            .moveTo(endX, endY)
	            .release()
	            .perform(); // iOS scroll
	    }*/

	    // Perform Long Press (For Android and iOS)
	   /* public void longPress(WebElement element) {
	        new TouchAction<AndroidDriver>(driverAndroid)
	            .longPress(element)
	            .release()
	            .perform(); // Android long press

	        new TouchAction<IOSDriver>(driverIOS)
	            .longPress(element)
	            .release()
	            .perform(); // iOS long press
	    }
*/
	    // Scroll to an Element (For Android)
	    public void scrollToElement(WebElement element) {
	       // driverAndroid.findElement(By.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + element.getText() + "\"))"));
	    }

	    // Scroll to an Element (For iOS)
	    public void scrollToElementIOS(WebElement element) {
	      //  driverIOS.findElement(By.iOSUIAutomation("mobile.scrollToElement(" + element.getText() + ")"));
	    }

	    // Handling Drop-down (For Android)
	    public void selectDropDown(AndroidDriver driver, String visibleText) {
	        driver.findElement(By.xpath("//android.widget.Spinner")).click();
	        WebElement selectedOption = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + visibleText + "']"));
	        selectedOption.click();
	    }

	    // Handling Radio Button (Click based on label)
	    public void selectRadioButton(WebElement radioButton) {
	        radioButton.click(); // Android/iOS both support this
	    }

	    // Handling Checkbox (Click to toggle)
	    public void selectCheckBox(WebElement checkBox) {
	        checkBox.click(); // Android/iOS both support this
	    }

	    // Handling Text Input Field
	    public void sendKeysToField(WebElement inputField, String text) {
	        inputField.clear();
	        inputField.sendKeys(text);
	    }

	    // Click Action
	    public void click(WebElement element) {
	        element.click();
	    }
	}


