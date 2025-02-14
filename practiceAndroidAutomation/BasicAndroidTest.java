package practiceAndroidAutomation;
//import io.appium.java_client.MobileElement;

//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BasicAndroidTest { 
   // public AndroidDriver<MobileElement> driver;

	public void launchAppiumDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		//AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://target_ip:used_port/wd/hub"),
		//		capabilities);
	}

	/*
	 * public static void caps() { // public static void main(String[] args) throws
	 * Exception { DesiredCapabilities capabilities = new DesiredCapabilities();
	 * capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 * capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
	 * capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
	 * "Android Emulator"); capabilities.setCapability(MobileCapabilityType.APP,
	 * "path/to/app.apk");
	 * capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
	 * "UiAutomator2");
	 * 
	 * // Start Appium Driver AppiumDriver<MobileElement> driver = new
	 * AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 * 
	 * // Your test code here
	 * 
	 * driver.quit();
	 *//**
		 * Real Device vs. Emulator/Simulator: The configuration for real devices may
		 * require additional settings such as the udid for Android devices or
		 * deviceName for iOS devices. You can also configure capabilities for specific
		 * emulators and simulators. Platform-Specific Capabilities: Many capabilities
		 * are platform-specific, such as appPackage/appActivity for Android and
		 * bundleId for iOS. Appium Server: Ensure that the Appium server is running
		 * before executing tests. The server should be running at a specific address
		 * (typically http://127.0.0.1:4723/wd/hub).
		 *//*
			 * }
			 */
}
