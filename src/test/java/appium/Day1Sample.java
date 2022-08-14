package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Day1Sample {
	
	 private AndroidDriver driver;

	 
	// public class SampleTest {

	 //  private AndroidDriver driver;

	   @Before
	   public void setUp() throws MalformedURLException {
	     DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	     desiredCapabilities.setCapability("platformName", "android");
	     desiredCapabilities.setCapability("appium:platformVersion", "7");
	     desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	     desiredCapabilities.setCapability("appium:app", "D:\\ApiDemos-debug.apk");
	     desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	     desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	     desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	     desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	     URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	     driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	   }

	   @Test
	   public void sampleTest() {
	     MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Views");
	     el2.click();
	     MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Buttons");
	     el3.click();
	     MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Small");
	     el4.click();
	   }

	   @After
	   public void tearDown() {
	     driver.quit();
	   }
	   
	 }

	 
