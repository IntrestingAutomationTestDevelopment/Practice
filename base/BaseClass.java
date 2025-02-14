package base;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	
	@BeforeSuite
	public void setUp(String platformName ) {
		
		if(platformName.equals("Android")) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2");
		}
		
		else if(platformName.equals("iOS")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("automationName", "XCUITest");

		}
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("deviceName", "Android Emulator");
		  capabilities.setCapability("app", "path/to/app.apk");
		 /**
		  * Update the app path
		  */

	}
	@AfterSuite
	public void tearDown() {
		
	}
}