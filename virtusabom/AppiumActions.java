package virtusabom;

import org.glassfish.jaxb.core.v2.model.core.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

//public class MobileAutomationTest {

//}

public class AppiumActions {
	public static AndroidDriver driver;
	
	public static void swipe() {
	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); 

	Sequence swipe = new Sequence(finger, 1); 
	swipe.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), 500, 1500)); 
	swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); 
	swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 500, 500)); 
	swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	driver.perform(Collections.singletonList(swipe));
	
	}
	
	public static void driverSetup() throws Exception{
        URI uri = new URI("http://127.0.0.1:4723/wd/hub");
        URL url = uri.toURL();
		DesiredCapabilities caps = new DesiredCapabilities();
        driver = new AndroidDriver(url, caps);
	}
	
	

	public static void coordinatesTap() {
		
		try {
			WebElement element = driver.findElement(By.id("elementId"));
			new TouchAction(driver).tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("app", "/path/to/your/app.apk");
		// Perform actions on the mobile app
	}

}
