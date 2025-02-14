package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass {
    
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver before any tests are run
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Example: Initialize ChromeDriver (can be switched to FirefoxDriver, etc.)
        driver = new ChromeDriver();
        
        // Other setup tasks (e.g., load configuration, initialize logging, etc.)
        System.out.println("Setup for test execution.");
    }

    @BeforeMethod
    public void beforeMethod() {
        // Code to run before each test (e.g., open the app, navigate to a URL)
        driver.get("https://example.com");
    }

    @AfterMethod
    public void afterMethod() {
        // Code to run after each test (e.g., clear cookies, take screenshots, etc.)
        System.out.println("Test completed.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser and clean up resources after all tests
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Teardown complete.");
    }
}
