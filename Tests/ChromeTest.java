package Tests;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.io.File;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.remote.DesiredCapabilities;
	//import io.appium.java_client.MobileElement;
	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;

	public class ChromeTest {
		protected AppiumDriver driver;
	    public static void main(String[] args) {
		    

	        //Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Xiaomi 11i");
	        caps.setCapability("udid", "hivgv47twgpviznj"); //Give Device ID of your mobile phone
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("platformVersion", "13.0");
	        caps.setCapability("browserName", "Chrome");
	        caps.setCapability("noReset", true);

	        //Set ChromeDriver location
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\mobileautomation\\src\\test\\resources\\vendor\\chrome-win32");

	        //Instantiate Appium Driver
	       // AndroidDriver<MobileElement> driver = null;
	        try {
	            //driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

	        } //MalformedURL
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        //Open URL in Chrome Browser
	    //    driver.get("http://www.google.com");
	    }
	}

