package Tests;

	import io.appium.java_client.AppiumDriver;
//	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
//	import io.appium.java_client.MobileElement;
//	import io.appium.java_client.remote.MobileCapabilityType;
//	import io.appium.java_client.remote.MobilePlatform;

	import java.net.MalformedURLException;
	import java.net.URL;

	public class AndroidAutomationTest {
	    protected AppiumDriver driver;

	    //private AppiumDriver<MobileElement> driver;

	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	        // Set up desired capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("platformVersion", "10"); // Replace with your device version
	        caps.setCapability("deviceName", "emulator-5554"); // Replace with your device name
	        caps.setCapability("appPackage", "com.example.android"); // Replace with your app's package name
	        caps.setCapability("appActivity", "com.example.android.MainActivity"); // Replace with your app's main activity

	        // Initialize the AndroidDriver
	       // AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://target_ip:used_port/wd/hub"), capabilities);
	      //  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	    }

	    @Test
	    public void testExampleApp() {
	        // Find an element and interact with it
	       // MobileElement button = driver.findElementById("com.example.android:id/button"); // Replace with actual element ID
	       // button.click();

	        // Verify the result
	        //MobileElement resultText = driver.findElementById("com.example.android:id/resultText"); // Replace with actual element ID
	        //Assert.assertEquals(resultText.getText(), "Expected Result"); // Replace with expected text
	        
	        
	    }

	    // Clean up after tests
	    @Test
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


