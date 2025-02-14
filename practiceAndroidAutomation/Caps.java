package practiceAndroidAutomation;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Caps {
//public static String platform;
	// String os.equals("android");
	public static void capabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String os = "web";
		if (os.equals("android")) {
		//	DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android"); // Platform for mobile app (Android)
			capabilities.setCapability("platformVersion", "13.0"); // Version of Android OS
			capabilities.setCapability("deviceName", "Android Emulator"); // Name of the Android device
			capabilities.setCapability("udid", "emulator-5554"); // Unique device ID (for real device)
			capabilities.setCapability("app", "path/to/app.apk"); // Path to the APK file of the app
			capabilities.setCapability("appPackage", "com.example.app"); // The package name of the app
			capabilities.setCapability("appActivity", "com.example.app.Main"); // The main activity of the app
			capabilities.setCapability("noReset", true); // Don't reset app state between sessions
			capabilities.setCapability("fullContextList", true); // Enable the list of contexts
			capabilities.setCapability("automationName", "UiAutomator2"); // Use UiAutomator2 automation engine
			capabilities.setCapability("autoGrantPermissions", true); // Automatically grant permissions on app start

		}
		if (os.equals("ios")) {
		//	DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "iOS"); // Platform for mobile app (iOS)
			capabilities.setCapability("platformVersion", "14.4"); // Version of iOS
			capabilities.setCapability("deviceName", "iPhone 12"); // Name of the iOS device
			capabilities.setCapability("udid", "auto"); // Unique device ID (for real device, use real UDID)
			capabilities.setCapability("app", "path/to/app.ipa"); // Path to the IPA file of the app
			capabilities.setCapability("bundleId", "com.example.app"); // The bundle identifier of the app
			capabilities.setCapability("xcodeOrgId", "YOUR_XCODE_ORG_ID"); // Xcode organization ID
			capabilities.setCapability("xcodeSigningId", "iPhone Developer"); // Signing identity for app
			capabilities.setCapability("noReset", true); // Don't reset app state between sessions
			capabilities.setCapability("automationName", "XCUITest"); // Use XCUITest automation engine
			capabilities.setCapability("autoAcceptAlerts", true); // Automatically accept alerts
			capabilities.setCapability("autoDismissAlerts", true); // Automatically dismiss alerts

		}
		else {
			//DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appiumVersion", "1.20.2");        // Appium version
			capabilities.setCapability("newCommandTimeout", 300);          // Timeout for waiting for a new command
			capabilities.setCapability("deviceReadyTimeout", 300);         // Device ready timeout
			capabilities.setCapability("platformName", "Android");         // or "iOS"
			capabilities.setCapability("noReset", true);                   // Retain app state between sessions
			capabilities.setCapability("autoGrantPermissions", true);      // Auto-grant permissions on app launch
			capabilities.setCapability("enablePerformanceLogging", true);  // Enable performance logging
			capabilities.setCapability("orientation", "PORTRAIT");         // Set initial orien
		}
	}
}