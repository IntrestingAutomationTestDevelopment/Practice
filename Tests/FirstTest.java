package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstTest {

	static AppiumDriver driver;

	public static void main(String[] args) {

		try {
			openTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void openTest() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Xiaomi 11i");
		cap.setCapability("udid", "hivgv47twgpviznj");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.miui.home");
		cap.setCapability("appActivity", "com.merriamwebster");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver(url, cap);

		System.out.println("Application Start...");

		WebElement three = driver.findElement(By.xpath("//android.widget.Button[@text='Some text']"));

	}
}
